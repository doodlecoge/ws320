package me.hch.service;

import me.hch.model.DepartInfo;
import me.hch.model.DoctorInfo;
import me.hch.model.Schedule;

import java.util.List;

/**
 * Created by huaiwang on 14-4-3.
 */
public class HospitalClientImpl {
    private final String hospitalCode;

    private HospitalClientImpl(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    public static HospitalClientImpl getInstance(String hospitalCode) {
        return new HospitalClientImpl(hospitalCode);
    }

    /**
     * **************************************************
     */

    public List<DepartInfo> getDepartments() {
        return null;
    }

    public List<DoctorInfo> getDoctors() {
        return null;
    }

    public List<Schedule> getDepartmentSchedule() {
        return null;
    }

    public List<Schedule> getDoctorSchedule() {
        return null;
    }
}
