
package com.successcw.emc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88cNA_P complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88cNA_P">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValueOfstringArrayOfAQIChartValueQi88cNA_P" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/EnvCriteria.BLL}ArrayOfAQIChartValue"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88cNA_P", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", propOrder = {
    "keyValueOfstringArrayOfAQIChartValueQi88CNAP"
})
public class ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP {

    @XmlElement(name = "KeyValueOfstringArrayOfAQIChartValueQi88cNA_P")
    protected List<ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP.KeyValueOfstringArrayOfAQIChartValueQi88CNAP> keyValueOfstringArrayOfAQIChartValueQi88CNAP;

    /**
     * Gets the value of the keyValueOfstringArrayOfAQIChartValueQi88CNAP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfstringArrayOfAQIChartValueQi88CNAP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfstringArrayOfAQIChartValueQi88CNAP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP.KeyValueOfstringArrayOfAQIChartValueQi88CNAP }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP.KeyValueOfstringArrayOfAQIChartValueQi88CNAP> getKeyValueOfstringArrayOfAQIChartValueQi88CNAP() {
        if (keyValueOfstringArrayOfAQIChartValueQi88CNAP == null) {
            keyValueOfstringArrayOfAQIChartValueQi88CNAP = new ArrayList<ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP.KeyValueOfstringArrayOfAQIChartValueQi88CNAP>();
        }
        return this.keyValueOfstringArrayOfAQIChartValueQi88CNAP;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/EnvCriteria.BLL}ArrayOfAQIChartValue"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "key",
        "value"
    })
    public static class KeyValueOfstringArrayOfAQIChartValueQi88CNAP {

        @XmlElement(name = "Key", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", required = true, nillable = true)
        protected String key;
        @XmlElement(name = "Value", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", required = true, nillable = true)
        protected ArrayOfAQIChartValue value;

        /**
         * 获取key属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * 设置key属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfAQIChartValue }
         *     
         */
        public ArrayOfAQIChartValue getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfAQIChartValue }
         *     
         */
        public void setValue(ArrayOfAQIChartValue value) {
            this.value = value;
        }

    }

}
