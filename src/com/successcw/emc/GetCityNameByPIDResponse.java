
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
 *         &lt;element name="GetCityNameByPIDResult" type="{http://schemas.datacontract.org/2004/07/EnvCriteria.Model}ArrayOfCityInfo" minOccurs="0"/>
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
    "getCityNameByPIDResult"
})
@XmlRootElement(name = "GetCityNameByPIDResponse")
public class GetCityNameByPIDResponse {

    @XmlElementRef(name = "GetCityNameByPIDResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCityInfo> getCityNameByPIDResult;

    /**
     * 获取getCityNameByPIDResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCityInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCityInfo> getGetCityNameByPIDResult() {
        return getCityNameByPIDResult;
    }

    /**
     * 设置getCityNameByPIDResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCityInfo }{@code >}
     *     
     */
    public void setGetCityNameByPIDResult(JAXBElement<ArrayOfCityInfo> value) {
        this.getCityNameByPIDResult = value;
    }

}
