package me.hch.trigger;

import me.hch.Ws320Exception;
import me.hch.Ws320RuntimeException;
import me.hch.model.Schedule;

import java.lang.reflect.Field;

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
    public Field field;

    ScheduleAttributeMap(String attr) {
        realAttr = attr;
        try {
            field = Schedule.class.getField(attr);
        } catch (NoSuchFieldException e) {
            throw new Ws320RuntimeException(e);
        }
    }

}
