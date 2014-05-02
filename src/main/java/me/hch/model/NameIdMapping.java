package me.hch.model;

import me.hch.Ws320Exception;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hch on 2014/5/2.
 */
public class NameIdMapping {
    private static final NameIdMapping ins = new NameIdMapping();
    private Map<String, TheWrapper> hospitals = new HashMap<String, TheWrapper>();


    private NameIdMapping() {
    }

    public static NameIdMapping getInstance() {
        return ins;
    }

    public void addHospital(String name, String id) {
        TheWrapper wrapper = new TheWrapper();
        wrapper.hospitalId = id;
        hospitals.put(name, wrapper);
    }

    public void removeHospital(String name) {
        if (hospitals.containsKey(name))
            hospitals.remove(name);
    }

    public void addDepartment(String hospitalName, String departmentName, String id) {
        if (!hospitals.containsKey(hospitalName)) {
            throw new Ws320Exception("hospital " + hospitalName + " not found");
        }
        hospitals.get(hospitalName).addDepartment(departmentName, id);
    }

    public String getDepartmentId(String hospitalName, String departmentName) {
        if (!hospitals.containsKey(hospitalName)) {
            throw new Ws320Exception("hospital " + hospitalName + " not found");
        }
        return hospitals.get(hospitalName).getDepartmentId(departmentName);
    }

    public void addDoctor(String hospitalName, String doctorName, String id) {
        if (!hospitals.containsKey(hospitalName)) {
            throw new Ws320Exception("hospital " + hospitalName + " not found");
        }

        hospitals.get(hospitalName).addDoctor(doctorName, id);
    }

    public String getDoctorId(String hospitalName, String doctorName) {
        if (!hospitals.containsKey(hospitalName)) {
            throw new Ws320Exception("hospital " + hospitalName + " not found");
        }
        return hospitals.get(hospitalName).getDoctorid(doctorName);
    }


    public class TheWrapper {
        public String hospitalId;

        // name => <id1>[:<id2>]*, e.g., Tom => 1000:1008,
        // means there are two doctors with same name Tom.
        // the caller should take care that the returned
        // value may contains several ids.
        private Map<String, String> departMap = new HashMap<String, String>();
        private Map<String, String> doctorMap = new HashMap<String, String>();

        public void addDepartment(String name, String id) {
            add(departMap, name, id);
        }

        public void addDoctor(String name, String id) {
            add(doctorMap, name, id);
        }

        private void add(Map<String, String> theMap, String name, String id) {
            // colon is used as id separator, so we not allow it in id.
            // this is not data error, but ... fixme later :<
            if (id.contains(":")) {
                throw new Ws320Exception("id should not contains colon:" + id);
            }

            if (!theMap.containsKey(name)) {
                theMap.put(name, id);
            } else {
                String oids = theMap.get(name);
                theMap.put(name, oids + ":" + id);
            }
        }

        public String getDepartmentId(String name) {
            return get(departMap, name);
        }

        public String getDoctorid(String name) {
            return get(doctorMap, name);
        }

        public String get(Map<String, String> theMap, String name) {
            String ids = theMap.get(name);
            return ids;
        }
    }
}
