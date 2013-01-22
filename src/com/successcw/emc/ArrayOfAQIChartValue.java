
package com.successcw.emc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfAQIChartValue complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAQIChartValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AQIChartValue" type="{http://schemas.datacontract.org/2004/07/EnvCriteria.BLL}AQIChartValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAQIChartValue", namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", propOrder = {
    "aqiChartValue"
})
public class ArrayOfAQIChartValue {

    @XmlElement(name = "AQIChartValue", nillable = true)
    protected List<AQIChartValue> aqiChartValue;

    /**
     * Gets the value of the aqiChartValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aqiChartValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAQIChartValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AQIChartValue }
     * 
     * 
     */
    public List<AQIChartValue> getAQIChartValue() {
        if (aqiChartValue == null) {
            aqiChartValue = new ArrayList<AQIChartValue>();
        }
        return this.aqiChartValue;
    }

}
