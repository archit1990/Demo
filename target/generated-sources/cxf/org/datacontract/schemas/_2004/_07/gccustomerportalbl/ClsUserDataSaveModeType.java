
package org.datacontract.schemas._2004._07.gccustomerportalbl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clsUserData.SaveModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="clsUserData.SaveModeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NewPolicy"/&gt;
 *     &lt;enumeration value="ModifyPolicy"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "clsUserData.SaveModeType")
@XmlEnum
public enum ClsUserDataSaveModeType {

    @XmlEnumValue("NewPolicy")
    NEW_POLICY("NewPolicy"),
    @XmlEnumValue("ModifyPolicy")
    MODIFY_POLICY("ModifyPolicy");
    private final String value;

    ClsUserDataSaveModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClsUserDataSaveModeType fromValue(String v) {
        for (ClsUserDataSaveModeType c: ClsUserDataSaveModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
