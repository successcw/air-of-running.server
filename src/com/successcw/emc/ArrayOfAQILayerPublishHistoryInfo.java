
package com.successcw.emc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfAQILayerPublishHistoryInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAQILayerPublishHistoryInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AQILayerPublishHistoryInfo" type="{http://schemas.datacontract.org/2004/07/EnvCriteria.Model}AQILayerPublishHistoryInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAQILayerPublishHistoryInfo", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", propOrder = {
    "aqiLayerPublishHistoryInfo"
})
public class ArrayOfAQILayerPublishHistoryInfo {

    @XmlElement(name = "AQILayerPublishHistoryInfo", nillable = true)
    protected List<AQILayerPublishHistoryInfo> aqiLayerPublishHistoryInfo;

    /**
     * Gets the value of the aqiLayerPublishHistoryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aqiLayerPublishHistoryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAQILayerPublishHistoryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AQILayerPublishHistoryInfo }
     * 
     * 
     */
    public List<AQILayerPublishHistoryInfo> getAQILayerPublishHistoryInfo() {
        if (aqiLayerPublishHistoryInfo == null) {
            aqiLayerPublishHistoryInfo = new ArrayList<AQILayerPublishHistoryInfo>();
        }
        return this.aqiLayerPublishHistoryInfo;
    }

}
