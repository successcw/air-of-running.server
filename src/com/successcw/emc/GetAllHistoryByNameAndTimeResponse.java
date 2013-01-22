
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
 *         &lt;element name="GetAllHistoryByNameAndTimeResult" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88cNA_P" minOccurs="0"/>
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
    "getAllHistoryByNameAndTimeResult"
})
@XmlRootElement(name = "GetAllHistoryByNameAndTimeResponse")
public class GetAllHistoryByNameAndTimeResponse {

    @XmlElementRef(name = "GetAllHistoryByNameAndTimeResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP> getAllHistoryByNameAndTimeResult;

    /**
     * 获取getAllHistoryByNameAndTimeResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP> getGetAllHistoryByNameAndTimeResult() {
        return getAllHistoryByNameAndTimeResult;
    }

    /**
     * 设置getAllHistoryByNameAndTimeResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP }{@code >}
     *     
     */
    public void setGetAllHistoryByNameAndTimeResult(JAXBElement<ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP> value) {
        this.getAllHistoryByNameAndTimeResult = value;
    }

}
