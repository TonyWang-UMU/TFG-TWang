//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.01 at 06:23:30 PM CEST 
//


package org.opencds.vmr.v1_0.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A resource independent of individual patients, provided to a CDS engine to facilitate patient evaluation.  Includes, for example, local antibiogram data (local susceptibility profile of microbes to different antimicrobial agents), local formulary restrictions, or CDS system user preference on which guidelines to use for health maintenance (e.g., HEDIS vs. USPSTF).
 * 
 * <p>Java class for CDSResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CDSResource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdsResourceType" type="{org.opencds.vmr.v1_0.schema.datatypes}CD"/>
 *         &lt;element name="resourceContents" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CDSResource", namespace = "org.opencds.vmr.v1_0.schema.cdsinput", propOrder = {
    "cdsResourceType",
    "resourceContents"
})
public class CDSResource {

    @XmlElement(required = true)
    protected CD cdsResourceType;
    @XmlElement(required = true)
    protected Object resourceContents;

    /**
     * Gets the value of the cdsResourceType property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getCdsResourceType() {
        return cdsResourceType;
    }

    /**
     * Sets the value of the cdsResourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setCdsResourceType(CD value) {
        this.cdsResourceType = value;
    }

    /**
     * Gets the value of the resourceContents property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResourceContents() {
        return resourceContents;
    }

    /**
     * Sets the value of the resourceContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResourceContents(Object value) {
        this.resourceContents = value;
    }

}