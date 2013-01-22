
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
 * <p>AQIChartValue complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AQIChartValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsLimits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MonValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Movalue24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PositionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "AQIChartValue", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", propOrder = {
    "isLimits",
    "monValue",
    "movalue24",
    "positionName",
    "stationCode",
    "timePoint"
})
public class AQIChartValue {

    @XmlElementRef(name = "IsLimits", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", type = JAXBElement.class)
    protected JAXBElement<String> isLimits;
    @XmlElementRef(name = "MonValue", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", type = JAXBElement.class)
    protected JAXBElement<String> monValue;
    @XmlElementRef(name = "Movalue24", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", type = JAXBElement.class)
    protected JAXBElement<String> movalue24;
    @XmlElementRef(name = "PositionName", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", type = JAXBElement.class)
    protected JAXBElement<String> positionName;
    @XmlElementRef(name = "StationCode", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", type = JAXBElement.class)
    protected JAXBElement<String> stationCode;
    @XmlElement(name = "TimePoint")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timePoint;

    /**
     * 获取isLimits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsLimits() {
        return isLimits;
    }

    /**
     * 设置isLimits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsLimits(JAXBElement<String> value) {
        this.isLimits = value;
    }

    /**
     * 获取monValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMonValue() {
        return monValue;
    }

    /**
     * 设置monValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMonValue(JAXBElement<String> value) {
        this.monValue = value;
    }

    /**
     * 获取movalue24属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMovalue24() {
        return movalue24;
    }

    /**
     * 设置movalue24属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMovalue24(JAXBElement<String> value) {
        this.movalue24 = value;
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
     * 获取stationCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStationCode() {
        return stationCode;
    }

    /**
     * 设置stationCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStationCode(JAXBElement<String> value) {
        this.stationCode = value;
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
