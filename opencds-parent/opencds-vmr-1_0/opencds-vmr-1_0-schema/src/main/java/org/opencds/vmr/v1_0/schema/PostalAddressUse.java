//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.01 at 08:52:49 PM CEST 
//


package org.opencds.vmr.v1_0.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostalAddressUse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PostalAddressUse">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="HP"/>
 *     &lt;enumeration value="HV"/>
 *     &lt;enumeration value="WP"/>
 *     &lt;enumeration value="DIR"/>
 *     &lt;enumeration value="PUB"/>
 *     &lt;enumeration value="BAD"/>
 *     &lt;enumeration value="PHYS"/>
 *     &lt;enumeration value="PST"/>
 *     &lt;enumeration value="TMP"/>
 *     &lt;enumeration value="ABC"/>
 *     &lt;enumeration value="IDE"/>
 *     &lt;enumeration value="SYL"/>
 *     &lt;enumeration value="SRCH"/>
 *     &lt;enumeration value="SNDX"/>
 *     &lt;enumeration value="PHON"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PostalAddressUse", namespace = "org.opencds.vmr.v1_0.schema.datatypes")
@XmlEnum
public enum PostalAddressUse {


    /**
     * Home address : A communication address at a home, attempted contacts for business purposes might intrude privacy and chances are one will contact family or other household members instead of the person one wishes to call. Typically used with urgent cases, or if no other contacts are available
     * 
     */
    H,

    /**
     * Primary home : The primary home, to reach a person after business hours 
     * 
     */
    HP,

    /**
     * Vacation home : A vacation home, to reach a person while on vacation 
     * 
     */
    HV,

    /**
     * Work place : An office address. First choice for business related contacts during business hours 
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
     * Physical Visit Address : Used primarily to visit an address
     * 
     */
    PHYS,

    /**
     * Postal Address : Used to send mail
     * 
     */
    PST,

    /**
     * Temporary Address : A temporary address, may be good for visit or mailing. Note that an address history can provide more detailed information.
     * 
     */
    TMP,

    /**
     * Alphabetic : Alphabetic transcription of name (Japanese: romaji) 
     * 
     */
    ABC,

    /**
     * Ideographic : Ideographic representation of name (e.g., Japanese kanji, Chinese characters) 
     * 
     */
    IDE,

    /**
     * Syllabic : Syllabic transcription of name (e.g., Japanese kana, Korean hangul) 
     * 
     */
    SYL,

    /**
     * Search Type Uses : A name intended for use in searching or matching.
     * 
     */
    SRCH,

    /**
     * Soundex : An address spelled according to the SoundEx algorithm
     * 
     */
    SNDX,

    /**
     * Phonetic : The address as understood by the data enterer, i.e. a close approximation of a phonetic spelling of the address, not based on a phonetic algorithm
     * 
     */
    PHON;

    public String value() {
        return name();
    }

    public static PostalAddressUse fromValue(String v) {
        return valueOf(v);
    }

}
