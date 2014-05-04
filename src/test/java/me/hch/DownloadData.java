package me.hch;

import me.hch.model.MemoryCache;
import me.hch.service.client.DefaultHisClient;
import me.hch.service.client.HisClientFactory;
import me.hch.service.client.HisClientIface;
import me.hch.util.Config;
import me.hch.util.FileUtils;

import java.util.Set;

/**
 * Created by Administrator on 14-5-4.
 */
public class DownloadData {
    public static void main(String[] args) {
        Config conf = Config.getInstance("confidential/ws_loc.properties");
        Set<String> keys = conf.getKeys();
        FileUtils fu = FileUtils.getInstance("E:\\tmp");
        for (String key : keys) {
            try {
                MemoryCache.getInstance().wsdls.put(key, conf.getString(key));
                DefaultHisClient client = new DefaultHisClient();

                String str = client.getDepartInfo(key);
                fu.saveAs(key + "-dpt-info.xml", str);


                str = client.getDepartWorkSchedule(key);
                fu.saveAs(key + "-dpt-work.xml", str);


                str = client.getDoctorInfo(key);
                fu.saveAs(key + "-doc-info.xml", str);


                str = client.getDoctorWorkSchedule(key);
                fu.saveAs(key + "-doc-work.xml", str);
            } catch (Exception e) {
                System.out.println(key);
            }
        }

    }
}
