//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.01 at 12:54:04 AM CEST 
//


package org.opencds.vmr.v1_0.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The relationship between two ClinicalStatements, in a list structure.
 * 
 * <p>Java class for ClinicalStatementRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClinicalStatementRelationship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceId" type="{org.opencds.vmr.v1_0.schema.datatypes}II"/>
 *         &lt;element name="targetId" type="{org.opencds.vmr.v1_0.schema.datatypes}II"/>
 *         &lt;element name="targetRelationshipToSource" type="{org.opencds.vmr.v1_0.schema.datatypes}CD"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClinicalStatementRelationship", propOrder = {
    "sourceId",
    "targetId",
    "targetRelationshipToSource"
})
public class ClinicalStatementRelationship {

    @XmlElement(required = true)
    protected II sourceId;
    @XmlElement(required = true)
    protected II targetId;
    @XmlElement(required = true)
    protected CD targetRelationshipToSource;

    /**
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setSourceId(II value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the targetId property.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getTargetId() {
        return targetId;
    }

    /**
     * Sets the value of the targetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setTargetId(II value) {
        this.targetId = value;
    }

    /**
     * Gets the value of the targetRelationshipToSource property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getTargetRelationshipToSource() {
        return targetRelationshipToSource;
    }

    /**
     * Sets the value of the targetRelationshipToSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setTargetRelationshipToSource(CD value) {
        this.targetRelationshipToSource = value;
    }

}
