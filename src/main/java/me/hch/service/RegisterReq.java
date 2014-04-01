
package me.hch.service;

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
 *         &lt;element ref="{http://service.hch.me/}AuthInfo"/>
 *         &lt;element name="OperType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="AddReg"/>
 *               &lt;enumeration value="DelReg"/>
 *               &lt;enumeration value="ModReg"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://service.hch.me/}SN" minOccurs="0"/>
 *         &lt;element name="PatientInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://service.hch.me/}IdCard"/>
 *                   &lt;element ref="{http://service.hch.me/}Name"/>
 *                   &lt;element ref="{http://service.hch.me/}Phone" minOccurs="0"/>
 *                   &lt;element name="Sex" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="男"/>
 *                         &lt;enumeration value="女"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Birth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="InsureType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="自费"/>
 *                         &lt;enumeration value="市民卡"/>
 *                         &lt;enumeration value="园区医保"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://service.hch.me/}PayAccount" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RegInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://service.hch.me/}HospName"/>
 *                   &lt;element ref="{http://service.hch.me/}DepartName"/>
 *                   &lt;element ref="{http://service.hch.me/}DoctorName" minOccurs="0"/>
 *                   &lt;element ref="{http://service.hch.me/}WorkDate"/>
 *                   &lt;element ref="{http://service.hch.me/}WorkType"/>
 *                   &lt;element ref="{http://service.hch.me/}StartTime"/>
 *                   &lt;element ref="{http://service.hch.me/}EndTime"/>
 *                   &lt;element name="IsPayed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="RegOperType" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="RadCheckType">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="CT"/>
 *                                   &lt;enumeration value="MRI"/>
 *                                   &lt;enumeration value="CR"/>
 *                                   &lt;enumeration value="DR"/>
 *                                   &lt;enumeration value="DSA"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="BodyCheckSet">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="50"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "authInfo",
    "operType",
    "sn",
    "patientInfo",
    "regInfo",
    "regFrom"
})
@XmlRootElement(name = "RegisterReq")
public class RegisterReq {

    @XmlElement(name = "AuthInfo", required = true)
    protected AuthInfo authInfo;
    @XmlElement(name = "OperType", required = true)
    protected String operType;
    @XmlElement(name = "SN")
    protected String sn;
    @XmlElement(name = "PatientInfo", required = true)
    protected PatientInfo patientInfo;
    @XmlElement(name = "RegInfo")
    protected RegInfo regInfo;
    @XmlElement(name = "RegFrom", required = true)
    protected RegFrom regFrom;

    /**
     * 获取authInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link me.hch.service.AuthInfo }
     *     
     */
    public AuthInfo getAuthInfo() {
        return authInfo;
    }

    /**
     * 设置authInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link me.hch.service.AuthInfo }
     *     
     */
    public void setAuthInfo(AuthInfo value) {
        this.authInfo = value;
    }

    /**
     * 获取operType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperType() {
        return operType;
    }

    /**
     * 设置operType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperType(String value) {
        this.operType = value;
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
     * 获取patientInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link me.hch.service.RegisterReq.PatientInfo }
     *     
     */
    public PatientInfo getPatientInfo() {
        return patientInfo;
    }

    /**
     * 设置patientInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link me.hch.service.RegisterReq.PatientInfo }
     *     
     */
    public void setPatientInfo(PatientInfo value) {
        this.patientInfo = value;
    }

    /**
     * 获取regInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link me.hch.service.RegisterReq.RegInfo }
     *     
     */
    public RegInfo getRegInfo() {
        return regInfo;
    }

    /**
     * 设置regInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link me.hch.service.RegisterReq.RegInfo }
     *     
     */
    public void setRegInfo(RegInfo value) {
        this.regInfo = value;
    }

