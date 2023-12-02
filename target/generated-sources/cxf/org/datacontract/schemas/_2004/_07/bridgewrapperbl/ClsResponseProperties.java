
package org.datacontract.schemas._2004._07.bridgewrapperbl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clsResponseProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsResponseProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/BridgeWrapperBL}clsCommonProperties"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsResponseProperties")
@XmlSeeAlso({
    QuotationResponse.class,
    PolicyResponse.class,
    PolicyCancellationResponse.class,
    PaymentEntryResponse.class,
    GenerateScheduleResponse.class
})
public class ClsResponseProperties
    extends ClsCommonProperties
{


}
