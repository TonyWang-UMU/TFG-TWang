//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.01 at 09:05:39 PM CEST 
//


package org.opencds.vmr.v1_0.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelecommunicationCapability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TelecommunicationCapability">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="voice"/>
 *     &lt;enumeration value="fax"/>
 *     &lt;enumeration value="data"/>
 *     &lt;enumeration value="tty"/>
 *     &lt;enumeration value="sms"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TelecommunicationCapability", namespace = "org.opencds.vmr.v1_0.schema.datatypes")
@XmlEnum
public enum TelecommunicationCapability {


    /**
     * Voice : This device can receive voice calls (i.e. talking to another person, or a recording device, or a voice activated computer)
     * 
     */
    @XmlEnumValue("voice")
    VOICE("voice"),

    /**
     * Fax : This device can receive faxes.
     * 
     */
    @XmlEnumValue("fax")
    FAX("fax"),

    /**
     * Data : This device can receive data calls (i.e. modem)
     * 
     */
    @XmlEnumValue("data")
    DATA("data"),

    /**
     * Text : This device is a text telephone.
     * 
     */
    @XmlEnumValue("tty")
    TTY("tty"),

    /**
     * SMS : This device can receive SMS messages
     * 
     */
    @XmlEnumValue("sms")
    SMS("sms");
    private final String value;

    TelecommunicationCapability(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TelecommunicationCapability fromValue(String v) {
        for (TelecommunicationCapability c: TelecommunicationCapability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
