
package me.hch.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="HospBasic" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Grade" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Kind" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Address" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Phone" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Intro" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Depart" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://service.hch.me/}DepartName"/>
 *                   &lt;element name="DepartBasic" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DepartType">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="普通"/>
 *                                   &lt;enumeration value="专家"/>
 *                                   &lt;enumeration value="普通和专家"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DepartIntro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Limited" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *                             &lt;element ref="{http://service.hch.me/}RegistryFee"/>
 *                             &lt;element ref="{http://service.hch.me/}ClinicFee"/>
 *                             &lt;element name="DepartSex" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="0"/>
 *                                   &lt;enumeration value="M"/>
 *                                   &lt;enumeration value="F"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ChildAge" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://service.hch.me/}Schedual" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Doctor" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://service.hch.me/}DoctorName"/>
 *                             &lt;element name="DocBasic" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DocSex">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="男"/>
 *                                             &lt;enumeration value="女"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="DocRank" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="20"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="DoctorInro" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="200"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="DocMajor" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="100"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="IsExpert" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                       &lt;element ref="{http://service.hch.me/}RegistryFee"/>
 *                                       &lt;element ref="{http://service.hch.me/}ClinicFee"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element ref="{http://service.hch.me/}Schedual" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
    "hospName",
    "hospBasic",
    "depart"
})
@XmlRootElement(name = "Hospital")
public class Hospital {

