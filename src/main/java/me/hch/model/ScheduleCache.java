package me.hch.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by huaiwang on 5/26/14.
 */
public class ScheduleCache {
    private final String hospitalId;
    private final Map<String, DepartInfo> departs;
    private final Map<String, DoctorInfo> doctors;
    private final Map<String, Schedule> schedules;
    private final Map<String, Schedule> repScheds;

    public ScheduleCache(String hospitalId) {
        this.hospitalId = hospitalId;
        departs = new ConcurrentHashMap<String, DepartInfo>();
        doctors = new ConcurrentHashMap<String, DoctorInfo>();
        schedules = new ConcurrentHashMap<String, Schedule>();
        repScheds = new ConcurrentHashMap<String, Schedule>();
    }


    /*------------------------------------------------------------------------*/

    public void addDeparts(List<DepartInfo> departInfos) {
        for (DepartInfo departInfo : departInfos) {
            departs.put(departInfo.DepartId, departInfo);
        }
    }

    public Map<String, DepartInfo> getDeparts() {
        return departs;
    }

    public void addDoctors(List<DoctorInfo> doctorInfos) {
        for (DoctorInfo doctorInfo : doctorInfos) {
            doctors.put(doctorInfo.DoctorId, doctorInfo);
        }
    }

    public Map<String, DoctorInfo> getDoctors() {
        return doctors;
    }

    /*------------------------------------------------------------------------*/

    public Map<String, Schedule> getSchedules() {
        return schedules;
    }

    public Map<String, Schedule> getReplacedSchedules() {
        return repScheds;
    }

    public String getHospitalId() {
        return hospitalId;
    }
}
