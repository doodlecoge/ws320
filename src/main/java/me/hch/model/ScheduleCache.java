package me.hch.model;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.ArrayList;
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

    /*------------------------------------------------------------------------*/

    public String toString() {
        StringBuilder sb = new StringBuilder();

        Map<String, List<Schedule>> scheduleMap =
                new HashMap<String, List<Schedule>>();

        for (Schedule schedule : schedules.values()) {
            String key = schedule.DepartId;
            if (schedule.DoctorId != null) key += "_" + schedule.DoctorId;

            if (!scheduleMap.containsKey(key)) {
                scheduleMap.put(key, new ArrayList<Schedule>());
            }

            scheduleMap.get(key).add(schedule);
        }

        Map<String, List<DoctorInfo>> doctorMap =
                new HashMap<String, List<DoctorInfo>>();

        for (DoctorInfo doctorInfo : doctors.values()) {
            String key = doctorInfo.DepartId;
            if (!doctorMap.containsKey(key)) {
                doctorMap.put(key, new ArrayList<DoctorInfo>());
            }
            doctorMap.get(key).add(doctorInfo);
        }

        // construct xml
        for (DepartInfo departInfo : departs.values()) {
            sb.append("<dpt>").append(departInfo.DepartName);

            List<DoctorInfo> docList = doctorMap.get(departInfo.DepartId);
            if (docList != null && docList.size() > 0) {
                for (DoctorInfo docInfo : docList) {
                    sb.append("<doc>").append(docInfo.DoctorName);

                    String key = docInfo.DepartId + "_" + docInfo.DoctorId;
                    List<Schedule> docScheList = scheduleMap.get(key);

                    if (docScheList != null && docScheList.size() > 0) {
                        for (Schedule schedule : docScheList) {
                            sb.append("<sche>").append(schedule.WorkDate)
                                    .append(",").append(schedule.WorkType)
                                    .append("</sche>");
                        }
                    }

                    sb.append("</doc>");
                }
            }


            List<Schedule> docScheList = scheduleMap.get(departInfo.DepartId);

            if (docScheList != null && docScheList.size() > 0) {
                for (Schedule schedule : docScheList) {
                    sb.append("<sche>").append(schedule.WorkDate)
                            .append(",").append(schedule.WorkType)
                            .append("</sche>");
                }
            }

            sb.append("</dpt>");
        }

        return sb.toString();
    }

}
