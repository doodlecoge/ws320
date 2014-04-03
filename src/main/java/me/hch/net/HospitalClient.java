package me.hch.net;

import me.hch.model.Department;
import me.hch.model.Doctor;
import me.hch.model.Schedule;

import java.util.List;

/**
 * Created by huaiwang on 14-4-3.
 */
public class HospitalClient {
    private final String hospitalCode;

    private HospitalClient(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    public static HospitalClient getInstance(String hospitalCode) {
        return new HospitalClient(hospitalCode);
    }

    /**
     * **************************************************
     */

    public List<Department> getDepartments() {
        return null;
    }

    public List<Doctor> getDoctors() {
        return null;
    }

    public List<Schedule> getDepartmentSchedule() {
        return null;
    }

    public List<Schedule> getDoctorSchedule() {
        return null;
    }
}
