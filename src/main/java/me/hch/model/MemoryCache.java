package me.hch.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.hch.Ws320Exception;
import me.hch.bean.Depart;
import me.hch.bean.Hospital;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by huaiwang on 14-3-25.
 */
public class MemoryCache {
    private static final Logger log = LoggerFactory.getLogger(MemoryCache.class);
    // id => Hospital
    private Map<String, Hospital> hospitals = new HashMap<String, Hospital>(0);
    private Map<String, String> idNameMapper = new HashMap<String, String>();
    public Map<String, String> wsdls = new HashMap<String, String>();

    private static final MemoryCache ins = new MemoryCache();

    private MemoryCache() {
    }

    public static MemoryCache getInstance() {
        return ins;
    }

    public void addHospital(HospitalEntity entity) {
        Hospital.HospBasic basic = new Hospital.HospBasic();
        basic.setAddress(entity.getAddress());
        basic.setGrade(entity.getGrade());
        basic.setIntro(entity.getIntro());
        basic.setPhone(entity.getPhone());
        basic.setKind(entity.getKind());

        Hospital hospital = new Hospital();
        hospital.setHospName(entity.getName());
        hospital.setHospBasic(basic);


        String hospName = hospital.getHospName();

        if (hospitals.containsKey(hospName)) {
            throw new Ws320Exception("duplicate: " + hospName);
        } else {
            hospitals.put(hospName, hospital);
        }

        idNameMapper.put(entity.getId(), hospName);
        wsdls.put(entity.getId(), entity.getWsdl());
    }

    public String getNameById(String id) {
        return idNameMapper.get(id);
    }


    // clear departments infos
    public void clearCache(String hospitalId) {
        if (hospitalId.contains(hospitalId)) {
            hospitals.get(hospitalId).getDepart().clear();
        } else {
            log.warn("hospital id [" + hospitalId + "] does not exists");
        }
    }


    public void addDeparts(String hospName, List<Depart> departList) {
        List<Depart> departs = hospitals.get(hospName).getDepart();
        departs.clear();
        departs.addAll(departList);
    }

    public void addDeparts(String hospName, Depart depart) {
        hospitals.get(hospName).getDepart().add(depart);
    }
}
