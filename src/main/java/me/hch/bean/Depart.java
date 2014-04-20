
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
 *         &lt;element ref="{http://service.hch.me}DepartName"/>
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
 *                   &lt;element ref="{http://service.hch.me}RegistryFee"/>
 *                   &lt;element ref="{http://service.hch.me}ClinicFee"/>
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
 *         &lt;element ref="{http://service.hch.me}Schedule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://service.hch.me}Doctor" maxOccurs="unbounded" minOccurs="0"/>
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
    "schedule",
    "doctor"
})
@XmlRootElement(name = "Depart")
public class Depart {

    @XmlElement(name = "DepartName", required = true)
    protected String departName;
    @XmlElement(name = "DepartBasic")
    protected DepartBasic departBasic;
    @XmlElement(name = "Schedule")
    protected List<Schedule> schedule;
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
     *     {@link me.hch.bean.Depart.DepartBasic }
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
     *     {@link me.hch.bean.Depart.DepartBasic }
     *     
     */
    public void setDepartBasic(DepartBasic value) {
        this.departBasic = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Schedule }
     * 
     * 
     */
    public List<Schedule> getSchedule() {
        if (schedule == null) {
            schedule = new ArrayList<Schedule>();
        }
        return this.schedule;
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
     * {@link Doctor }
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
     *         &lt;element ref="{http://service.hch.me}RegistryFee"/>
     *         &lt;element ref="{http://service.hch.me}ClinicFee"/>
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

}
