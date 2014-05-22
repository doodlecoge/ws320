package me.hch.trigger;

import me.hch.trigger.impl.CancelRegistrationTrigger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hch on 2014/5/11.
 */
public class TriggerFactory {
    private static final Logger log = LoggerFactory.getLogger(TriggerFactory.class);
    private static final List<TriggerInterface> triggerInstances = new ArrayList<TriggerInterface>();

    private static List<Class<? extends TriggerInterface>> triggerClasses = new ArrayList<Class<? extends TriggerInterface>>();

    // add concrete triggerClasses to `impl` sub package,
    // and register them here
    static {
        triggerClasses.add(CancelRegistrationTrigger.class);
    }

    public static TriggerInterface getTrigger(TriggerInfo triggerInfo) {
        for (Class<? extends TriggerInterface> triggerClass : triggerClasses) {
            Method method = null;
            try {
                TriggerInterface trigger = triggerClass.newInstance();
                boolean b = trigger.hasInterest(triggerInfo);
                if (b) return trigger;
            } catch (Exception e) {
                log.error("get triggerClass error" + triggerInfo, e);
            }
        }

        log.error("can not instantiate triggerClass: " + triggerInfo);
        return null;
    }

    public static void clearTriggerInstances() {
        triggerInstances.clear();
    }

    public static void addTriggerInstance(TriggerInterface trigger) {
        triggerInstances.add(trigger);
    }

    public static List<TriggerInterface> getTriggerInstances() {
        return triggerInstances;
    }
}
