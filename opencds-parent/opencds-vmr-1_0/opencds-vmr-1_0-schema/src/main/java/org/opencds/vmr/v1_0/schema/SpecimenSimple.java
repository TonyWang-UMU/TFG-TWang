//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.01 at 06:23:30 PM CEST 
//


package org.opencds.vmr.v1_0.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A sample of tissue, blood, urine, water, air, etc., taken for the purposes of diagnostic examination or evaluation.
 * 
 * <p>Java class for SpecimenSimple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecimenSimple">
 *   &lt;complexContent>
 *     &lt;extension base="{org.opencds.vmr.v1_0.schema.vmr}EntityBase">
 *       &lt;sequence>
 *         &lt;element name="description" type="{org.opencds.vmr.v1_0.schema.datatypes}ST" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecimenSimple", propOrder = {
    "description"
})
@XmlSeeAlso({
    Specimen.class
})
public class SpecimenSimple
    extends EntityBase
{

    protected ST description;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setDescription(ST value) {
        this.description = value;
    }

}
