package me.hch.job;

import me.hch.Ws320Exception;
import me.hch.service.client.HisClientFactory;
import me.hch.service.client.HisClientIface;

/**
 * Created by huaiwang on 14-4-30.
 */
public class CacheUpdatingJob extends Thread {
    public static final CacheUpdatingJob ins = new CacheUpdatingJob();

    private CacheUpdatingJob() {
    }

    public static CacheUpdatingJob getInstance() {
        return ins;
    }

    private static boolean stop = false;

    @Override
    public void run() {
        while (!stop) {
            _sleep(1000);
        }
    }

    public void updateCache(String hospitalId) {
        HisClientIface hisClient = HisClientFactory.getHisClient(hospitalId);

        hisClient.getDepartInfo(hospitalId);
        hisClient.getDoctorInfo(hospitalId);
        hisClient.getDepartWorkSchedule(hospitalId);
        hisClient.getDoctorWorkSchedule(hospitalId);
    }

    private void _sleep(long mills) {
        try {
            sleep(mills);
        } catch (InterruptedException e) {
            throw new Ws320Exception(e);
        }
    }
}
