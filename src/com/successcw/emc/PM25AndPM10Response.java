
package com.successcw.emc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="PM2_5AndPM10Result" type="{http://schemas.datacontract.org/2004/07/EnvCriteria.Model}ArrayOfAQIDataPublishLiveInfo" minOccurs="0"/>
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
    "pm25AndPM10Result"
})
@XmlRootElement(name = "PM2_5AndPM10Response")
public class PM25AndPM10Response {

    @XmlElementRef(name = "PM2_5AndPM10Result", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfAQIDataPublishLiveInfo> pm25AndPM10Result;

    /**
     * 获取pm25AndPM10Result属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAQIDataPublishLiveInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAQIDataPublishLiveInfo> getPM25AndPM10Result() {
        return pm25AndPM10Result;
    }

    /**
     * 设置pm25AndPM10Result属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAQIDataPublishLiveInfo }{@code >}
     *     
     */
    public void setPM25AndPM10Result(JAXBElement<ArrayOfAQIDataPublishLiveInfo> value) {
        this.pm25AndPM10Result = value;
    }

}
