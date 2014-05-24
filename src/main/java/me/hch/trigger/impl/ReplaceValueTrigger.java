package me.hch.trigger.impl;

import me.hch.model.Schedule;
import me.hch.trigger.TriggerAction;
import me.hch.trigger.TriggerInfo;
import me.hch.trigger.TriggerInterface;
import me.hch.trigger.TriggerStage;

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

    }

    @Override
    public TriggerStage getTriggerStage() {
        return triggerInfo.getStage();
    }
}
