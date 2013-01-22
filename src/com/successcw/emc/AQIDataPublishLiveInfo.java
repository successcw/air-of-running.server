
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
 * <p>AQIDataPublishLiveInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AQIDataPublishLiveInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Fundway.Env.DataAccess}BaseEntity">
 *       &lt;sequence>
 *         &lt;element name="AQI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CO_24h" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NO2_24h" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="O3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="O3_24h" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="O3_8h" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="O3_8h_24h" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PM10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PM10_24h" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PM2_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PM2_5_24h" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PositionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPollutant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SO2_24h" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimePoint" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Unheathful" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AQIDataPublishLiveInfo", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", propOrder = {
    "aqi",
    "area",
    "co",
    "co24H",
    "id",
    "latitude",
    "longitude",
    "no2",
    "no224H",
    "o3",
    "o324H",
    "o38H",
    "o38H24H",
    "orderId",
    "pm10",
    "pm1024H",
    "pm25",
    "pm2524H",
    "positionName",
    "primaryPollutant",
    "quality",
    "so2",
    "so224H",
    "stationCode",
    "timePoint",
    "unheathful"
})
public class AQIDataPublishLiveInfo
    extends BaseEntity
{

    @XmlElementRef(name = "AQI", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> aqi;
    @XmlElementRef(name = "Area", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> area;
    @XmlElementRef(name = "CO", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> co;
    @XmlElementRef(name = "CO_24h", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> co24H;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElementRef(name = "Latitude", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> latitude;
    @XmlElementRef(name = "Longitude", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> longitude;
    @XmlElementRef(name = "NO2", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> no2;
    @XmlElementRef(name = "NO2_24h", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> no224H;
    @XmlElementRef(name = "O3", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> o3;
    @XmlElementRef(name = "O3_24h", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> o324H;
    @XmlElementRef(name = "O3_8h", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> o38H;
    @XmlElementRef(name = "O3_8h_24h", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> o38H24H;
    @XmlElement(name = "OrderId")
    protected Integer orderId;
    @XmlElementRef(name = "PM10", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> pm10;
    @XmlElementRef(name = "PM10_24h", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> pm1024H;
    @XmlElementRef(name = "PM2_5", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> pm25;
    @XmlElementRef(name = "PM2_5_24h", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> pm2524H;
    @XmlElementRef(name = "PositionName", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> positionName;
    @XmlElementRef(name = "PrimaryPollutant", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> primaryPollutant;
    @XmlElementRef(name = "Quality", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> quality;
    @XmlElementRef(name = "SO2", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> so2;
    @XmlElementRef(name = "SO2_24h", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> so224H;
    @XmlElementRef(name = "StationCode", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> stationCode;
    @XmlElement(name = "TimePoint")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timePoint;
    @XmlElementRef(name = "Unheathful", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", type = JAXBElement.class)
    protected JAXBElement<String> unheathful;

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
     * 获取area属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArea() {
        return area;
    }

    /**
     * 设置area属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArea(JAXBElement<String> value) {
        this.area = value;
    }

    /**
     * 获取co属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCO() {
        return co;
    }

    /**
     * 设置co属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCO(JAXBElement<String> value) {
        this.co = value;
    }

    /**
     * 获取co24H属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCO24H() {
        return co24H;
    }

    /**
     * 设置co24H属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCO24H(JAXBElement<String> value) {
        this.co24H = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getID() {
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
    public void setID(Integer value) {
        this.id = value;
    }

    /**
     * 获取latitude属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLatitude() {
        return latitude;
    }

    /**
     * 设置latitude属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLatitude(JAXBElement<String> value) {
        this.latitude = value;
    }

    /**
     * 获取longitude属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLongitude() {
        return longitude;
    }

    /**
     * 设置longitude属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLongitude(JAXBElement<String> value) {
        this.longitude = value;
    }

    /**
     * 获取no2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNO2() {
        return no2;
    }

    /**
     * 设置no2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNO2(JAXBElement<String> value) {
        this.no2 = value;
    }

    /**
     * 获取no224H属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNO224H() {
        return no224H;
    }

    /**
     * 设置no224H属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNO224H(JAXBElement<String> value) {
        this.no224H = value;
    }

    /**
     * 获取o3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getO3() {
        return o3;
    }

    /**
     * 设置o3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setO3(JAXBElement<String> value) {
        this.o3 = value;
    }

    /**
     * 获取o324H属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getO324H() {
        return o324H;
    }

    /**
     * 设置o324H属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setO324H(JAXBElement<String> value) {
        this.o324H = value;
    }

    /**
     * 获取o38H属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getO38H() {
        return o38H;
    }

    /**
     * 设置o38H属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setO38H(JAXBElement<String> value) {
        this.o38H = value;
    }

    /**
     * 获取o38H24H属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getO38H24H() {
        return o38H24H;
    }

    /**
     * 设置o38H24H属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setO38H24H(JAXBElement<String> value) {
        this.o38H24H = value;
    }

    /**
     * 获取orderId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 设置orderId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderId(Integer value) {
        this.orderId = value;
    }

    /**
     * 获取pm10属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPM10() {
        return pm10;
    }

    /**
     * 设置pm10属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPM10(JAXBElement<String> value) {
        this.pm10 = value;
    }

    /**
     * 获取pm1024H属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPM1024H() {
        return pm1024H;
    }

    /**
     * 设置pm1024H属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPM1024H(JAXBElement<String> value) {
        this.pm1024H = value;
    }

    /**
     * 获取pm25属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPM25() {
        return pm25;
    }

    /**
     * 设置pm25属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPM25(JAXBElement<String> value) {
        this.pm25 = value;
    }

    /**
     * 获取pm2524H属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPM2524H() {
        return pm2524H;
    }

    /**
     * 设置pm2524H属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPM2524H(JAXBElement<String> value) {
        this.pm2524H = value;
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
     * 获取so2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSO2() {
        return so2;
    }

    /**
     * 设置so2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSO2(JAXBElement<String> value) {
        this.so2 = value;
    }

    /**
     * 获取so224H属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSO224H() {
        return so224H;
    }

    /**
     * 设置so224H属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSO224H(JAXBElement<String> value) {
        this.so224H = value;
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

    /**
     * 获取unheathful属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnheathful() {
        return unheathful;
    }

    /**
     * 设置unheathful属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnheathful(JAXBElement<String> value) {
        this.unheathful = value;
    }

}
