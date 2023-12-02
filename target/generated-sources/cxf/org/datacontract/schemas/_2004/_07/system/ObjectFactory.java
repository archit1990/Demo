
package org.datacontract.schemas._2004._07.system;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.system package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _StringBuilder_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Text", "StringBuilder");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.system
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StringBuilder }
     * 
     */
    public StringBuilder createStringBuilder() {
        return new StringBuilder();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringBuilder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringBuilder }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Text", name = "StringBuilder")
    public JAXBElement<StringBuilder> createStringBuilder(StringBuilder value) {
        return new JAXBElement<StringBuilder>(_StringBuilder_QNAME, StringBuilder.class, null, value);
    }

}
