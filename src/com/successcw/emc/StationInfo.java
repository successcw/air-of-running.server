
package com.successcw.emc;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StationInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="StationInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Fundway.Env.DataAccess}BaseEntity">
 *       &lt;sequence>
 *         &lt;element name="AGCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GKCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IndicatorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PositionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SKCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StationState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Substation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YGCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationInfo", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", propOrder = {
    "agCode",
    "city",
    "gkCode",
    "groupCode",
    "id",
    "indicatorCode",
    "latitude",
    "longitude",
    "positionName",
    "skCode",
    "stationCode",
    "stationState",
    "substation",
    "ygCode"
})
public class StationInfo
    extends BaseEntity
{

    @XmlElementRef(name = "AGCode", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> agCode;
    @XmlElementRef(name = "City", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "GKCode", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> gkCode;
    @XmlElementRef(name = "GroupCode", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> groupCode;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElementRef(name = "IndicatorCode", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> indicatorCode;
    @XmlElement(name = "Latitude")
    protected BigDecimal latitude;
    @XmlElement(name = "Longitude")
    protected BigDecimal longitude;
    @XmlElementRef(name = "PositionName", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> positionName;
    @XmlElementRef(name = "SKCode", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> skCode;
    @XmlElementRef(name = "StationCode", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> stationCode;
    @XmlElementRef(name = "StationState", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> stationState;
    @XmlElementRef(name = "Substation", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> substation;
    @XmlElementRef(name = "YGCode", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> ygCode;

    /**
     * 获取agCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAGCode() {
        return agCode;
    }

    /**
     * 设置agCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAGCode(JAXBElement<String> value) {
        this.agCode = value;
    }

    /**
     * 获取city属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * 设置city属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCity(JAXBElement<String> value) {
        this.city = value;
    }

    /**
     * 获取gkCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGKCode() {
        return gkCode;
    }

    /**
     * 设置gkCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGKCode(JAXBElement<String> value) {
        this.gkCode = value;
    }

    /**
     * 获取groupCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGroupCode() {
        return groupCode;
    }

    /**
     * 设置groupCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGroupCode(JAXBElement<String> value) {
        this.groupCode = value;
    }

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
     * 获取indicatorCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndicatorCode() {
        return indicatorCode;
    }

    /**
     * 设置indicatorCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndicatorCode(JAXBElement<String> value) {
        this.indicatorCode = value;
    }

    /**
     * 获取latitude属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * 设置latitude属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatitude(BigDecimal value) {
        this.latitude = value;
    }

    /**
     * 获取longitude属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * 设置longitude属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLongitude(BigDecimal value) {
        this.longitude = value;
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
     * 获取skCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSKCode() {
        return skCode;
    }

    /**
     * 设置skCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSKCode(JAXBElement<String> value) {
        this.skCode = value;
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
     * 获取stationState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStationState() {
        return stationState;
    }

    /**
     * 设置stationState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStationState(JAXBElement<String> value) {
        this.stationState = value;
    }

    /**
     * 获取substation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubstation() {
        return substation;
    }

    /**
     * 设置substation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubstation(JAXBElement<String> value) {
        this.substation = value;
    }

    /**
     * 获取ygCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getYGCode() {
        return ygCode;
    }

    /**
     * 设置ygCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setYGCode(JAXBElement<String> value) {
        this.ygCode = value;
    }

}
