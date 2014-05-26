package me.hch.trigger;

import me.hch.Ws320Exception;
import me.hch.model.Schedule;
import me.hch.model.ScheduleCache;

/**
 * Created by hch on 2014/5/11.
 */
public interface TriggerInterface {
    public boolean hasInterest(TriggerInfo triggerInfo);

    public void handle(ScheduleCache sc);

    public TriggerStage getTriggerStage();

    public void setSelector(Selector selector);
}
