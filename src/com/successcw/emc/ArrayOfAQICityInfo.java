
package com.successcw.emc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfAQICityInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAQICityInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AQICityInfo" type="{http://schemas.datacontract.org/2004/07/EnvCriteria.Model}AQICityInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAQICityInfo", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", propOrder = {
    "aqiCityInfo"
})
public class ArrayOfAQICityInfo {

    @XmlElement(name = "AQICityInfo", nillable = true)
    protected List<AQICityInfo> aqiCityInfo;

    /**
     * Gets the value of the aqiCityInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aqiCityInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAQICityInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AQICityInfo }
     * 
     * 
     */
    public List<AQICityInfo> getAQICityInfo() {
        if (aqiCityInfo == null) {
            aqiCityInfo = new ArrayList<AQICityInfo>();
        }
        return this.aqiCityInfo;
    }

}
