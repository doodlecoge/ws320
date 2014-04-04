
package me.hch.bean;

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
 *         &lt;element ref="{http://service.hch.me/}Hospital"/>
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
    "hospital"
})
@XmlRootElement(name = "NotifyHospInfoReq")
public class NotifyHospInfoReq {

    @XmlElement(name = "Hospital", required = true)
    protected Hospital hospital;

    /**
     * 获取hospital属性的值。
     * 
     * @return
     *     possible object is
     *     {@link me.hch.bean.Hospital }
     *     
     */
    public Hospital getHospital() {
        return hospital;
    }

    /**
     * 设置hospital属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link me.hch.bean.Hospital }
     *     
     */
    public void setHospital(Hospital value) {
        this.hospital = value;
    }

}
