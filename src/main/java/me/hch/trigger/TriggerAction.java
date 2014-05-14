package me.hch.trigger;

/**
 * Created by hch on 2014/5/14.
 */
public enum TriggerAction {
    CANCEL_REGISTRATION("cancel_reg"),
    REPLACE_VALUE("replace_val");

    public String name;

    TriggerAction(String s) {
        name = s;
    }
}
