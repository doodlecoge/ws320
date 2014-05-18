package me.hch.model;

import java.io.Serializable;

/**
 * Created by hch on 2014/5/18.
 */
public class Schedule extends DoctorWork {
    public String hospitalName;
    public String departmentName;
    public String doctorName;
    public Schedule original;
    public Schedule replaced;

    public String id() {
        return hospitalName + "_"
                + departmentName + "_"
                + doctorName + "_"
                + WorkDate + "_"
                + WorkType;
    }
}
