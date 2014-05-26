package me.hch.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by huaiwang on 5/26/14.
 */
public class ScheduleCache {
    private final String hospitalId;
    private final Map<String, DepartInfo> departs;
    private final Map<String, DoctorInfo> doctors;
    private final Map<String, Schedule> schedules;

    public ScheduleCache(String hospitalId) {
        this.hospitalId = hospitalId;
        departs = new HashMap<String, DepartInfo>();
        doctors = new HashMap<String, DoctorInfo>();
        schedules = new HashMap<String, Schedule>();
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

    public String getHospitalId() {
        return hospitalId;
    }
}
