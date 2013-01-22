
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
 *         &lt;element name="GetAllAQIPublishResult" type="{http://schemas.datacontract.org/2004/07/EnvCriteria.Model}ArrayOfAQIDataPublishLiveInfo" minOccurs="0"/>
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
    "getAllAQIPublishResult"
})
@XmlRootElement(name = "GetAllAQIPublishResponse")
public class GetAllAQIPublishResponse {

    @XmlElementRef(name = "GetAllAQIPublishResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfAQIDataPublishLiveInfo> getAllAQIPublishResult;

    /**
     * 获取getAllAQIPublishResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAQIDataPublishLiveInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAQIDataPublishLiveInfo> getGetAllAQIPublishResult() {
        return getAllAQIPublishResult;
    }

    /**
     * 设置getAllAQIPublishResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAQIDataPublishLiveInfo }{@code >}
     *     
     */
    public void setGetAllAQIPublishResult(JAXBElement<ArrayOfAQIDataPublishLiveInfo> value) {
        this.getAllAQIPublishResult = value;
    }

}