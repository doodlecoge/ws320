package me.hch.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.hch.Ws320Exception;
import me.hch.bean.Hospital;

/**
 * Created by huaiwang on 14-3-25.
 */
public class MemoryCache {
    private Map<String, Hospital> hospitals = new HashMap<String, Hospital>(0);

    private static final MemoryCache ins = new MemoryCache();

    private MemoryCache() {
    }

    public static MemoryCache getInstance() {
        return ins;
    }

    public void addHospital(Hospital hospital) {
        String hospName = hospital.getHospName();
        hospName = hospName == null ? null : hospName.trim();

        if (hospName == null || hospName.equals("")) {
            throw new Ws320Exception("hospital name not supplied");
        }

        hospital.getDepart().clear();

        if (hospitals.containsKey(hospName)) {
            throw new Ws320Exception("duplicate: " + hospName);
        } else {
            hospitals.put(hospName, hospital);
        }
    }

    public void addDeparts(List<DepartInfo> departInfos) {
        for (DepartInfo departInfo : departInfos) {

        }
    }
}
