package me.hch.service.client;

import me.hch.Ws320Exception;
import me.hch.Ws320RuntimeException;
import me.hch.util.Config;
import me.hch.util.FileUtils;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by hch on 2014/5/2.
 */
public class TestHisClient implements HisClientIface {
    private static Config sysConfig = Config.getInstance("system.properties");

    @Override
    public String getDepartInfo(String hospitalId) {
        try {
            return FileUtils.getInstance(sysConfig.getString("test_file_folder"))
                    .getFileContent(hospitalId + "-dpt-info.xml");
        } catch (IOException e) {
            throw new Ws320RuntimeException(e);
        }
    }

    @Override
    public String getDoctorInfo(String hospitalId) {
        try {
            return FileUtils.getInstance(sysConfig.getString("test_file_folder"))
                    .getFileContent(hospitalId + "-doc-info.xml");
        } catch (IOException e) {
            throw new Ws320RuntimeException(e);
        }

    }

    @Override
    public String getDepartWorkSchedule(String hospitalId) {
        try {
            return FileUtils.getInstance(sysConfig.getString("test_file_folder"))
                    .getFileContent(hospitalId + "-dpt-work.xml");
        } catch (IOException e) {
            throw new Ws320RuntimeException(e);
        }

    }

    @Override
    public String getDoctorWorkSchedule(String hospitalId) {
        try {
            return FileUtils.getInstance(sysConfig.getString("test_file_folder"))
                    .getFileContent(hospitalId + "-doc-work.xml");
        } catch (IOException e) {
            throw new Ws320RuntimeException(e);
        }

    }
}
