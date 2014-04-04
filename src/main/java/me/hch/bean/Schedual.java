
package me.hch.bean;

import java.math.BigDecimal;
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
 *         &lt;element ref="{http://service.hch.me/}WorkDate"/>
 *         &lt;element ref="{http://service.hch.me/}WorkType"/>
 *         &lt;element name="WorkStatus">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="正常"/>
 *               &lt;enumeration value="停诊"/>
 *               &lt;enumeration value="停诊但保留预约"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExpertFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
    "workDate",
    "workType",
    "workStatus",
    "expertFee"
})
@XmlRootElement(name = "Schedual")
public class Schedual {

    @XmlElement(name = "WorkDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar workDate;
    @XmlElement(name = "WorkType", required = true)
    protected String workType;
    @XmlElement(name = "WorkStatus", required = true)
    protected String workStatus;
    @XmlElement(name = "ExpertFee")
    protected BigDecimal expertFee;

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
     * 获取workStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkStatus() {
        return workStatus;
    }

    /**
     * 设置workStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkStatus(String value) {
        this.workStatus = value;
    }

    /**
     * 获取expertFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public BigDecimal getExpertFee() {
        return expertFee;
    }

    /**
     * 设置expertFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setExpertFee(BigDecimal value) {
        this.expertFee = value;
    }

}
