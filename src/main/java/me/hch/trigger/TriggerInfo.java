package me.hch.trigger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by hch on 2014/5/14.
 */

@Entity
@Table(name = "triggers", schema = "ws320")
public class TriggerInfo {
    @Column
    private String selector;
    @Column
    private String attribute;
    @Column
    private String oldValue;
    @Column
    private String newValue;

    // action is used by TriggerFactory
    // to create trigger instance.
    @Id
    private String action;
    @Column
    private String stage;


    public String toString() {
        return selector + ","
                + attribute + ","
                + oldValue + ","
                + newValue + ","
                + action + ","
                + stage;
    }

    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public String getAction() {
        return action;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public void setAction(String action) {

        this.action = action;
    }
}
