
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
 *         &lt;element name="支付类型">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="支付宝"/>
 *               &lt;enumeration value="预充值账户"/>
 *               &lt;enumeration value="微信"/>
 *               &lt;enumeration value="银联"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="支付账号" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "\u652f\u4ed8\u7c7b\u578b",
    "\u652f\u4ed8\u8d26\u53f7"
})
@XmlRootElement(name = "PayAccount")
public class PayAccount {

    @XmlElement(required = true)
    protected String 支付类型;
    @XmlElement(required = true)
    protected String 支付账号;

    /**
     * 获取支付类型属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get支付类型() {
        return 支付类型;
    }

    /**
     * 设置支付类型属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set支付类型(String value) {
        this.支付类型 = value;
    }

    /**
     * 获取支付账号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get支付账号() {
        return 支付账号;
    }

    /**
     * 设置支付账号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set支付账号(String value) {
        this.支付账号 = value;
    }

}