    /**
     * 获取regFrom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link me.hch.service.RegFrom }
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
     *     {@link me.hch.service.RegFrom }
     *     
     */
    public void setRegFrom(RegFrom value) {
        this.regFrom = value;
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
     *         &lt;element ref="{http://service.hch.me/}Phone" minOccurs="0"/>
     *         &lt;element name="Sex" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="男"/>
     *               &lt;enumeration value="女"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Birth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="InsureType">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="自费"/>
     *               &lt;enumeration value="市民卡"/>
     *               &lt;enumeration value="园区医保"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element ref="{http://service.hch.me/}PayAccount" minOccurs="0"/>
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
        "payAccount"
    })
    public static class PatientInfo {

        @XmlElement(name = "IdCard", required = true)
        protected String idCard;
        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "Phone")
        protected String phone;
        @XmlElement(name = "Sex")
        protected String sex;
        @XmlElement(name = "Birth")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar birth;
        @XmlElement(name = "InsureType", required = true)
        protected String insureType;
        @XmlElement(name = "PayAccount")
        protected PayAccount payAccount;

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
         * 获取payAccount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link me.hch.service.PayAccount }
         *     
         */
        public PayAccount getPayAccount() {
            return payAccount;
        }

        /**
         * 设置payAccount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link me.hch.service.PayAccount }
         *     
         */
        public void setPayAccount(PayAccount value) {
            this.payAccount = value;
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
     *         &lt;element ref="{http://service.hch.me/}DepartName"/>
     *         &lt;element ref="{http://service.hch.me/}DoctorName" minOccurs="0"/>
     *         &lt;element ref="{http://service.hch.me/}WorkDate"/>
     *         &lt;element ref="{http://service.hch.me/}WorkType"/>
     *         &lt;element ref="{http://service.hch.me/}StartTime"/>
     *         &lt;element ref="{http://service.hch.me/}EndTime"/>
     *         &lt;element name="IsPayed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="RegOperType" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="RadCheckType">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="CT"/>
     *                         &lt;enumeration value="MRI"/>
     *                         &lt;enumeration value="CR"/>
     *                         &lt;enumeration value="DR"/>
     *                         &lt;enumeration value="DSA"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="BodyCheckSet">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="50"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/choice>
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
        "hospName",
        "departName",
        "doctorName",
        "workDate",
        "workType",
        "startTime",
        "endTime",
        "isPayed",
        "regOperType"
    })
    public static class RegInfo {

        @XmlElement(name = "HospName", required = true)
        protected String hospName;
        @XmlElement(name = "DepartName", required = true)
        protected String departName;
        @XmlElement(name = "DoctorName")
        protected String doctorName;
        @XmlElement(name = "WorkDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar workDate;
        @XmlElement(name = "WorkType", required = true)
        protected String workType;
        @XmlElement(name = "StartTime", required = true)
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar startTime;
        @XmlElement(name = "EndTime", required = true)
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar endTime;
        @XmlElement(name = "IsPayed")
        protected Boolean isPayed;
        @XmlElement(name = "RegOperType")
        protected RegOperType regOperType;

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
         * 获取workDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link javax.xml.datatype.XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getWorkDate() {
            return workDate;
        }

        /**
         * 设置workDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link javax.xml.datatype.XMLGregorianCalendar }
         *     
         */
        public void setWorkDate(XMLGregorianCalendar value) {
            this.workDate = value;
        }

        /**
         * 获取workType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWorkType() {
            return workType;
        }

        /**
         * 设置workType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWorkType(String value) {
            this.workType = value;
        }

        /**
         * 获取startTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link javax.xml.datatype.XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartTime() {
            return startTime;
        }

        /**
         * 设置startTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link javax.xml.datatype.XMLGregorianCalendar }
         *     
         */
        public void setStartTime(XMLGregorianCalendar value) {
            this.startTime = value;
        }

        /**
         * 号源结束时间
         * 
         * @return
         *     possible object is
         *     {@link javax.xml.datatype.XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndTime() {
            return endTime;
        }

        /**
         * 设置endTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link javax.xml.datatype.XMLGregorianCalendar }
         *     
         */
        public void setEndTime(XMLGregorianCalendar value) {
            this.endTime = value;
        }

        /**
         * 获取isPayed属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsPayed() {
            return isPayed;
        }

        /**
         * 设置isPayed属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsPayed(Boolean value) {
            this.isPayed = value;
        }

        /**
         * 获取regOperType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link me.hch.service.RegisterReq.RegInfo.RegOperType }
         *     
         */
        public RegOperType getRegOperType() {
            return regOperType;
        }

        /**
         * 设置regOperType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link me.hch.service.RegisterReq.RegInfo.RegOperType }
         *     
         */
        public void setRegOperType(RegOperType value) {
            this.regOperType = value;
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
         *       &lt;choice>
         *         &lt;element name="RadCheckType">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="CT"/>
         *               &lt;enumeration value="MRI"/>
         *               &lt;enumeration value="CR"/>
         *               &lt;enumeration value="DR"/>
         *               &lt;enumeration value="DSA"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="BodyCheckSet">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="50"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *       &lt;/choice>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "radCheckType",
            "bodyCheckSet"
        })
        public static class RegOperType {

            @XmlElement(name = "RadCheckType")
            protected String radCheckType;
            @XmlElement(name = "BodyCheckSet")
            protected String bodyCheckSet;

            /**
             * 获取radCheckType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRadCheckType() {
                return radCheckType;
            }

            /**
             * 设置radCheckType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRadCheckType(String value) {
                this.radCheckType = value;
            }

            /**
             * 获取bodyCheckSet属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBodyCheckSet() {
                return bodyCheckSet;
            }

            /**
             * 设置bodyCheckSet属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBodyCheckSet(String value) {
                this.bodyCheckSet = value;
            }

        }

    }

}
