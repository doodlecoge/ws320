package me.hch.trigger.impl;

import me.hch.model.MemoryCache;
import me.hch.model.Schedule;
import me.hch.model.ScheduleCache;
import me.hch.trigger.*;

import java.util.Map;

/**
 * Created by hch on 2014/5/14.
 */
public class CancelRegistrationTrigger implements TriggerInterface {
    private TriggerInfo triggerInfo;
    private Selector selector;

    @Override
    public boolean hasInterest(TriggerInfo triggerInfo) {
        if (TriggerAction.cancel_reg == triggerInfo.getAction()) {
            this.triggerInfo = triggerInfo;
            return true;
        } else return false;
    }

    @Override
    public void handle(ScheduleCache sc) {
        MemoryCache mc = MemoryCache.getInstance();
        String hospitalId = sc.getHospitalId();
        ScheduleCache oldSc = mc.getSchedules(hospitalId);

        if (oldSc == null) return;

        Map<String, Schedule> schedules = sc.getSchedules();
        Map<String, Schedule> oldSchedules = oldSc.getSchedules();


        for (String sid : schedules.keySet()) {
            if (!oldSchedules.containsKey(sid)) {
                continue;
            }
            Schedule oldSche = oldSchedules.get(sid);
            Schedule newSche = schedules.get(sid);
            if ("1".equals(newSche.WorkStatus) &&
                    "0".equals(oldSche.WorkStatus)) {
                // todo: add cancel registration code here
                System.out.println("=================" + newSche.hospitalName + "," + newSche.departmentName);
            }
        }
    }

    @Override
    public TriggerStage getTriggerStage() {
        return triggerInfo.getStage();
    }

    @Override
    public void setSelector(Selector selector) {
        this.selector = selector;
    }
}
