
package com.successcw.emc;

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
 *         &lt;element name="SetAQIPublishDataResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "setAQIPublishDataResult"
})
@XmlRootElement(name = "SetAQIPublishDataResponse")
public class SetAQIPublishDataResponse {

    @XmlElement(name = "SetAQIPublishDataResult")
    protected Boolean setAQIPublishDataResult;

    /**
     * 获取setAQIPublishDataResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSetAQIPublishDataResult() {
        return setAQIPublishDataResult;
    }

    /**
     * 设置setAQIPublishDataResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSetAQIPublishDataResult(Boolean value) {
        this.setAQIPublishDataResult = value;
    }

}
