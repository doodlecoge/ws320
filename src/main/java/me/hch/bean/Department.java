package me.hch.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hch on 2014/5/11.
 */
public class Department {
    private Hospital hospital;

    private String id;
    private String name;
    private String introduction;
    private String type;
    private String registryFee;
    private String clinicFee;
    private String MZKS;
    private String departsex;
    private String babyFlag;
    private String babyAge;

    private Map<String, Doctor> doctors = new HashMap<String, Doctor>();
    private Map<String, Schedule> schedules = new HashMap<String, Schedule>();

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRegistryFee() {
        return registryFee;
    }

    public void setRegistryFee(String registryFee) {
        this.registryFee = registryFee;
    }

    public String getClinicFee() {
        return clinicFee;
    }

    public void setClinicFee(String clinicFee) {
        this.clinicFee = clinicFee;
    }

    public String getMZKS() {
        return MZKS;
    }

    public void setMZKS(String MZKS) {
        this.MZKS = MZKS;
    }

    public String getDepartsex() {
        return departsex;
    }

    public void setDepartsex(String departsex) {
        this.departsex = departsex;
    }

    public String getBabyFlag() {
        return babyFlag;
    }

    public void setBabyFlag(String babyFlag) {
        this.babyFlag = babyFlag;
    }

    public String getBabyAge() {
        return babyAge;
    }

    public void setBabyAge(String babyAge) {
        this.babyAge = babyAge;
    }

    public Map<String, Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(Map<String, Doctor> doctors) {
        this.doctors = doctors;
    }

    public Map<String, Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(Map<String, Schedule> schedules) {
        this.schedules = schedules;
    }
}
