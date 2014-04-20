
package me.hch.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element ref="{http://service.hch.me}DoctorName"/>
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
 *                   &lt;element ref="{http://service.hch.me}RegistryFee"/>
 *                   &lt;element ref="{http://service.hch.me}ClinicFee"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://service.hch.me}Schedule" maxOccurs="unbounded" minOccurs="0"/>
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
    "schedule"
})
@XmlRootElement(name = "Doctor")
public class Doctor {

    @XmlElement(name = "DoctorName", required = true)
    protected String doctorName;
    @XmlElement(name = "DocBasic")
    protected DocBasic docBasic;
    @XmlElement(name = "Schedule")
    protected List<Schedule> schedule;

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
     *     {@link me.hch.bean.Doctor.DocBasic }
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
     *     {@link me.hch.bean.Doctor.DocBasic }
     *     
     */
    public void setDocBasic(DocBasic value) {
        this.docBasic = value;
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
     *         &lt;element ref="{http://service.hch.me}RegistryFee"/>
     *         &lt;element ref="{http://service.hch.me}ClinicFee"/>
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
