//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.01 at 09:05:39 PM CEST 
//


package org.opencds.vmr.v1_0.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstract base class for a procedure, which is a series of steps taken on a subject to accomplish a clinical goal.
 * 
 * <p>Java class for ProcedureBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcedureBase">
 *   &lt;complexContent>
 *     &lt;extension base="{org.opencds.vmr.v1_0.schema.vmr}ClinicalStatement">
 *       &lt;sequence>
 *         &lt;element name="procedureCode" type="{org.opencds.vmr.v1_0.schema.datatypes}CD"/>
 *         &lt;element name="procedureMethod" type="{org.opencds.vmr.v1_0.schema.datatypes}CD" minOccurs="0"/>
 *         &lt;element name="approachBodySite" type="{org.opencds.vmr.v1_0.schema.vmr}BodySite" minOccurs="0"/>
 *         &lt;element name="targetBodySite" type="{org.opencds.vmr.v1_0.schema.vmr}BodySite" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcedureBase", propOrder = {
    "procedureCode",
    "procedureMethod",
    "approachBodySite",
    "targetBodySite"
})
@XmlSeeAlso({
    ScheduledProcedure.class,
    ProcedureEvent.class,
    ProcedureProposal.class,
    UndeliveredProcedure.class,
    ProcedureOrder.class
})
public abstract class ProcedureBase
    extends ClinicalStatement
{

    @XmlElement(required = true)
    protected CD procedureCode;
    protected CD procedureMethod;
    protected BodySite approachBodySite;
    protected BodySite targetBodySite;

    /**
     * Gets the value of the procedureCode property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getProcedureCode() {
        return procedureCode;
    }

    /**
     * Sets the value of the procedureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setProcedureCode(CD value) {
        this.procedureCode = value;
    }

    /**
     * Gets the value of the procedureMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getProcedureMethod() {
        return procedureMethod;
    }

    /**
     * Sets the value of the procedureMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setProcedureMethod(CD value) {
        this.procedureMethod = value;
    }

    /**
     * Gets the value of the approachBodySite property.
     * 
     * @return
     *     possible object is
     *     {@link BodySite }
     *     
     */
    public BodySite getApproachBodySite() {
        return approachBodySite;
    }

    /**
     * Sets the value of the approachBodySite property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodySite }
     *     
     */
    public void setApproachBodySite(BodySite value) {
        this.approachBodySite = value;
    }

    /**
     * Gets the value of the targetBodySite property.
     * 
     * @return
     *     possible object is
     *     {@link BodySite }
     *     
     */
    public BodySite getTargetBodySite() {
        return targetBodySite;
    }

    /**
     * Sets the value of the targetBodySite property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodySite }
     *     
     */
    public void setTargetBodySite(BodySite value) {
        this.targetBodySite = value;
    }

}
