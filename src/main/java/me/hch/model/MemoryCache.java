package me.hch.model;

import me.hch.mvc.model.HospitalEntity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hch on 2014/5/18.
 */
public class MemoryCache {
    // singleton
    private static MemoryCache ins = new MemoryCache();

    private MemoryCache() {
    }

    ;

    public static MemoryCache getInstance() {
        return ins;
    }

    private Map<String, HospitalEntity> hospitals = new HashMap<String, HospitalEntity>();

    private Map<String, Map<String, Schedule>> schedules = new HashMap<String, Map<String, Schedule>>();

    public void addHospital(HospitalEntity hos) {
        hospitals.put(hos.getId(), hos);
    }

    public HospitalEntity getHospital(String hosId) {
        return hospitals.get(hosId);
    }

    public void setSchedules(String hospitalId, Map<String, Schedule> schedules) {
        if (!this.schedules.containsKey(hospitalId)) {
            this.schedules.put(hospitalId, new HashMap<String, Schedule>());
        }

        this.schedules.get(hospitalId).clear();
        this.schedules.put(hospitalId, schedules);
    }

    public Map<String, Schedule> getSchedules(String hosId) {
        return this.schedules.get(hosId);
    }
}
