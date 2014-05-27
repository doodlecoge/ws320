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
        final String ns = "http://service.hch.me";
        Document document = DocumentHelper.createDocument();
        Element elDpts = document.addElement("Departments", ns);

        for (DepartInfo dptInfo : departs.values()) {
            Element elDpt = elDpts.addElement("Department", ns);
            elDpt.addAttribute("name", dptInfo.DepartName);
            // todo: add other attributes for department element


            List<DoctorInfo> docList = doctorMap.get(dptInfo.DepartId);
            if (docList != null && docList.size() > 0) {
                Element elDocs = elDpt.addElement("Doctors", ns);

                for (DoctorInfo docInfo : docList) {
                    Element elDoc = elDocs.addElement("Doctor", ns);
                    elDoc.addAttribute("name", docInfo.DoctorName);
                    // todo: add other attributes for doctor element


                    String key = docInfo.DepartId + "_" + docInfo.DoctorId;
                    List<Schedule> docScheList = scheduleMap.get(key);

                    if (docScheList != null && docScheList.size() > 0) {
                        Element elSches = elDoc.addElement("Schedules", ns);

                        for (Schedule schedule : docScheList) {
                            Element elSche = elSches.addElement("Schedule", ns);
                            Element elWorkDate = elSche.addElement("WorkDate", ns);
                            elWorkDate.addText(schedule.WorkDate);
                            Element elWorkType = elSche.addElement("WorkType", ns);
                            elWorkType.addText(schedule.WorkType);
                        }
                    }
                }
            }


            List<Schedule> docScheList = scheduleMap.get(dptInfo.DepartId);

            if (docScheList != null && docScheList.size() > 0) {
                Element elSches = elDpt.addElement("Schedules", ns);

                for (Schedule schedule : docScheList) {
                    Element elSche = elSches.addElement("Schedule", ns);
                    Element elWorkDate = elSche.addElement("WorkDate", ns);
                    elWorkDate.addText(schedule.WorkDate);
                    Element elWorkType = elSche.addElement("WorkType", ns);
                    elWorkType.addText(schedule.WorkType);
                }
            }
        }

        return document.asXML();
    }

}
