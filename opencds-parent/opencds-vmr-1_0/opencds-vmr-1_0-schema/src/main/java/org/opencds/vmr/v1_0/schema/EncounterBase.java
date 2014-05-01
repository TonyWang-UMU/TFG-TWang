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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The abstract base class for an encounter of an EvaluatedPerson with the healthcare system.  If an encounter or appointment has been canceled, it should simply not be provided using this model.  This allows the encounter and appointment classes to be used without an explicit encounter status check.
 * 
 * <p>Java class for EncounterBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EncounterBase">
 *   &lt;complexContent>
 *     &lt;extension base="{org.opencds.vmr.v1_0.schema.vmr}ClinicalStatement">
 *       &lt;sequence>
 *         &lt;element name="encounterType" type="{org.opencds.vmr.v1_0.schema.datatypes}CD"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncounterBase", propOrder = {
    "encounterType"
})
@XmlSeeAlso({
    ScheduledAppointment.class,
    EncounterEvent.class,
    MissedAppointment.class,
    AppointmentRequest.class,
    AppointmentProposal.class
})
public abstract class EncounterBase
    extends ClinicalStatement
{

    @XmlElement(required = true)
    protected CD encounterType;

    /**
     * Gets the value of the encounterType property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getEncounterType() {
        return encounterType;
    }

    /**
     * Sets the value of the encounterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setEncounterType(CD value) {
        this.encounterType = value;
    }

}
