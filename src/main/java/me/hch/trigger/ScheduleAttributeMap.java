package me.hch.trigger;

/**
 * Created by zq on 2014/5/25.
 */
public enum ScheduleAttributeMap {
    hospital("hospitalName"),
    department("departmentName"),
    doctor("doctorName"),
    date("WorkDate"),
    amp("WorkType"),
    status("WorkStatus"),
    limited("Limited"),
    registry_fee("Registryfee"),
    clinic_fee("Chinicfee"),
    begin_no("BeginNo"),
    space_no("SpaceNo");

    public String realAttr;

    ScheduleAttributeMap(String attr) {
        realAttr = attr;
    }

}
