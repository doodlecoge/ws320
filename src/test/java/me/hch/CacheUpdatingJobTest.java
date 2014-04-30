package me.hch;

import me.hch.job.CacheUpdatingJob;

/**
 * Created by huaiwang on 14-4-30.
 */
public class CacheUpdatingJobTest {
    public static void main(String[] args) {
        CacheUpdatingJob job = CacheUpdatingJob.getInstance();

        job.start();

        job.stop();
    }
}
