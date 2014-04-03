package me.hch.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by huaiwang on 14-3-25.
 */
public class Department {
    private String departmentName;
    private String departmentType;
    private String departmentIntro;
    private Long limited;
    private BigDecimal registryFee;
    private BigDecimal clinicFee;
    private String departmentSex;
    private Short childAge;
    
    private Map<String, Doctor> doctors = new HashMap<String, Doctor>(0);
    private List<Schedule> schedules = new ArrayList<Schedule>(0);
}
