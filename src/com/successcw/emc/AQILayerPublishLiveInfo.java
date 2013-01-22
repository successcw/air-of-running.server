
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
 * <p>AQILayerPublishLiveInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AQILayerPublishLiveInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Fundway.Env.DataAccess}BaseEntity">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LayerUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PollutantCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimePoint" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AQILayerPublishLiveInfo", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", propOrder = {
    "id",
    "layerUrl",
    "pollutantCode",
    "timePoint"
})
public class AQILayerPublishLiveInfo
    extends BaseEntity
{

    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElementRef(name = "LayerUrl", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> layerUrl;
    @XmlElementRef(name = "PollutantCode", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> pollutantCode;
    @XmlElement(name = "TimePoint")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timePoint;

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * 获取layerUrl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLayerUrl() {
        return layerUrl;
    }

    /**
     * 设置layerUrl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLayerUrl(JAXBElement<String> value) {
        this.layerUrl = value;
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
