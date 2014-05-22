package me.hch.trigger.impl;

import me.hch.model.Schedule;
import me.hch.trigger.TriggerInterface;
import me.hch.trigger.TriggerAction;
import me.hch.trigger.TriggerInfo;

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

    }
}
