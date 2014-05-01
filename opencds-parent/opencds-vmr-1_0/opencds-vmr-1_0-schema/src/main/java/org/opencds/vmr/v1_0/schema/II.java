//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.01 at 08:48:19 PM CEST 
//


package org.opencds.vmr.v1_0.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * An identifier that uniquely identifies a thing or object. 
 * 
 * Examples are object identifier for HL7 RIM objects, medical record number, order id, service catalog item id, Vehicle Identification Number (VIN), etc. Instance identifiers are usually defined based on ISO object identifiers.
 * 
 * An identifier allows someone to select one record, object or thing from a set of candidates. Usually an identifier alone without any context is not usable. Identifiers are distinguished from concept descriptors as concept descriptors never identify an individual thing, although there may sometimes be an individual record or object that represents the concept.
 * 
 * Information Processing Entities claiming direct or indirect conformance SHALL never assume that receiving applications can infer the identity of issuing authority or the type of the identifier from the identifier or components thereof.
 * 
 * 
 * <p>Java class for II complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="II">
 *   &lt;complexContent>
 *     &lt;extension base="{org.opencds.vmr.v1_0.schema.datatypes}ANY">
 *       &lt;attribute name="root" use="required" type="{org.opencds.vmr.v1_0.schema.datatypes}Uid" />
 *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "II", namespace = "org.opencds.vmr.v1_0.schema.datatypes")
public class II
    extends ANY
{

    @XmlAttribute(name = "root", required = true)
    protected String root;
    @XmlAttribute(name = "extension")
    protected String extension;

    /**
     * Gets the value of the root property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoot() {
        return root;
    }

    /**
     * Sets the value of the root property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoot(String value) {
        this.root = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        if (extension == null) {
            return "";
        } else {
            return extension;
        }
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

}
