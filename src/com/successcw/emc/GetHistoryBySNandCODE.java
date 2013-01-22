
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
 *         &lt;element name="PositionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PollutantCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "positionName",
    "pollutantCode"
})
@XmlRootElement(name = "GetHistoryBySNandCODE")
public class GetHistoryBySNandCODE {

    @XmlElementRef(name = "PositionName", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> positionName;
    @XmlElementRef(name = "PollutantCode", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> pollutantCode;

    /**
     * 获取positionName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPositionName() {
        return positionName;
    }

    /**
     * 设置positionName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPositionName(JAXBElement<String> value) {
        this.positionName = value;
    }

    /**
     * 获取pollutantCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPollutantCode() {
        return pollutantCode;
    }

    /**
     * 设置pollutantCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPollutantCode(JAXBElement<String> value) {
        this.pollutantCode = value;
    }

}
