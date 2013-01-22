
package com.successcw.emc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfAQIDataPublishHistoryInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAQIDataPublishHistoryInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AQIDataPublishHistoryInfo" type="{http://schemas.datacontract.org/2004/07/EnvCriteria.Model}AQIDataPublishHistoryInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAQIDataPublishHistoryInfo", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", propOrder = {
    "aqiDataPublishHistoryInfo"
})
public class ArrayOfAQIDataPublishHistoryInfo {

    @XmlElement(name = "AQIDataPublishHistoryInfo", nillable = true)
    protected List<AQIDataPublishHistoryInfo> aqiDataPublishHistoryInfo;

    /**
     * Gets the value of the aqiDataPublishHistoryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aqiDataPublishHistoryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAQIDataPublishHistoryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AQIDataPublishHistoryInfo }
     * 
     * 
     */
    public List<AQIDataPublishHistoryInfo> getAQIDataPublishHistoryInfo() {
        if (aqiDataPublishHistoryInfo == null) {
            aqiDataPublishHistoryInfo = new ArrayList<AQIDataPublishHistoryInfo>();
        }
        return this.aqiDataPublishHistoryInfo;
    }

}
