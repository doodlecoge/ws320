
package me.hch.service;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://service.hch.me/}Result"/>
 *         &lt;element name="PoolInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://service.hch.me/}StartTime"/>
 *                   &lt;element ref="{http://service.hch.me/}EndTime" minOccurs="0"/>
 *                   &lt;element name="TotalNum" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *                   &lt;element name="LeftNum" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
    "result",
    "poolInfo"
})
@XmlRootElement(name = "GetRegPoolRsp")
public class GetRegPoolRsp {

    @XmlElement(name = "Result", required = true)
    protected Result result;
    @XmlElement(name = "PoolInfo")
    protected List<PoolInfo> poolInfo;

    /**
     * 获取result属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Result }
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
     *     {@link Result }
     *     
     */
    public void setResult(Result value) {
        this.result = value;
    }

    /**
     * Gets the value of the poolInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poolInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoolInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link me.hch.service.GetRegPoolRsp.PoolInfo }
     * 
     * 
     */
    public List<PoolInfo> getPoolInfo() {
        if (poolInfo == null) {
            poolInfo = new ArrayList<PoolInfo>();
        }
        return this.poolInfo;
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
     *         &lt;element ref="{http://service.hch.me/}StartTime"/>
     *         &lt;element ref="{http://service.hch.me/}EndTime" minOccurs="0"/>
     *         &lt;element name="TotalNum" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
     *         &lt;element name="LeftNum" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
        "startTime",
        "endTime",
        "totalNum",
        "leftNum"
    })
    public static class PoolInfo {

        @XmlElement(name = "StartTime", required = true)
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar startTime;
        @XmlElement(name = "EndTime")
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar endTime;
        @XmlElement(name = "TotalNum")
        @XmlSchemaType(name = "unsignedInt")
        protected Long totalNum;
        @XmlElement(name = "LeftNum")
        @XmlSchemaType(name = "unsignedInt")
        protected long leftNum;

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
         * 获取endTime属性的值。
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
         * 获取totalNum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getTotalNum() {
            return totalNum;
        }

        /**
         * 设置totalNum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setTotalNum(Long value) {
            this.totalNum = value;
        }

        /**
         * 获取leftNum属性的值。
         * 
         */
        public long getLeftNum() {
            return leftNum;
        }

        /**
         * 设置leftNum属性的值。
         * 
         */
        public void setLeftNum(long value) {
            this.leftNum = value;
        }

    }

}
