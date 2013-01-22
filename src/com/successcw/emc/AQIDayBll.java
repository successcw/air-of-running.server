
package com.successcw.emc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>AQIDayBll complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AQIDayBll">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AQI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PositionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPollutant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimePoint" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AQIDayBll", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", propOrder = {
    "aqi",
    "positionName",
    "primaryPollutant",
    "quality",
    "timePoint"
})
public class AQIDayBll {

    @XmlElementRef(name = "AQI", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", type = JAXBElement.class)
    protected JAXBElement<String> aqi;
    @XmlElementRef(name = "PositionName", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", type = JAXBElement.class)
    protected JAXBElement<String> positionName;
    @XmlElementRef(name = "PrimaryPollutant", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", type = JAXBElement.class)
    protected JAXBElement<String> primaryPollutant;
    @XmlElementRef(name = "Quality", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", type = JAXBElement.class)
    protected JAXBElement<String> quality;
    @XmlElement(name = "TimePoint")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timePoint;

    /**
     * 获取aqi属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAQI() {
        return aqi;
    }

    /**
     * 设置aqi属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAQI(JAXBElement<String> value) {
        this.aqi = value;
    }

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
     * 获取primaryPollutant属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryPollutant() {
        return primaryPollutant;
    }

    /**
     * 设置primaryPollutant属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryPollutant(JAXBElement<String> value) {
        this.primaryPollutant = value;
    }

    /**
     * 获取quality属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuality() {
        return quality;
    }

    /**
     * 设置quality属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuality(JAXBElement<String> value) {
        this.quality = value;
    }

    /**
     * 获取timePoint属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimePoint() {
        return timePoint;
    }

    /**
     * 设置timePoint属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimePoint(XMLGregorianCalendar value) {
        this.timePoint = value;
    }

}
