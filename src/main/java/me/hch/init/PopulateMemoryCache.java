package me.hch.init;

import me.hch.mvc.model.HospitalEntity;
import me.hch.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;


/**
 * Created by huaiwang on 14-3-28.
 */

public class PopulateMemoryCache {

    public void populateSchedules() {
//        populateHospitalFromDb();

    }

    public void populatePatients() {

    }

    public void populateHospitalFromDb() {
        Session session = HibernateUtil.currentSession();
        List<HospitalEntity> list = session.createCriteria(HospitalEntity.class).list();


    }
}
