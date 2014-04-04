
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
 *         &lt;element name="Filter">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://service.hch.me/}HospName"/>
 *                   &lt;element ref="{http://service.hch.me/}DepartName"/>
 *                   &lt;element ref="{http://service.hch.me/}DoctorName" minOccurs="0"/>
 *                   &lt;element ref="{http://service.hch.me/}WorkDate"/>
 *                   &lt;element ref="{http://service.hch.me/}WorkType"/>
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
    "filter"
})
@XmlRootElement(name = "GetRegPoolReq")
public class GetRegPoolReq {

    @XmlElement(name = "AuthInfo", required = true)
    protected AuthInfo authInfo;
    @XmlElement(name = "Filter", required = true)
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
     * 获取filter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link me.hch.bean.GetRegPoolReq.Filter }
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
     *     {@link me.hch.bean.GetRegPoolReq.Filter }
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
     *         &lt;element ref="{http://service.hch.me/}HospName"/>
     *         &lt;element ref="{http://service.hch.me/}DepartName"/>
     *         &lt;element ref="{http://service.hch.me/}DoctorName" minOccurs="0"/>
     *         &lt;element ref="{http://service.hch.me/}WorkDate"/>
     *         &lt;element ref="{http://service.hch.me/}WorkType"/>
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
        "workType"
    })
    public static class Filter {

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

    }

}
