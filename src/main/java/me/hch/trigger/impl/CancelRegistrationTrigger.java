package me.hch.trigger.impl;

import me.hch.model.Schedule;
import me.hch.trigger.AbstractTrigger;
import me.hch.trigger.TriggerAction;
import me.hch.trigger.TriggerInfo;

/**
 * Created by hch on 2014/5/14.
 */
public class CancelRegistrationTrigger extends AbstractTrigger {
    public static AbstractTrigger tryInstantiate(TriggerInfo triggerInfo) {
        if (TriggerAction.CANCEL_REGISTRATION.name.equals(triggerInfo.getAction()))
            return new CancelRegistrationTrigger();
        return null;
    }

    @Override
    public void handle(Schedule schedule) {

    }
}
