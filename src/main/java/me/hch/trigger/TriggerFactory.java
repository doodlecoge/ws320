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
    private static final List<AbstractTrigger> triggerInstances = new ArrayList<AbstractTrigger>();

    private static List<Class<? extends AbstractTrigger>> triggers = new ArrayList<Class<? extends AbstractTrigger>>();

    // add concrete triggers to impl sub package,
    // and register them here
    static {
        triggers.add(CancelRegistrationTrigger.class);
    }

    public static AbstractTrigger getTrigger(TriggerInfo triggerInfo) {
        for (Class<? extends AbstractTrigger> trigger : triggers) {
            Method method = null;
            try {
                method = trigger.getMethod("tryInstantiate", TriggerInfo.class);
                Object t = method.invoke(null, triggerInfo);
                if (t != null) return (AbstractTrigger) t;
            } catch (Exception e) {
                log.error("get trigger error" + triggerInfo, e);
            }
        }

        log.error("can not instantiate trigger: " + triggerInfo);
        return null;
    }

    public static void clearTriggerInstances() {
        triggerInstances.clear();
    }

    public static void addTriggerInstance(AbstractTrigger trigger) {
        triggerInstances.add(trigger);
    }

    public static List<AbstractTrigger> getTriggerInstances() {
        return triggerInstances;
    }
}
