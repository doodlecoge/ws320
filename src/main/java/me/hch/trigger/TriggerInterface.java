package me.hch.trigger;

import me.hch.Ws320Exception;
import me.hch.model.Schedule;

/**
 * Created by hch on 2014/5/11.
 */
public interface TriggerInterface {
    public boolean hasInterest(TriggerInfo triggerInfo);

    public void handle(Schedule schedule);

    public TriggerStage getTriggerStage();
}
