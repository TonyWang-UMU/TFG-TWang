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
 * <p>Java class for EntityNamePartType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityNamePartType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FAM"/>
 *     &lt;enumeration value="GIV"/>
 *     &lt;enumeration value="TITLE"/>
 *     &lt;enumeration value="DEL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityNamePartType", namespace = "org.opencds.vmr.v1_0.schema.datatypes")
@XmlEnum
public enum EntityNamePartType {


    /**
     * Family : Family name, this is the name that links to the genealogy. In some cultures (e.g. Eritrea) the family name of a son is the first name of his father
     * 
     */
    FAM,

    /**
     * Given: Given name.
     * Note: don't call it "first name" since this given names do not always come first
     * 
     */
    GIV,

    /**
     * Title : Part of the name that is acquired as a title due to academic, legal, employment or nobility status etc.
     * Note: Title name parts include name parts that come after the name such as qualifications
     * 
     */
    TITLE,

    /**
     * Delimiter : A delimiter has no meaning other than being literally printed in this name representation. A delimiter has no implicit leading and trailing white space
     * 
     */
    DEL;

    public String value() {
        return name();
    }

    public static EntityNamePartType fromValue(String v) {
        return valueOf(v);
    }

}
