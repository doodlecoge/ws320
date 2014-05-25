package me.hch.trigger.impl;

import me.hch.model.MemoryCache;
import me.hch.model.Schedule;
import me.hch.model.ScheduleFields;
import me.hch.trigger.*;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * Created by zq on 2014/5/22.
 */
public class ReplaceValueTrigger implements TriggerInterface {
    private TriggerInfo triggerInfo;

    @Override
    public boolean hasInterest(TriggerInfo triggerInfo) {
        if (TriggerAction.replace_val == triggerInfo.getAction()) {
            this.triggerInfo = triggerInfo;
            return true;
        } else return false;
    }

    @Override
    public void handle(Schedule schedule) {
        Map<String, Schedule> schedules = MemoryCache.getInstance().getSchedules(schedule.Hospitalcode);

        String attr = triggerInfo.getAttribute();
        String realAttr = ScheduleAttributeMap.valueOf(attr).realAttr;
        Field field = ScheduleFields.get(realAttr);

        if (schedule.replaced == null) {
            Schedule newSchedule = (Schedule) schedule.clone();
            newSchedule.original = schedule;
            schedule.replaced = newSchedule;
        }

        String oid = schedule.replaced.id();

        try {
            String old = field.get(schedule).toString();
            if (old.equals(triggerInfo.getOldValue())) {
                field.set(schedule.replaced, triggerInfo.getNewValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        schedules.remove(oid);
        schedules.put(schedule.replaced.id(), schedule.replaced);
    }

    @Override
    public TriggerStage getTriggerStage() {
        return triggerInfo.getStage();
    }
}
