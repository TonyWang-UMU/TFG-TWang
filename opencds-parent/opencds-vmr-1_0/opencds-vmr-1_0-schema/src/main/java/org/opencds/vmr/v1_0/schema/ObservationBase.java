//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.01 at 08:44:06 PM CEST 
//


package org.opencds.vmr.v1_0.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The abstract base class for an observation, which is the act of recognizing and noting a fact.
 * 
 * <p>Java class for ObservationBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObservationBase">
 *   &lt;complexContent>
 *     &lt;extension base="{org.opencds.vmr.v1_0.schema.vmr}ClinicalStatement">
 *       &lt;sequence>
 *         &lt;element name="observationFocus" type="{org.opencds.vmr.v1_0.schema.datatypes}CD"/>
 *         &lt;element name="observationMethod" type="{org.opencds.vmr.v1_0.schema.datatypes}CD" minOccurs="0"/>
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
@XmlType(name = "ObservationBase", propOrder = {
    "observationFocus",
    "observationMethod",
    "targetBodySite"
})
@XmlSeeAlso({
    ObservationResult.class,
    UnconductedObservation.class,
    ObservationOrder.class,
    ObservationProposal.class
})
public abstract class ObservationBase
    extends ClinicalStatement
{

    @XmlElement(required = true)
    protected CD observationFocus;
    protected CD observationMethod;
    protected BodySite targetBodySite;

    /**
     * Gets the value of the observationFocus property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getObservationFocus() {
        return observationFocus;
    }

    /**
     * Sets the value of the observationFocus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setObservationFocus(CD value) {
        this.observationFocus = value;
    }

    /**
     * Gets the value of the observationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getObservationMethod() {
        return observationMethod;
    }

    /**
     * Sets the value of the observationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setObservationMethod(CD value) {
        this.observationMethod = value;
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
