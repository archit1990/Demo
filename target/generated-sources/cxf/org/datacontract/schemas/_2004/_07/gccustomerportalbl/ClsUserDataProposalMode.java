
package org.datacontract.schemas._2004._07.gccustomerportalbl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clsUserData.ProposalMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="clsUserData.ProposalMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DetailQuote"/&gt;
 *     &lt;enumeration value="QuotationModification"/&gt;
 *     &lt;enumeration value="QuoteToProposal"/&gt;
 *     &lt;enumeration value="SaveProposal"/&gt;
 *     &lt;enumeration value="QuoteToProposalWithModification"/&gt;
 *     &lt;enumeration value="ProposalModification"/&gt;
 *     &lt;enumeration value="RenewalModification"/&gt;
 *     &lt;enumeration value="SaveDeclaration"/&gt;
 *     &lt;enumeration value="SaveNotNilEndorsement"/&gt;
 *     &lt;enumeration value="SaveNilEndorsement"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "clsUserData.ProposalMode")
@XmlEnum
public enum ClsUserDataProposalMode {

    @XmlEnumValue("DetailQuote")
    DETAIL_QUOTE("DetailQuote"),
    @XmlEnumValue("QuotationModification")
    QUOTATION_MODIFICATION("QuotationModification"),
    @XmlEnumValue("QuoteToProposal")
    QUOTE_TO_PROPOSAL("QuoteToProposal"),
    @XmlEnumValue("SaveProposal")
    SAVE_PROPOSAL("SaveProposal"),
    @XmlEnumValue("QuoteToProposalWithModification")
    QUOTE_TO_PROPOSAL_WITH_MODIFICATION("QuoteToProposalWithModification"),
    @XmlEnumValue("ProposalModification")
    PROPOSAL_MODIFICATION("ProposalModification"),
    @XmlEnumValue("RenewalModification")
    RENEWAL_MODIFICATION("RenewalModification"),
    @XmlEnumValue("SaveDeclaration")
    SAVE_DECLARATION("SaveDeclaration"),
    @XmlEnumValue("SaveNotNilEndorsement")
    SAVE_NOT_NIL_ENDORSEMENT("SaveNotNilEndorsement"),
    @XmlEnumValue("SaveNilEndorsement")
    SAVE_NIL_ENDORSEMENT("SaveNilEndorsement");
    private final String value;

    ClsUserDataProposalMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClsUserDataProposalMode fromValue(String v) {
        for (ClsUserDataProposalMode c: ClsUserDataProposalMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
