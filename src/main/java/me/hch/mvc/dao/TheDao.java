package me.hch.mvc.dao;

import me.hch.Ws320RuntimeException;
import me.hch.mvc.model.BlockHistory;
import me.hch.mvc.model.HospitalEntity;
import me.hch.mvc.model.Patient;
import me.hch.mvc.model.User;
import me.hch.trigger.TriggerInfo;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by hch on 2014/5/17.
 */
@Repository
public class TheDao {
    @Autowired
    @Qualifier(value = "h2Sf")
    private SessionFactory sessionFactory;

    public List<HospitalEntity> getHospitals() {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(HospitalEntity.class);
        List list = criteria.list();
        session.close();
        return list;
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
        if (id != null) return;
        session.beginTransaction();
        session.save(hos);
        session.getTransaction().commit();
    }


    public List<TriggerInfo> getTriggerInfos() {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(TriggerInfo.class);
        List list = criteria.list();
        session.close();
        return list;
    }


    public List<User> getUsers() {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(User.class);
        List list = criteria.list();
        session.close();
        return list;
    }


    /* patients                                                          */
    /*===================================================================*/

    public List<Patient> getPatients() {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Patient.class);
        try {
            List list = criteria.list();
            return list;
        } catch (Exception e) {
            throw new Ws320RuntimeException(e);
        } finally {
            if (session != null) session.close();
        }
    }


    public Patient getPatientById(String id) {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Patient.class)
                .add(Restrictions.eq("patientId", id));
        try {
            return (Patient) criteria.uniqueResult();
        } catch (Exception e) {
            throw new Ws320RuntimeException(e);
        } finally {
            if (session != null) session.close();
        }
    }

    public void modifyPatientName(String id, String name) {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Patient.class)
                .add(Restrictions.eq("patientId", id));
        try {
            Object p = criteria.uniqueResult();
            if (p == null) return;
            Patient patient = (Patient) p;
            patient.setName(name);
            session.save(patient);
        } catch (Exception e) {
            throw new Ws320RuntimeException(e);
        } finally {
            if (session != null) session.close();
        }
    }

    public void addPatient(String id, String name) {
        Session session = sessionFactory.openSession();
        Patient patient = new Patient();
        patient.setName(name);
        patient.setPatientId(id);
        try {
            session.save(patient);
        } catch (Exception e) {
            throw new Ws320RuntimeException(e);
        } finally {
            if (session != null) session.close();
        }
    }

    public void blockPatient(String id) {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Patient.class);
        try {
            Object p = criteria.uniqueResult();
            if (p == null) return;

            Patient patient = (Patient) p;
            patient.setIsBlocked(Patient.YesNo.YES);
            patient.setBlockedAt(new Date());

            session.save(patient);
        } catch (Exception e) {
            throw new Ws320RuntimeException(e);
        } finally {
            if (session != null) session.close();
        }
    }

    public void unblockPatient(String id) {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Patient.class);
        try {
            Object p = criteria.uniqueResult();
            if (p == null) return;

            Patient patient = (Patient) p;
            patient.setIsBlocked(Patient.YesNo.NO);
            patient.setUnblockAt(new Date());

            session.save(patient);
        } catch (Exception e) {
            throw new Ws320RuntimeException(e);
        } finally {
            if (session != null) session.close();
        }
    }
}
