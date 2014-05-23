package me.hch.trigger;

/**
 * Created by huaiwang on 5/23/14.
 */
public enum TriggerStage {
    COMPARE("cmp"),
    REPLACE("rep");

    public String name;

    TriggerStage(String s) {
        name = s;
    }
}
