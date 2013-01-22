
package com.successcw.emc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfAQIDataPublishLiveInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAQIDataPublishLiveInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AQIDataPublishLiveInfo" type="{http://schemas.datacontract.org/2004/07/EnvCriteria.Model}AQIDataPublishLiveInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAQIDataPublishLiveInfo", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", propOrder = {
    "aqiDataPublishLiveInfo"
})
public class ArrayOfAQIDataPublishLiveInfo {

    @XmlElement(name = "AQIDataPublishLiveInfo", nillable = true)
    protected List<AQIDataPublishLiveInfo> aqiDataPublishLiveInfo;

    /**
     * Gets the value of the aqiDataPublishLiveInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aqiDataPublishLiveInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAQIDataPublishLiveInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AQIDataPublishLiveInfo }
     * 
     * 
     */
    public List<AQIDataPublishLiveInfo> getAQIDataPublishLiveInfo() {
        if (aqiDataPublishLiveInfo == null) {
            aqiDataPublishLiveInfo = new ArrayList<AQIDataPublishLiveInfo>();
        }
        return this.aqiDataPublishLiveInfo;
    }

}
