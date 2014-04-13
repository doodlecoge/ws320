package me.hch.service.client;

/**
 * Created by Administrator on 14-4-13.
 */
public class HisClientFactory {
    // todo: add client for each hospital
    public static HisClientIface getHisClient(String hospitalId) {
        if ("".equals(hospitalId)) {
            return null;
        } else {
            return new DefaultHisClient();
        }
    }
}
