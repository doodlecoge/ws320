
package me.hch.bean;

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
 *         &lt;element name="PatientIdentify">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://service.hch.me/}SN" minOccurs="0"/>
 *                   &lt;element ref="{http://service.hch.me/}IdCard"/>
 *                   &lt;element name="Other" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://service.hch.me/}Name" minOccurs="0"/>
 *                             &lt;element ref="{http://service.hch.me/}Phone" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Filter" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element ref="{http://service.hch.me/}HospName" minOccurs="0"/>
 *                   &lt;element ref="{http://service.hch.me/}DepartName" minOccurs="0"/>
 *                   &lt;element ref="{http://service.hch.me/}DoctorName" minOccurs="0"/>
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
    "authInfo",
    "patientIdentify",
    "filter"
})
@XmlRootElement(name = "GetRegInfoReq")
public class GetRegInfoReq {

    @XmlElement(name = "AuthInfo", required = true)
    protected AuthInfo authInfo;
    @XmlElement(name = "PatientIdentify", required = true)
    protected PatientIdentify patientIdentify;
    @XmlElement(name = "Filter")
    protected Filter filter;

    /**
     * 获取authInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link me.hch.bean.AuthInfo }
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
     *     {@link me.hch.bean.AuthInfo }
     *     
     */
    public void setAuthInfo(AuthInfo value) {
        this.authInfo = value;
    }

    /**
     * 获取patientIdentify属性的值。
     * 
     * @return
     *     possible object is
     *     {@link me.hch.bean.GetRegInfoReq.PatientIdentify }
     *     
     */
    public PatientIdentify getPatientIdentify() {
        return patientIdentify;
    }

    /**
     * 设置patientIdentify属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link me.hch.bean.GetRegInfoReq.PatientIdentify }
     *     
     */
    public void setPatientIdentify(PatientIdentify value) {
        this.patientIdentify = value;
    }

    /**
     * 获取filter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link me.hch.bean.GetRegInfoReq.Filter }
     *     
     */
    public Filter getFilter() {
        return filter;
    }

    /**
     * 设置filter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link me.hch.bean.GetRegInfoReq.Filter }
     *     
     */
    public void setFilter(Filter value) {
        this.filter = value;
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
     *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element ref="{http://service.hch.me/}HospName" minOccurs="0"/>
     *         &lt;element ref="{http://service.hch.me/}DepartName" minOccurs="0"/>
     *         &lt;element ref="{http://service.hch.me/}DoctorName" minOccurs="0"/>
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
        "beginDate",
        "endDate",
        "hospName",
        "departName",
        "doctorName"
    })
    public static class Filter {

        @XmlElement(name = "BeginDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar beginDate;
        @XmlElement(name = "EndDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar endDate;
        @XmlElement(name = "HospName")
        protected String hospName;
        @XmlElement(name = "DepartName")
        protected String departName;
        @XmlElement(name = "DoctorName")
        protected String doctorName;

        /**
         * 获取beginDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link javax.xml.datatype.XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBeginDate() {
            return beginDate;
        }

        /**
         * 设置beginDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link javax.xml.datatype.XMLGregorianCalendar }
         *     
         */
        public void setBeginDate(XMLGregorianCalendar value) {
            this.beginDate = value;
        }

        /**
         * 获取endDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link javax.xml.datatype.XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndDate() {
            return endDate;
        }

        /**
         * 设置endDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link javax.xml.datatype.XMLGregorianCalendar }
         *     
         */
        public void setEndDate(XMLGregorianCalendar value) {
            this.endDate = value;
        }

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
     *         &lt;element ref="{http://service.hch.me/}SN" minOccurs="0"/>
     *         &lt;element ref="{http://service.hch.me/}IdCard"/>
     *         &lt;element name="Other" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://service.hch.me/}Name" minOccurs="0"/>
     *                   &lt;element ref="{http://service.hch.me/}Phone" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
        "sn",
        "idCard",
        "other"
    })
    public static class PatientIdentify {

        @XmlElement(name = "SN")
        protected String sn;
        @XmlElement(name = "IdCard")
        protected String idCard;
        @XmlElement(name = "Other")
        protected Other other;

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
         * 获取other属性的值。
         * 
         * @return
         *     possible object is
         *     {@link me.hch.bean.GetRegInfoReq.PatientIdentify.Other }
         *     
         */
        public Other getOther() {
            return other;
        }

        /**
         * 设置other属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link me.hch.bean.GetRegInfoReq.PatientIdentify.Other }
         *     
         */
        public void setOther(Other value) {
            this.other = value;
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
         *         &lt;element ref="{http://service.hch.me/}Name" minOccurs="0"/>
         *         &lt;element ref="{http://service.hch.me/}Phone" minOccurs="0"/>
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
            "name",
            "phone"
        })
        public static class Other {

            @XmlElement(name = "Name")
            protected String name;
            @XmlElement(name = "Phone")
            protected String phone;

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

        }

    }

}
