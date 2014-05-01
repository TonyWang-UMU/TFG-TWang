//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.01 at 06:23:30 PM CEST 
//


package org.opencds.vmr.v1_0.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityNamePartQualifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityNamePartQualifier">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LS"/>
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="NB"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="HON"/>
 *     &lt;enumeration value="BR"/>
 *     &lt;enumeration value="AD"/>
 *     &lt;enumeration value="SP"/>
 *     &lt;enumeration value="MID"/>
 *     &lt;enumeration value="CL"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="PFX"/>
 *     &lt;enumeration value="SFX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityNamePartQualifier", namespace = "org.opencds.vmr.v1_0.schema.datatypes")
@XmlEnum
public enum EntityNamePartQualifier {


    /**
     * Legal Status : For organizations a suffix indicating the legal status, e.g., "Inc.", "Co.", "AG", "GmbH", "B.V." "S.A.", "Ltd." Etc.
     * 
     */
    LS,

    /**
     * Academic : Indicates that a prefix like "Dr." or a suffix like "M.D." or "Ph.D." is an academic title 
     * 
     */
    AC,

    /**
     * Nobility : In Europe and Asia, there are still people with nobility titles (aristocrats). German "von" is generally a nobility title, not a mere voorvoegsel. Others are "Earl of" or "His Majesty King of..." etc. Rarely used nowadays, but some systems do keep track of this 
     * 
     */
    NB,

    /**
     * Professional : Primarily in the British Imperial culture people tend to have an abbreviation of their professional organization as part of their credential suffices 
     * 
     */
    PR,

    /**
     * Honorific : A honorific such as "The Right Honourable" or "Weledelgeleerde Heer".  
     * 
     */
    HON,

    /**
     * Birth : A name that a person was given at birth or established as a consequence of adoption.  
     * 
     * Note: this is not used for temporary names assigned at birth such as "Baby of Smith" - which is just a name with a use code of "TEMP".
     * 
     */
    BR,

    /**
     * Acquired : A name part a person acquired.  
     * 
     * The name part may be acquired by adoption, or the person may have chosen to use the name part for some other reason.
     * 
     * Note: this differs from an Other/Psuedonym/Alias in that an acquired name part is acquired on a formal basis rather than an informal one (e.g. registered as part of the official name)
     * 
     */
    AD,

    /**
     * Spouse : The name assumed from the partner in a marital relationship. Usually the spouse's family name. Note that no inference about gender can be made from the existence of spouse names
     * 
     */
    SP,

    /**
     * Middle Name : Indicates that the name part is a middle name.
     * Usage Notes:
     * In general, the english 'middle name' concept is all of the given names after the first. This qualifier may be used to explicitly indicate which given names are considered to be middle names. 
     * The middle name qualifier may also be used with family names. This is a Scandinavian use case, matching the concept of "mellomnavn" / "mellannamn". Note that there are specific rules that indicate what names may be taken as a mellannamn in different Scandinavian countries
     * 
     */
    MID,

    /**
     * Callme : Callme is used to indicate which of the various name parts is used when interacting with the person
     * 
     */
    CL,

    /**
     * Initial : Indicates that a name part is just an initial. Initials do not imply a trailing period since this would not work with non-Latin scripts. Initials may consist of more than one letter, e.g., "Ph." could stand for "Philippe" or "Th." for "Thomas"
     * 
     */
    IN,

    /**
     * Prefix : A prefix has a strong association to the immediately following name part. A prefix has no implicit trailing white space (it has implicit leading white space though).
     * 
     */
    PFX,

    /**
     * Suffix : A suffix has a strong association to the immediately preceding name part. A suffix has no implicit leading white space (it has implicit trailing white space though).
     * 
     */
    SFX;

    public String value() {
        return name();
    }

    public static EntityNamePartQualifier fromValue(String v) {
        return valueOf(v);
    }

}
