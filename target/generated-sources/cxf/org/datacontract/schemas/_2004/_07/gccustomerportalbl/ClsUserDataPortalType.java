
package org.datacontract.schemas._2004._07.gccustomerportalbl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clsUserData.PortalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="clsUserData.PortalType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CustomerPortal"/&gt;
 *     &lt;enumeration value="IntermediaryPortal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "clsUserData.PortalType")
@XmlEnum
public enum ClsUserDataPortalType {

    @XmlEnumValue("CustomerPortal")
    CUSTOMER_PORTAL("CustomerPortal"),
    @XmlEnumValue("IntermediaryPortal")
    INTERMEDIARY_PORTAL("IntermediaryPortal");
    private final String value;

    ClsUserDataPortalType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClsUserDataPortalType fromValue(String v) {
        for (ClsUserDataPortalType c: ClsUserDataPortalType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
