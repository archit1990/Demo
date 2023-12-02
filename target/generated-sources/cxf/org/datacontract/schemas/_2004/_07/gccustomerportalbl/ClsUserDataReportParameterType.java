
package org.datacontract.schemas._2004._07.gccustomerportalbl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clsUserData.ReportParameterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="clsUserData.ReportParameterType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PolicyNumber"/&gt;
 *     &lt;enumeration value="ProposalNumber"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "clsUserData.ReportParameterType")
@XmlEnum
public enum ClsUserDataReportParameterType {

    @XmlEnumValue("PolicyNumber")
    POLICY_NUMBER("PolicyNumber"),
    @XmlEnumValue("ProposalNumber")
    PROPOSAL_NUMBER("ProposalNumber");
    private final String value;

    ClsUserDataReportParameterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClsUserDataReportParameterType fromValue(String v) {
        for (ClsUserDataReportParameterType c: ClsUserDataReportParameterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
