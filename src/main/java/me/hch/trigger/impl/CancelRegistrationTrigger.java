package me.hch.trigger.impl;

import me.hch.bean.Schedule;
import me.hch.trigger.TriggerInfo;
import me.hch.trigger.TriggerInterface;

/**
 * Created by hch on 2014/5/14.
 */
public class CancelRegistrationTrigger implements TriggerInterface {
    @Override
    public TriggerInterface tryInstantiate(TriggerInfo triggerInfo) {
        return null;
    }

    @Override
    public boolean hasInterest(Schedule schedule) {
        return false;
    }

    @Override
    public void handle(Schedule schedule) {

    }
}
