
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
 *         &lt;element name="GetCityNameByPNameResult" type="{http://schemas.datacontract.org/2004/07/EnvCriteria.Model}ArrayOfCityInfo" minOccurs="0"/>
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
    "getCityNameByPNameResult"
})
@XmlRootElement(name = "GetCityNameByPNameResponse")
public class GetCityNameByPNameResponse {

    @XmlElementRef(name = "GetCityNameByPNameResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCityInfo> getCityNameByPNameResult;

    /**
     * 获取getCityNameByPNameResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCityInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCityInfo> getGetCityNameByPNameResult() {
        return getCityNameByPNameResult;
    }

    /**
     * 设置getCityNameByPNameResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCityInfo }{@code >}
     *     
     */
    public void setGetCityNameByPNameResult(JAXBElement<ArrayOfCityInfo> value) {
        this.getCityNameByPNameResult = value;
    }

}
