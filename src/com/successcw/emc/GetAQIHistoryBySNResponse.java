
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
 *         &lt;element name="GetAQIHistoryBySNResult" type="{http://schemas.datacontract.org/2004/07/EnvCriteria.Model}ArrayOfAQIDataPublishHistoryInfo" minOccurs="0"/>
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
    "getAQIHistoryBySNResult"
})
@XmlRootElement(name = "GetAQIHistoryBySNResponse")
public class GetAQIHistoryBySNResponse {

    @XmlElementRef(name = "GetAQIHistoryBySNResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfAQIDataPublishHistoryInfo> getAQIHistoryBySNResult;

    /**
     * 获取getAQIHistoryBySNResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAQIDataPublishHistoryInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAQIDataPublishHistoryInfo> getGetAQIHistoryBySNResult() {
        return getAQIHistoryBySNResult;
    }

    /**
     * 设置getAQIHistoryBySNResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAQIDataPublishHistoryInfo }{@code >}
     *     
     */
    public void setGetAQIHistoryBySNResult(JAXBElement<ArrayOfAQIDataPublishHistoryInfo> value) {
        this.getAQIHistoryBySNResult = value;
    }

}
