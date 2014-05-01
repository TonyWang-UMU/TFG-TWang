//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.01 at 09:01:02 PM CEST 
//


package org.opencds.vmr.v1_0.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelecommunicationAddressUse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TelecommunicationAddressUse">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="HP"/>
 *     &lt;enumeration value="HV"/>
 *     &lt;enumeration value="WP"/>
 *     &lt;enumeration value="DIR"/>
 *     &lt;enumeration value="PUB"/>
 *     &lt;enumeration value="BAD"/>
 *     &lt;enumeration value="TMP"/>
 *     &lt;enumeration value="AS"/>
 *     &lt;enumeration value="EC"/>
 *     &lt;enumeration value="MC"/>
 *     &lt;enumeration value="PG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TelecommunicationAddressUse", namespace = "org.opencds.vmr.v1_0.schema.datatypes")
@XmlEnum
public enum TelecommunicationAddressUse {


    /**
     * Home address : A communication address at a home, attempted contacts for business purposes might intrude privacy and chances are one will contact family or other household members instead of the person one wishes to call. Typically used with urgent cases, or if no other contacts are available
     * 
     */
    H,

    /**
     * Primary Home : The primary home, to reach a person after business hours 
     * 
     */
    HP,

    /**
     * Vacation Home : A vacation home, to reach a person while on vacation 
     * 
     */
    HV,

    /**
     * Work Place : An office address. First choice for business related contacts during business hours 
     * 
     */
    WP,

    /**
     * Direct : Indicates a work place address or telecommunication address that reaches the individual or organization directly without intermediaries. For phones, often referred to as a 'private line' 
     * 
     */
    DIR,

    /**
     * Public : Indicates a work place address or telecommunication address that is a 'standard' address which may reach a reception service, mail-room, or other intermediary prior to the target entity 
     * 
     */
    PUB,

    /**
     * Bad address : A flag indicating that the address is bad, in fact, useless 
     * 
     */
    BAD,

    /**
     * Temporary address : A temporary address, may be good for visit or mailing. Note that an address history can provide more detailed information 
     * 
     */
    TMP,

    /**
     * Answering Service : An automated answering machine used for less urgent cases and if the main purpose of contact is to leave a message or access an automated announcement
     * 
     */
    AS,

    /**
     * Emergency Contact : A contact specifically designated to be used for emergencies. This is the first choice in emergencies, independent of any other use codes 
     * 
     */
    EC,

    /**
     * Mobile Contact : A telecommunication device that moves and stays with its owner. May have characteristics of all other use codes, suitable for urgent matters, not the first choice for routine business 
     * 
     */
    MC,

    /**
     * Pager: A paging device suitable to solicit a callback or to leave a very short message 
     * 
     */
    PG;

    public String value() {
        return name();
    }

    public static TelecommunicationAddressUse fromValue(String v) {
        return valueOf(v);
    }

}
