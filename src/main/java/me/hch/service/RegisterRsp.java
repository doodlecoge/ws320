
package me.hch.service;

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
 *         &lt;element ref="{http://service.hch.me/}Result"/>
 *         &lt;element ref="{http://service.hch.me/}SN" minOccurs="0"/>
 *         &lt;element name="ClinicSerialNo" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
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
    "sn",
    "clinicSerialNo"
})
@XmlRootElement(name = "RegisterRsp")
public class RegisterRsp {

    @XmlElement(name = "Result", required = true)
    protected Result result;
    @XmlElement(name = "SN")
    protected String sn;
    @XmlElement(name = "ClinicSerialNo")
    @XmlSchemaType(name = "unsignedInt")
    protected Long clinicSerialNo;

    /**
     * 获取result属性的值。
     * 
     * @return
     *     possible object is
     *     {@link me.hch.service.Result }
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
     *     {@link me.hch.service.Result }
     *     
     */
    public void setResult(Result value) {
        this.result = value;
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
     * 获取clinicSerialNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClinicSerialNo() {
        return clinicSerialNo;
    }

    /**
     * 设置clinicSerialNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClinicSerialNo(Long value) {
        this.clinicSerialNo = value;
    }

}
