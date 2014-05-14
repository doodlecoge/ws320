package me.hch.trigger;

/**
 * Created by hch on 2014/5/14.
 */
public class TriggerInfo {
    public String selector;
    public String attribute;
    public String oldValue;
    public String newValue;

    // action is used by TriggerFactory
    // to create trigger instance.
    public TriggerAction action;
}
