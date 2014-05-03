package me.hch.init;

import me.hch.job.CacheUpdatingJob;
import me.hch.model.HospitalEntity;
import me.hch.model.HospitalInfo;
import me.hch.model.MemoryCache;
import me.hch.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;
import java.util.Map;


/**
 * Created by huaiwang on 14-3-28.
 */

public class PopulateMemoryCache {

    public void populateSchedules() {
//        populateHospitalFromDb();

        Map<String, String> wsdls = MemoryCache.getInstance().wsdls;
        for (String s : wsdls.keySet()) {
            CacheUpdatingJob.getInstance().loadCache(s);
        }
    }

    public void populatePatients() {

    }

    public void populateHospitalFromDb() {
        Session session = HibernateUtil.currentSession();
        List<HospitalEntity> list = session.createCriteria(HospitalEntity.class).list();

        MemoryCache memoryCache = MemoryCache.getInstance();
        for (HospitalEntity entity : list) {
            memoryCache.addHospital(entity);
        }
    }
}
