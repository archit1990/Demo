
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKeyValueOfanyTypeanyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfanyTypeanyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyValueOfanyTypeanyType" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValueOfanyTypeanyType", propOrder = {
    "keyValueOfanyTypeanyType"
})
public class ArrayOfKeyValueOfanyTypeanyType {

    @XmlElement(name = "KeyValueOfanyTypeanyType")
    protected List<ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType> keyValueOfanyTypeanyType;

    /**
     * Gets the value of the keyValueOfanyTypeanyType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfanyTypeanyType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfanyTypeanyType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType> getKeyValueOfanyTypeanyType() {
        if (keyValueOfanyTypeanyType == null) {
            keyValueOfanyTypeanyType = new ArrayList<ArrayOfKeyValueOfanyTypeanyType.KeyValueOfanyTypeanyType>();
        }
        return this.keyValueOfanyTypeanyType;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "key",
        "value"
    })
    public static class KeyValueOfanyTypeanyType {

        @XmlElement(name = "Key", required = true, nillable = true)
        protected Object key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected Object value;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setKey(Object value) {
            this.key = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setValue(Object value) {
            this.value = value;
        }

    }

}
