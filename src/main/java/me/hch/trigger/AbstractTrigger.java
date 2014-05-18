package me.hch.trigger;

import me.hch.Ws320Exception;
import me.hch.model.Schedule;

/**
 * Created by hch on 2014/5/11.
 */
public abstract class AbstractTrigger {
    public static AbstractTrigger tryInstantiate(TriggerInfo triggerInfo) {
        throw new Ws320Exception("not implemented");
    }

    public abstract void handle(Schedule schedule);
}
