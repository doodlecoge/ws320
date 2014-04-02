
package me.hch.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://service.hch.me/}Result"/>
 *         &lt;element name="Patient" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://service.hch.me/}IdCard"/>
 *                   &lt;element ref="{http://service.hch.me/}Name"/>
 *                   &lt;element ref="{http://service.hch.me/}Phone"/>
 *                   &lt;element name="Sex">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="男"/>
 *                         &lt;enumeration value="女"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Birth" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="InsureType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="自费"/>
 *                         &lt;enumeration value="市民卡"/>
 *                         &lt;enumeration value="园区医保"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="IsBlocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element ref="{http://service.hch.me/}PayAccount" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RegInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://service.hch.me/}HospName"/>
 *                   &lt;element ref="{http://service.hch.me/}SN"/>
 *                   &lt;element ref="{http://service.hch.me/}DepartName"/>
 *                   &lt;element ref="{http://service.hch.me/}DoctorName" minOccurs="0"/>
 *                   &lt;element name="SelfPay" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="InsurePay" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="RegDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="ClinicDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="IsFetched" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="FetchDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="IsUnPayed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="UnpayedFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="IsQuit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="QuitTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element ref="{http://service.hch.me/}RegFrom"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "result",
    "patient",
    "regInfo"
})
@XmlRootElement(name = "GetRegInfoRsp")
public class GetRegInfoRsp {

    @XmlElement(name = "Result", required = true)
    protected Result result;
    @XmlElement(name = "Patient")
    protected Patient patient;
    @XmlElement(name = "RegInfo")
    protected List<RegInfo> regInfo;

    /**
     * 获取result属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getResult() {
        return result;
    }

    /**
     * 设置result属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setResult(Result value) {
        this.result = value;
    }

    /**
     * 获取patient属性的值。
     * 
     * @return
     *     possible object is
     *     {@link me.hch.service.GetRegInfoRsp.Patient }
     *     
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * 设置patient属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link me.hch.service.GetRegInfoRsp.Patient }
     *     
     */
    public void setPatient(Patient value) {
        this.patient = value;
    }

    /**
     * Gets the value of the regInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link me.hch.service.GetRegInfoRsp.RegInfo }
     * 
     * 
     */
    public List<RegInfo> getRegInfo() {
        if (regInfo == null) {
            regInfo = new ArrayList<RegInfo>();
        }
        return this.regInfo;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://service.hch.me/}IdCard"/>
     *         &lt;element ref="{http://service.hch.me/}Name"/>
     *         &lt;element ref="{http://service.hch.me/}Phone"/>
     *         &lt;element name="Sex">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="男"/>
     *               &lt;enumeration value="女"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Birth" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="InsureType">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="自费"/>
     *               &lt;enumeration value="市民卡"/>
     *               &lt;enumeration value="园区医保"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="IsBlocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element ref="{http://service.hch.me/}PayAccount" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "idCard",
        "name",
        "phone",
        "sex",
        "birth",
        "insureType",
        "isBlocked",
        "payAccount"
    })
    public static class Patient {

