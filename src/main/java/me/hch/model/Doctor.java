package me.hch.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by huaiwang on 14-3-25.
 */
public class Doctor {
    private String doctorName;
    private String doctorSex;
    private String doctorRank;
    private String doctortorInro;
    private String doctorMajor;
    private boolean isExpert;
    private BigDecimal registryFee;
    private BigDecimal clinicFee;

    private List<Schedule> schedules = new ArrayList<Schedule>(0);
}
