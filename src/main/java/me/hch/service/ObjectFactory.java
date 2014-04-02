
package me.hch.service;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the me.hch.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ClinicFee_QNAME = new QName("http://service.hch.me/", "ClinicFee");
    private final static QName _Name_QNAME = new QName("http://service.hch.me/", "Name");
    private final static QName _HospName_QNAME = new QName("http://service.hch.me/", "HospName");
    private final static QName _WorkType_QNAME = new QName("http://service.hch.me/", "WorkType");
    private final static QName _StartTime_QNAME = new QName("http://service.hch.me/", "StartTime");
    private final static QName _EndTime_QNAME = new QName("http://service.hch.me/", "EndTime");
    private final static QName _Phone_QNAME = new QName("http://service.hch.me/", "Phone");
    private final static QName _RegVia_QNAME = new QName("http://service.hch.me/", "RegVia");
    private final static QName _WorkDate_QNAME = new QName("http://service.hch.me/", "WorkDate");
    private final static QName _RegistryFee_QNAME = new QName("http://service.hch.me/", "RegistryFee");
    private final static QName _IdCard_QNAME = new QName("http://service.hch.me/", "IdCard");
    private final static QName _SN_QNAME = new QName("http://service.hch.me/", "SN");
    private final static QName _DoctorName_QNAME = new QName("http://service.hch.me/", "DoctorName");
    private final static QName _DepartName_QNAME = new QName("http://service.hch.me/", "DepartName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: me.hch.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegisterReq }
     * 
     */
    public RegisterReq createRegisterReq() {
        return new RegisterReq();
    }

    /**
     * Create an instance of {@link me.hch.service.GetRegInfoReq }
     * 
     */
    public GetRegInfoReq createGetRegInfoReq() {
        return new GetRegInfoReq();
    }

    /**
     * Create an instance of {@link me.hch.service.Hospital }
     * 
     */
    public Hospital createHospital() {
        return new Hospital();
    }

    /**
     * Create an instance of {@link me.hch.service.GetHospInfoReq }
     * 
     */
    public GetHospInfoReq createGetHospInfoReq() {
        return new GetHospInfoReq();
    }

    /**
     * Create an instance of {@link me.hch.service.GetRegPoolRsp }
     * 
     */
    public GetRegPoolRsp createGetRegPoolRsp() {
        return new GetRegPoolRsp();
    }

    /**
     * Create an instance of {@link me.hch.service.GetRegInfoRsp }
     * 
     */
    public GetRegInfoRsp createGetRegInfoRsp() {
        return new GetRegInfoRsp();
    }

    /**
     * Create an instance of {@link me.hch.service.GetRegPoolReq }
     * 
     */
    public GetRegPoolReq createGetRegPoolReq() {
        return new GetRegPoolReq();
    }

    /**
     * Create an instance of {@link me.hch.service.Hospital.Depart }
     * 
     */
    public Hospital.Depart createHospitalDepart() {
        return new Hospital.Depart();
    }

    /**
     * Create an instance of {@link me.hch.service.Hospital.Depart.Doctor }
     * 
     */
    public Hospital.Depart.Doctor createHospitalDepartDoctor() {
        return new Hospital.Depart.Doctor();
    }

    /**
     * Create an instance of {@link me.hch.service.GetRegInfoReq.PatientIdentify }
     * 
     */
    public GetRegInfoReq.PatientIdentify createGetRegInfoReqPatientIdentify() {
        return new GetRegInfoReq.PatientIdentify();
    }

    /**
     * Create an instance of {@link RegisterReq.RegInfo }
     * 
     */
    public RegisterReq.RegInfo createRegisterReqRegInfo() {
        return new RegisterReq.RegInfo();
    }

    /**
     * Create an instance of {@link me.hch.service.AuthInfo }
     * 
     */
    public AuthInfo createAuthInfo() {
        return new AuthInfo();
    }

    /**
     * Create an instance of {@link RegisterReq.PatientInfo }
     * 
     */
    public RegisterReq.PatientInfo createRegisterReqPatientInfo() {
        return new RegisterReq.PatientInfo();
    }

    /**
     * Create an instance of {@link RegFrom }
     * 
     */
    public RegFrom createRegFrom() {
        return new RegFrom();
    }

    /**
     * Create an instance of {@link me.hch.service.GetRegInfoReq.Filter }
     * 
     */
    public GetRegInfoReq.Filter createGetRegInfoReqFilter() {
        return new GetRegInfoReq.Filter();
    }

    /**
     * Create an instance of {@link me.hch.service.NotifyHospInfoReq }
     * 
     */
    public NotifyHospInfoReq createNotifyHospInfoReq() {
        return new NotifyHospInfoReq();
    }

    /**
     * Create an instance of {@link me.hch.service.Hospital.HospBasic }
     * 
     */
    public Hospital.HospBasic createHospitalHospBasic() {
        return new Hospital.HospBasic();
    }

    /**
     * Create an instance of {@link PayAccount }
     * 
     */
    public PayAccount createPayAccount() {
        return new PayAccount();
    }

    /**
     * Create an instance of {@link me.hch.service.GetHospInfoReq.Filter }
     * 
     */
    public GetHospInfoReq.Filter createGetHospInfoReqFilter() {
        return new GetHospInfoReq.Filter();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link me.hch.service.GetRegPoolRsp.PoolInfo }
     * 
     */
    public GetRegPoolRsp.PoolInfo createGetRegPoolRspPoolInfo() {
        return new GetRegPoolRsp.PoolInfo();
    }

    /**
     * Create an instance of {@link me.hch.service.GetHospInfoRsp }
     * 
     */
    public GetHospInfoRsp createGetHospInfoRsp() {
        return new GetHospInfoRsp();
    }

    /**
     * Create an instance of {@link me.hch.service.NotifyHospInfoRsp }
     * 
     */
    public NotifyHospInfoRsp createNotifyHospInfoRsp() {
        return new NotifyHospInfoRsp();
    }

    /**
     * Create an instance of {@link me.hch.service.GetRegInfoRsp.Patient }
     * 
     */
    public GetRegInfoRsp.Patient createGetRegInfoRspPatient() {
        return new GetRegInfoRsp.Patient();
    }

    /**
     * Create an instance of {@link me.hch.service.GetRegInfoRsp.RegInfo }
     * 
     */
    public GetRegInfoRsp.RegInfo createGetRegInfoRspRegInfo() {
        return new GetRegInfoRsp.RegInfo();
    }

    /**
     * Create an instance of {@link Schedual }
     * 
     */
    public Schedual createSchedual() {
        return new Schedual();
    }

    /**
     * Create an instance of {@link me.hch.service.GetRegPoolReq.Filter }
     * 
     */
    public GetRegPoolReq.Filter createGetRegPoolReqFilter() {
        return new GetRegPoolReq.Filter();
    }

    /**
     * Create an instance of {@link RegisterRsp }
     * 
     */
    public RegisterRsp createRegisterRsp() {
        return new RegisterRsp();
    }

    /**
     * Create an instance of {@link me.hch.service.Hospital.Depart.DepartBasic }
     * 
     */
    public Hospital.Depart.DepartBasic createHospitalDepartDepartBasic() {
        return new Hospital.Depart.DepartBasic();
    }

    /**
     * Create an instance of {@link me.hch.service.Hospital.Depart.Doctor.DocBasic }
     * 
     */
    public Hospital.Depart.Doctor.DocBasic createHospitalDepartDoctorDocBasic() {
        return new Hospital.Depart.Doctor.DocBasic();
    }

    /**
     * Create an instance of {@link me.hch.service.GetRegInfoReq.PatientIdentify.Other }
     * 
     */
    public GetRegInfoReq.PatientIdentify.Other createGetRegInfoReqPatientIdentifyOther() {
        return new GetRegInfoReq.PatientIdentify.Other();
    }

    /**
     * Create an instance of {@link RegisterReq.RegInfo.RegOperType }
     * 
     */
    public RegisterReq.RegInfo.RegOperType createRegisterReqRegInfoRegOperType() {
        return new RegisterReq.RegInfo.RegOperType();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hch.me/", name = "ClinicFee")
    public JAXBElement<BigDecimal> createClinicFee(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ClinicFee_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hch.me/", name = "Name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hch.me/", name = "HospName")
    public JAXBElement<String> createHospName(String value) {
        return new JAXBElement<String>(_HospName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hch.me/", name = "WorkType")
    public JAXBElement<String> createWorkType(String value) {
        return new JAXBElement<String>(_WorkType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link javax.xml.datatype.XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hch.me/", name = "StartTime")
    public JAXBElement<XMLGregorianCalendar> createStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StartTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link javax.xml.datatype.XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hch.me/", name = "EndTime")
    public JAXBElement<XMLGregorianCalendar> createEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EndTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hch.me/", name = "Phone")
    public JAXBElement<String> createPhone(String value) {
        return new JAXBElement<String>(_Phone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hch.me/", name = "RegVia")
    public JAXBElement<String> createRegVia(String value) {
        return new JAXBElement<String>(_RegVia_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link javax.xml.datatype.XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hch.me/", name = "WorkDate")
    public JAXBElement<XMLGregorianCalendar> createWorkDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hch.me/", name = "RegistryFee")
    public JAXBElement<BigDecimal> createRegistryFee(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RegistryFee_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hch.me/", name = "IdCard")
    public JAXBElement<String> createIdCard(String value) {
        return new JAXBElement<String>(_IdCard_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hch.me/", name = "SN")
    public JAXBElement<String> createSN(String value) {
        return new JAXBElement<String>(_SN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hch.me/", name = "DoctorName")
    public JAXBElement<String> createDoctorName(String value) {
        return new JAXBElement<String>(_DoctorName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hch.me/", name = "DepartName")
    public JAXBElement<String> createDepartName(String value) {
        return new JAXBElement<String>(_DepartName_QNAME, String.class, null, value);
    }

}
