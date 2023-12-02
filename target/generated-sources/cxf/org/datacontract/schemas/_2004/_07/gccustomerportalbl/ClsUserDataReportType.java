
package org.datacontract.schemas._2004._07.gccustomerportalbl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clsUserData.ReportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="clsUserData.ReportType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PolicySchedule"/&gt;
 *     &lt;enumeration value="NilEndorsementSchedule"/&gt;
 *     &lt;enumeration value="NonNilEndorsementSchedule"/&gt;
 *     &lt;enumeration value="RenewalNoticeReport"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "clsUserData.ReportType")
@XmlEnum
public enum ClsUserDataReportType {

    @XmlEnumValue("PolicySchedule")
    POLICY_SCHEDULE("PolicySchedule"),
    @XmlEnumValue("NilEndorsementSchedule")
    NIL_ENDORSEMENT_SCHEDULE("NilEndorsementSchedule"),
    @XmlEnumValue("NonNilEndorsementSchedule")
    NON_NIL_ENDORSEMENT_SCHEDULE("NonNilEndorsementSchedule"),
    @XmlEnumValue("RenewalNoticeReport")
    RENEWAL_NOTICE_REPORT("RenewalNoticeReport");
    private final String value;

    ClsUserDataReportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClsUserDataReportType fromValue(String v) {
        for (ClsUserDataReportType c: ClsUserDataReportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
