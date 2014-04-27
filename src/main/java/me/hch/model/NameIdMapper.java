package me.hch.model;

import me.hch.Ws320Exception;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hch on 2014/4/26.
 */
public class NameIdMapper {


    public class HospitalMapper {
        public String id;
        private Map<String, DepartmentMapper> departments =
                new HashMap<String, DepartmentMapper>();
    }

    public class DepartmentMapper {
        public String id;
        private Map<String, String> doctors =
                new HashMap<String, String>();
    }


    private Map<String, HospitalMapper> hospitals;
    private static NameIdMapper ins;

    {
        hospitals = new HashMap<String, HospitalMapper>();
    }

    private NameIdMapper() {
    }

    public static NameIdMapper getInstance() {
        if (ins == null) {
            ins = new NameIdMapper();
        }

        return ins;
    }


    public void clearHospital(String name) {
        hospitals.remove(name);
    }

    public void clearHospitals() {
        hospitals.clear();
    }


    public void addHospital(String name, String id) {
        HospitalMapper hospitalMapper = new HospitalMapper();
        hospitalMapper.id = id;
        hospitals.put(name, hospitalMapper);
    }

    public void addDepartment(String hospitalName, String departmentName, String id) {
        HospitalMapper hospitalMapper = hospitals.get(hospitalName);
        if (hospitalMapper == null) {
            throw new Ws320Exception("hospital not found: " + hospitalName);
        }
        DepartmentMapper departmentMapper = new DepartmentMapper();
        departmentMapper.id = id;
        hospitalMapper.departments.put(departmentName, departmentMapper);
    }

    public void addDoctor(String hospitalName, String departmentName, String doctorName, String id) {
        HospitalMapper hospitalMapper = hospitals.get(hospitalName);
        if (hospitalMapper == null) {
            throw new Ws320Exception("hospital not found: " + hospitalName);
        }

        DepartmentMapper departmentMapper = hospitalMapper.departments.get(departmentName);
        if (departmentMapper == null) {
            throw new Ws320Exception("department not found: " + hospitalName + ", " + departmentName);
        }

        departmentMapper.doctors.put(doctorName, id);
    }
}
