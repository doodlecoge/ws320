package me.hch.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by huaiwang on 14-3-25.
 */
public class Hospital {
    private String hospitalId;
    private String hospitalName;
    private String hospitalAddress;
    private String hospitalPhone;
    private String hospitalIntroduction;
    private String hospitalGrade;
    private String hospitalKind;

    private Map<String, Department> departments = new HashMap<String, Department>(0);
}
