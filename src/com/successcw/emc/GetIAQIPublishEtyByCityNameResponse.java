
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
 *         &lt;element name="GetIAQIPublishEtyByCityNameResult" type="{http://schemas.datacontract.org/2004/07/EnvCriteria.BLL}ArrayOfIAQIDataPublishLiveEty" minOccurs="0"/>
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
    "getIAQIPublishEtyByCityNameResult"
})
@XmlRootElement(name = "GetIAQIPublishEtyByCityNameResponse")
public class GetIAQIPublishEtyByCityNameResponse {

    @XmlElementRef(name = "GetIAQIPublishEtyByCityNameResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfIAQIDataPublishLiveEty> getIAQIPublishEtyByCityNameResult;

    /**
     * 获取getIAQIPublishEtyByCityNameResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfIAQIDataPublishLiveEty }{@code >}
     *     
     */
    public JAXBElement<ArrayOfIAQIDataPublishLiveEty> getGetIAQIPublishEtyByCityNameResult() {
        return getIAQIPublishEtyByCityNameResult;
    }

    /**
     * 设置getIAQIPublishEtyByCityNameResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfIAQIDataPublishLiveEty }{@code >}
     *     
     */
    public void setGetIAQIPublishEtyByCityNameResult(JAXBElement<ArrayOfIAQIDataPublishLiveEty> value) {
        this.getIAQIPublishEtyByCityNameResult = value;
    }

}