        @XmlElement(name = "IdCard", required = true)
        protected String idCard;
        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "Phone", required = true)
        protected String phone;
        @XmlElement(name = "Sex", required = true)
        protected String sex;
        @XmlElement(name = "Birth", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar birth;
        @XmlElement(name = "InsureType", required = true)
        protected String insureType;
        @XmlElement(name = "IsBlocked")
        protected boolean isBlocked;
        @XmlElement(name = "PayAccount")
        protected List<PayAccount> payAccount;

        /**
         * 获取idCard属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdCard() {
            return idCard;
        }

        /**
         * 设置idCard属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdCard(String value) {
            this.idCard = value;
        }

        /**
         * 获取name属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * 设置name属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * 获取phone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhone() {
            return phone;
        }

        /**
         * 设置phone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhone(String value) {
            this.phone = value;
        }

        /**
         * 获取sex属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSex() {
            return sex;
        }

        /**
         * 设置sex属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSex(String value) {
            this.sex = value;
        }

        /**
         * 获取birth属性的值。
         * 
         * @return
         *     possible object is
         *     {@link javax.xml.datatype.XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBirth() {
            return birth;
        }

        /**
         * 设置birth属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link javax.xml.datatype.XMLGregorianCalendar }
         *     
         */
        public void setBirth(XMLGregorianCalendar value) {
            this.birth = value;
        }

        /**
         * 获取insureType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInsureType() {
            return insureType;
        }

        /**
         * 设置insureType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInsureType(String value) {
            this.insureType = value;
        }

        /**
         * 获取isBlocked属性的值。
         * 
         */
        public boolean isIsBlocked() {
            return isBlocked;
        }

        /**
         * 设置isBlocked属性的值。
         * 
         */
        public void setIsBlocked(boolean value) {
            this.isBlocked = value;
        }

        /**
         * Gets the value of the payAccount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the payAccount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPayAccount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PayAccount }
         * 
         * 
         */
        public List<PayAccount> getPayAccount() {
            if (payAccount == null) {
                payAccount = new ArrayList<PayAccount>();
            }
            return this.payAccount;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://service.hch.me/}HospName"/>
     *         &lt;element ref="{http://service.hch.me/}SN"/>
     *         &lt;element ref="{http://service.hch.me/}DepartName"/>
     *         &lt;element ref="{http://service.hch.me/}DoctorName" minOccurs="0"/>
     *         &lt;element name="SelfPay" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="InsurePay" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="RegDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="ClinicDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="IsFetched" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="FetchDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="IsUnPayed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="UnpayedFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="IsQuit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="QuitTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element ref="{http://service.hch.me/}RegFrom"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hospName",
        "sn",
        "departName",
        "doctorName",
        "selfPay",
        "insurePay",
        "regDateTime",
        "clinicDateTime",
        "isFetched",
        "fetchDateTime",
        "isUnPayed",
        "unpayedFee",
        "isQuit",
        "quitTime",
        "regFrom"
    })
    public static class RegInfo {

        @XmlElement(name = "HospName", required = true)
        protected String hospName;
        @XmlElement(name = "SN", required = true)
        protected String sn;
        @XmlElement(name = "DepartName", required = true)
        protected String departName;
        @XmlElement(name = "DoctorName")
        protected String doctorName;
        @XmlElement(name = "SelfPay", required = true)
        protected BigDecimal selfPay;
        @XmlElement(name = "InsurePay", required = true)
        protected BigDecimal insurePay;
        @XmlElement(name = "RegDateTime", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar regDateTime;
        @XmlElement(name = "ClinicDateTime", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar clinicDateTime;
        @XmlElement(name = "IsFetched")
        protected boolean isFetched;
        @XmlElement(name = "FetchDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fetchDateTime;
        @XmlElement(name = "IsUnPayed")
        protected boolean isUnPayed;
        @XmlElement(name = "UnpayedFee")
        protected BigDecimal unpayedFee;
        @XmlElement(name = "IsQuit")
        protected boolean isQuit;
        @XmlElement(name = "QuitTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar quitTime;
        @XmlElement(name = "RegFrom", required = true)
        protected RegFrom regFrom;

        /**
         * 获取hospName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHospName() {
            return hospName;
        }

        /**
         * 设置hospName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHospName(String value) {
            this.hospName = value;
        }

        /**
         * 获取sn属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSN() {
            return sn;
        }

        /**
         * 设置sn属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSN(String value) {
            this.sn = value;
        }

        /**
         * 获取departName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepartName() {
            return departName;
        }

        /**
         * 设置departName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepartName(String value) {
            this.departName = value;
        }

        /**
         * 获取doctorName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDoctorName() {
            return doctorName;
        }

        /**
         * 设置doctorName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDoctorName(String value) {
            this.doctorName = value;
        }

        /**
         * 获取selfPay属性的值。
         * 
         * @return
         *     possible object is
         *     {@link java.math.BigDecimal }
         *     
         */
        public BigDecimal getSelfPay() {
            return selfPay;
        }

        /**
         * 设置selfPay属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link java.math.BigDecimal }
         *     
         */
        public void setSelfPay(BigDecimal value) {
            this.selfPay = value;
        }

        /**
         * 获取insurePay属性的值。
         * 
         * @return
         *     possible object is
         *     {@link java.math.BigDecimal }
         *     
         */
        public BigDecimal getInsurePay() {
            return insurePay;
        }

        /**
         * 设置insurePay属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link java.math.BigDecimal }
         *     
         */
        public void setInsurePay(BigDecimal value) {
            this.insurePay = value;
        }

        /**
         * 获取regDateTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link javax.xml.datatype.XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRegDateTime() {
            return regDateTime;
        }

        /**
         * 设置regDateTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link javax.xml.datatype.XMLGregorianCalendar }
         *     
         */
        public void setRegDateTime(XMLGregorianCalendar value) {
            this.regDateTime = value;
        }

        /**
         * 获取clinicDateTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link javax.xml.datatype.XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getClinicDateTime() {
            return clinicDateTime;
        }

        /**
         * 设置clinicDateTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link javax.xml.datatype.XMLGregorianCalendar }
         *     
         */
        public void setClinicDateTime(XMLGregorianCalendar value) {
            this.clinicDateTime = value;
        }

        /**
         * 获取isFetched属性的值。
         * 
         */
        public boolean isIsFetched() {
            return isFetched;
        }

        /**
         * 设置isFetched属性的值。
         * 
         */
        public void setIsFetched(boolean value) {
            this.isFetched = value;
        }

        /**
         * 获取fetchDateTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link javax.xml.datatype.XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFetchDateTime() {
            return fetchDateTime;
        }

        /**
         * 设置fetchDateTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link javax.xml.datatype.XMLGregorianCalendar }
         *     
         */
        public void setFetchDateTime(XMLGregorianCalendar value) {
            this.fetchDateTime = value;
        }

        /**
         * 获取isUnPayed属性的值。
         * 
         */
        public boolean isIsUnPayed() {
            return isUnPayed;
        }

        /**
         * 设置isUnPayed属性的值。
         * 
         */
        public void setIsUnPayed(boolean value) {
            this.isUnPayed = value;
        }

        /**
         * 获取unpayedFee属性的值。
         * 
         * @return
         *     possible object is
         *     {@link java.math.BigDecimal }
         *     
         */
        public BigDecimal getUnpayedFee() {
            return unpayedFee;
        }

        /**
         * 设置unpayedFee属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link java.math.BigDecimal }
         *     
         */
        public void setUnpayedFee(BigDecimal value) {
            this.unpayedFee = value;
        }

        /**
         * 获取isQuit属性的值。
         * 
         */
        public boolean isIsQuit() {
            return isQuit;
        }

        /**
         * 设置isQuit属性的值。
         * 
         */
        public void setIsQuit(boolean value) {
            this.isQuit = value;
        }

        /**
         * 获取quitTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link javax.xml.datatype.XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getQuitTime() {
            return quitTime;
        }

        /**
         * 设置quitTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link javax.xml.datatype.XMLGregorianCalendar }
         *     
         */
        public void setQuitTime(XMLGregorianCalendar value) {
            this.quitTime = value;
        }

        /**
         * 获取regFrom属性的值。
         * 
         * @return
         *     possible object is
         *     {@link RegFrom }
         *     
         */
        public RegFrom getRegFrom() {
            return regFrom;
        }

        /**
         * 设置regFrom属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link RegFrom }
         *     
         */
        public void setRegFrom(RegFrom value) {
            this.regFrom = value;
        }

    }

}
