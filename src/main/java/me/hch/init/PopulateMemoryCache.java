package me.hch.init;

import me.hch.model.HospitalEntity;
import me.hch.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;


/**
 * Created by huaiwang on 14-3-28.
 */

public class PopulateMemoryCache {

    public void populateSchedules() {
        populateHospitalFromDb();
    }

    public void populatePatients() {

    }

    private void populateHospitalFromDb() {
        HospitalEntity entity = new HospitalEntity();
        entity.setId("sf");
        entity.setName("name");
        entity.setAddress("addr");
        entity.setPhone("phone");
        entity.setWsdl("wsdl");

        Session session = HibernateUtil.currentSession();
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();

        List list = session.createCriteria(HospitalEntity.class).list();
        System.out.println(list.size());
    }
}
