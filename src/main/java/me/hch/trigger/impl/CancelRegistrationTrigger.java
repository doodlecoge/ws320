package me.hch.trigger.impl;

import me.hch.model.MemoryCache;
import me.hch.model.Schedule;
import me.hch.trigger.TriggerInterface;
import me.hch.trigger.TriggerAction;
import me.hch.trigger.TriggerInfo;
import me.hch.trigger.TriggerStage;

import java.util.Map;

/**
 * Created by hch on 2014/5/14.
 */
public class CancelRegistrationTrigger implements TriggerInterface {
    private TriggerInfo triggerInfo;

    @Override
    public boolean hasInterest(TriggerInfo triggerInfo) {
        if (TriggerAction.CANCEL_REGISTRATION.name.equals(triggerInfo.getAction())) {
            this.triggerInfo = triggerInfo;
            return true;
        } else return false;
    }

    @Override
    public void handle(Schedule schedule) {
        String id = schedule.id();
        Map<String, Schedule> oldSchedules = MemoryCache.getInstance().getSchedules(schedule.Hospitalcode);
        if (!oldSchedules.containsKey(id)) {
            // todo: check if time in range, report error if it is
        } else {
            Schedule oldSchedule = oldSchedules.get(id);
            if (schedule.WorkStatus.equals("1") && oldSchedule.WorkStatus.equals("0")) {
                // todo: perform cancel registration here
                System.out.println(schedule.hospitalName + "," + schedule.departmentName);
            }
        }
    }

    @Override
    public String getTriggerStage() {
        return triggerInfo.getStage();
    }
}
