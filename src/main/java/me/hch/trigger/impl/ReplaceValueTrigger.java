package me.hch.trigger.impl;

import me.hch.model.Schedule;
import me.hch.trigger.TriggerAction;
import me.hch.trigger.TriggerInfo;
import me.hch.trigger.TriggerInterface;

/**
 * Created by zq on 2014/5/22.
 */
public class ReplaceValueTrigger implements TriggerInterface {
    private TriggerInfo triggerInfo;

    @Override
    public boolean hasInterest(TriggerInfo triggerInfo) {
        if (TriggerAction.REPLACE_VALUE.name.equals(triggerInfo.getAction())) {
            this.triggerInfo = triggerInfo;
            return true;
        } else return false;
    }

    @Override
    public void handle(Schedule schedule) {

    }
}
