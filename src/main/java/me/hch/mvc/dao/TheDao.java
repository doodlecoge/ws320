package me.hch.mvc.dao;

import me.hch.mvc.model.HospitalEntity;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hch on 2014/5/17.
 */
@Repository
public class TheDao {
    @Autowired
    @Qualifier(value = "h2Sf")
    private SessionFactory sessionFactory;

    public List getHospitals() {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(HospitalEntity.class);
        return criteria.list();
    }

    public void addHospital() {
        HospitalEntity hos = new HospitalEntity();
        hos.setId("id");
        hos.setName("name");
        hos.setAddress("address");
        hos.setPhone("phone");
        hos.setWsdl("http://localhost:8080");

        Session session = sessionFactory.openSession();

        Object id = session.get(HospitalEntity.class, "id");
        if(id != null) return;
        session.beginTransaction();
        session.save(hos);
        session.getTransaction().commit();
    }
}