    @XmlElement(name = "HospName", required = true)
    protected String hospName;
    @XmlElement(name = "HospBasic")
    protected HospBasic hospBasic;
    @XmlElement(name = "Depart")
    protected List<Depart> depart;

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
     * 获取hospBasic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link me.hch.bean.Hospital.HospBasic }
     *     
     */
    public HospBasic getHospBasic() {
        return hospBasic;
    }

    /**
     * 设置hospBasic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link me.hch.bean.Hospital.HospBasic }
     *     
     */
    public void setHospBasic(HospBasic value) {
        this.hospBasic = value;
    }

    /**
     * Gets the value of the depart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the depart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link me.hch.bean.Hospital.Depart }
     * 
     * 
     */
    public List<Depart> getDepart() {
        if (depart == null) {
            depart = new ArrayList<Depart>();
        }
        return this.depart;
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
     *         &lt;element ref="{http://service.hch.me/}DepartName"/>
     *         &lt;element name="DepartBasic" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DepartType">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="普通"/>
     *                         &lt;enumeration value="专家"/>
     *                         &lt;enumeration value="普通和专家"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DepartIntro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Limited" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
     *                   &lt;element ref="{http://service.hch.me/}RegistryFee"/>
     *                   &lt;element ref="{http://service.hch.me/}ClinicFee"/>
     *                   &lt;element name="DepartSex" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="0"/>
     *                         &lt;enumeration value="M"/>
     *                         &lt;enumeration value="F"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ChildAge" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://service.hch.me/}Schedual" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Doctor" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://service.hch.me/}DoctorName"/>
     *                   &lt;element name="DocBasic" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DocSex">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="男"/>
     *                                   &lt;enumeration value="女"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="DocRank" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="20"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="DoctorInro" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="200"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="DocMajor" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="100"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="IsExpert" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                             &lt;element ref="{http://service.hch.me/}RegistryFee"/>
     *                             &lt;element ref="{http://service.hch.me/}ClinicFee"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element ref="{http://service.hch.me/}Schedual" maxOccurs="unbounded" minOccurs="0"/>
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
        "departName",
        "departBasic",
        "schedual",
        "doctor"
    })
    public static class Depart {

        @XmlElement(name = "DepartName", required = true)
        protected String departName;
        @XmlElement(name = "DepartBasic")
        protected DepartBasic departBasic;
        @XmlElement(name = "Schedual")
        protected List<Schedual> schedual;
        @XmlElement(name = "Doctor")
        protected List<Doctor> doctor;

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
         * 获取departBasic属性的值。
         * 
         * @return
         *     possible object is
         *     {@link me.hch.bean.Hospital.Depart.DepartBasic }
         *     
         */
        public DepartBasic getDepartBasic() {
            return departBasic;
        }

        /**
         * 设置departBasic属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link me.hch.bean.Hospital.Depart.DepartBasic }
         *     
         */
        public void setDepartBasic(DepartBasic value) {
            this.departBasic = value;
        }

        /**
         * Gets the value of the schedual property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the schedual property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSchedual().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link me.hch.bean.Schedual }
         * 
         * 
         */
        public List<Schedual> getSchedual() {
            if (schedual == null) {
                schedual = new ArrayList<Schedual>();
            }
            return this.schedual;
        }

        /**
         * Gets the value of the doctor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the doctor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDoctor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link me.hch.bean.Hospital.Depart.Doctor }
         * 
         * 
         */
        public List<Doctor> getDoctor() {
            if (doctor == null) {
                doctor = new ArrayList<Doctor>();
            }
            return this.doctor;
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
         *         &lt;element name="DepartType">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="普通"/>
         *               &lt;enumeration value="专家"/>
         *               &lt;enumeration value="普通和专家"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DepartIntro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Limited" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
         *         &lt;element ref="{http://service.hch.me/}RegistryFee"/>
         *         &lt;element ref="{http://service.hch.me/}ClinicFee"/>
         *         &lt;element name="DepartSex" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="M"/>
         *               &lt;enumeration value="F"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ChildAge" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
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
            "departType",
            "departIntro",
            "limited",
            "registryFee",
            "clinicFee",
            "departSex",
            "childAge"
        })
        public static class DepartBasic {

            @XmlElement(name = "DepartType", required = true)
            protected String departType;
            @XmlElement(name = "DepartIntro")
            protected String departIntro;
            @XmlElement(name = "Limited")
            @XmlSchemaType(name = "unsignedInt")
            protected Long limited;
            @XmlElement(name = "RegistryFee", required = true)
            protected BigDecimal registryFee;
            @XmlElement(name = "ClinicFee", required = true)
            protected BigDecimal clinicFee;
            @XmlElement(name = "DepartSex")
            protected String departSex;
            @XmlElement(name = "ChildAge")
            @XmlSchemaType(name = "unsignedByte")
            protected Short childAge;

            /**
             * 获取departType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepartType() {
                return departType;
            }

            /**
             * 设置departType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepartType(String value) {
                this.departType = value;
            }

            /**
             * 获取departIntro属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepartIntro() {
                return departIntro;
            }

            /**
             * 设置departIntro属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepartIntro(String value) {
                this.departIntro = value;
            }

            /**
             * 获取limited属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getLimited() {
                return limited;
            }

            /**
             * 设置limited属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setLimited(Long value) {
                this.limited = value;
            }

            /**
             * 获取registryFee属性的值。
             * 
             * @return
             *     possible object is
             *     {@link java.math.BigDecimal }
             *     
             */
            public BigDecimal getRegistryFee() {
                return registryFee;
            }

            /**
             * 设置registryFee属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link java.math.BigDecimal }
             *     
             */
            public void setRegistryFee(BigDecimal value) {
                this.registryFee = value;
            }

            /**
             * 获取clinicFee属性的值。
             * 
             * @return
             *     possible object is
             *     {@link java.math.BigDecimal }
             *     
             */
            public BigDecimal getClinicFee() {
                return clinicFee;
            }

            /**
             * 设置clinicFee属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link java.math.BigDecimal }
             *     
             */
            public void setClinicFee(BigDecimal value) {
                this.clinicFee = value;
            }

            /**
             * 获取departSex属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepartSex() {
                return departSex;
            }

            /**
             * 设置departSex属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepartSex(String value) {
                this.departSex = value;
            }

            /**
             * 获取childAge属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Short }
             *     
             */
            public Short getChildAge() {
                return childAge;
            }

            /**
             * 设置childAge属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Short }
             *     
             */
            public void setChildAge(Short value) {
                this.childAge = value;
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
         *         &lt;element ref="{http://service.hch.me/}DoctorName"/>
         *         &lt;element name="DocBasic" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DocSex">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="男"/>
         *                         &lt;enumeration value="女"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="DocRank" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="20"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="DoctorInro" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="200"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="DocMajor" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="100"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="IsExpert" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                   &lt;element ref="{http://service.hch.me/}RegistryFee"/>
         *                   &lt;element ref="{http://service.hch.me/}ClinicFee"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element ref="{http://service.hch.me/}Schedual" maxOccurs="unbounded" minOccurs="0"/>
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
            "doctorName",
            "docBasic",
            "schedual"
        })
        public static class Doctor {

            @XmlElement(name = "DoctorName", required = true)
            protected String doctorName;
            @XmlElement(name = "DocBasic")
            protected DocBasic docBasic;
            @XmlElement(name = "Schedual")
            protected List<Schedual> schedual;

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
             * 获取docBasic属性的值。
             * 
             * @return
             *     possible object is
             *     {@link me.hch.bean.Hospital.Depart.Doctor.DocBasic }
             *     
             */
            public DocBasic getDocBasic() {
                return docBasic;
            }

            /**
             * 设置docBasic属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link me.hch.bean.Hospital.Depart.Doctor.DocBasic }
             *     
             */
            public void setDocBasic(DocBasic value) {
                this.docBasic = value;
            }

            /**
             * Gets the value of the schedual property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the schedual property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSchedual().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link me.hch.bean.Schedual }
             * 
             * 
             */
            public List<Schedual> getSchedual() {
                if (schedual == null) {
                    schedual = new ArrayList<Schedual>();
                }
                return this.schedual;
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
             *         &lt;element name="DocSex">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="男"/>
             *               &lt;enumeration value="女"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="DocRank" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="20"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="DoctorInro" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="200"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="DocMajor" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="100"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="IsExpert" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *         &lt;element ref="{http://service.hch.me/}RegistryFee"/>
             *         &lt;element ref="{http://service.hch.me/}ClinicFee"/>
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
                "docSex",
                "docRank",
                "doctorInro",
                "docMajor",
                "isExpert",
                "registryFee",
                "clinicFee"
            })
            public static class DocBasic {

                @XmlElement(name = "DocSex", required = true)
                protected String docSex;
                @XmlElement(name = "DocRank")
                protected String docRank;
                @XmlElement(name = "DoctorInro")
                protected String doctorInro;
                @XmlElement(name = "DocMajor")
                protected String docMajor;
                @XmlElement(name = "IsExpert")
                protected boolean isExpert;
                @XmlElement(name = "RegistryFee", required = true)
                protected BigDecimal registryFee;
                @XmlElement(name = "ClinicFee", required = true)
                protected BigDecimal clinicFee;

                /**
                 * 获取docSex属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDocSex() {
                    return docSex;
                }

                /**
                 * 设置docSex属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDocSex(String value) {
                    this.docSex = value;
                }

                /**
                 * 获取docRank属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDocRank() {
                    return docRank;
                }

                /**
                 * 设置docRank属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDocRank(String value) {
                    this.docRank = value;
                }

                /**
                 * 获取doctorInro属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDoctorInro() {
                    return doctorInro;
                }

                /**
                 * 设置doctorInro属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDoctorInro(String value) {
                    this.doctorInro = value;
                }

                /**
                 * 获取docMajor属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDocMajor() {
                    return docMajor;
                }

                /**
                 * 设置docMajor属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDocMajor(String value) {
                    this.docMajor = value;
                }

                /**
                 * 获取isExpert属性的值。
                 * 
                 */
                public boolean isIsExpert() {
                    return isExpert;
                }

                /**
                 * 设置isExpert属性的值。
                 * 
                 */
                public void setIsExpert(boolean value) {
                    this.isExpert = value;
                }

                /**
                 * 获取registryFee属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link java.math.BigDecimal }
                 *     
                 */
                public BigDecimal getRegistryFee() {
                    return registryFee;
                }

                /**
                 * 设置registryFee属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link java.math.BigDecimal }
                 *     
                 */
                public void setRegistryFee(BigDecimal value) {
                    this.registryFee = value;
                }

                /**
                 * 获取clinicFee属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link java.math.BigDecimal }
                 *     
                 */
                public BigDecimal getClinicFee() {
                    return clinicFee;
                }

                /**
                 * 设置clinicFee属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link java.math.BigDecimal }
                 *     
                 */
                public void setClinicFee(BigDecimal value) {
                    this.clinicFee = value;
                }

            }

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
     *         &lt;element name="Grade" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Kind" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Address" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Phone" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Intro" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "grade",
        "kind",
        "address",
        "phone",
        "intro"
    })
    public static class HospBasic {

        @XmlElement(name = "Grade")
        protected String grade;
        @XmlElement(name = "Kind")
        protected String kind;
        @XmlElement(name = "Address")
        protected String address;
        @XmlElement(name = "Phone")
        protected String phone;
        @XmlElement(name = "Intro")
        protected String intro;

        /**
         * 获取grade属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGrade() {
            return grade;
        }

        /**
         * 设置grade属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGrade(String value) {
            this.grade = value;
        }

        /**
         * 获取kind属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKind() {
            return kind;
        }

        /**
         * 设置kind属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKind(String value) {
            this.kind = value;
        }

        /**
         * 获取address属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddress() {
            return address;
        }

        /**
         * 设置address属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddress(String value) {
            this.address = value;
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
         * 获取intro属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntro() {
            return intro;
        }

        /**
         * 设置intro属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntro(String value) {
            this.intro = value;
        }

    }

}
