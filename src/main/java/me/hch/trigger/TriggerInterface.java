package me.hch.trigger;

import me.hch.bean.Schedule;

/**
 * Created by hch on 2014/5/11.
 */
public interface TriggerInterface {
    public TriggerInterface reflect();
    public boolean hasInterest(Schedule schedule);
    public void handle(Schedule schedule);
}
