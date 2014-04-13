package me.hch.service.client;

import me.hch.util.FileUtils;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Administrator on 14-4-13.
 */
public interface HisClientIface {
    public String getDepartInfo(String hospitalId);

    public String getDoctorInfo(String hospitalId);

    public String getDepartWorkSchedule(String hospitalId);

    public String getDoctorWorkSchedule(String hospitalId);
}
