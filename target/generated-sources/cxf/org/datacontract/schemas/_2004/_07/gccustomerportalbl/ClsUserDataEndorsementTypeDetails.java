
package org.datacontract.schemas._2004._07.gccustomerportalbl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clsUserData.EndorsementTypeDetails.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="clsUserData.EndorsementTypeDetails"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CustomerDetailsChangeEndorsement"/&gt;
 *     &lt;enumeration value="OtherEndorsement"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "clsUserData.EndorsementTypeDetails")
@XmlEnum
public enum ClsUserDataEndorsementTypeDetails {

    @XmlEnumValue("CustomerDetailsChangeEndorsement")
    CUSTOMER_DETAILS_CHANGE_ENDORSEMENT("CustomerDetailsChangeEndorsement"),
    @XmlEnumValue("OtherEndorsement")
    OTHER_ENDORSEMENT("OtherEndorsement");
    private final String value;

    ClsUserDataEndorsementTypeDetails(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClsUserDataEndorsementTypeDetails fromValue(String v) {
        for (ClsUserDataEndorsementTypeDetails c: ClsUserDataEndorsementTypeDetails.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
