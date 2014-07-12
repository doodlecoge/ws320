package me.hch.mvc.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Date;

/**
 * Created by huaiwang on 14-4-3.
 */
public class Order {
    @Id
    @Column(name = "order_id")
    private String orderId;
    @Column(name = "order_status")
    private String orderStatus;
    @Column(name = "hospital_id")
    private String hospitalId;
    @Column(name = "hospital_name")
    private String hospitalName;
    @Column(name = "department_id")
    private String departmentId;
    @Column(name = "department_name")
    private String departmentName;
    @Column(name = "doctor_id")
    private String doctorId;
    @Column(name = "doctor_name")
    private String doctorName;
    @Column(name = "patient_id")
    private String patientId;
    @Column(name = "patient_name")
    private String patientName;
    @Column(name = "patient_phone")
    private String patientPhone;
    @Column(name = "insureance_type")
    private String insureanceType;
    @Column(name = "work_date")
    private Date workDate;
    @Column(name = "apm")
    private String apm;
    @Column(name = "start_time")
    private Time startTime;
    @Column(name = "end_time")
    private Time endTime;
    @Column(name = "vendor_id")
    private String vendorId;
    @Column(name = "operator")
    private String operator;
    @Column(name = "is_payed")
    private String isPayed;
    @Column(name = "pay_account")
    private String payAccount;
    @Column(name = "pay_amount")
    private String payAmount;
    @Column(name = "created_at")
    private Date createdAt;
}
