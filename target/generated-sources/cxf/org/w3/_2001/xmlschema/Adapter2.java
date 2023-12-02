
package org.w3._2001.xmlschema;

import java.time.LocalDate;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, LocalDate>
{


    public LocalDate unmarshal(String value) {
        return (sample.camel.adapter.DataTypeAdapter.parseDate(value));
    }

    public String marshal(LocalDate value) {
        return (sample.camel.adapter.DataTypeAdapter.printDate(value));
    }

}
