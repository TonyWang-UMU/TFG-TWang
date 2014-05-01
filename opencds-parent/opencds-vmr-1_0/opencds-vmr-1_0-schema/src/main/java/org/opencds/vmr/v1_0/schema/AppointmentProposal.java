//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.01 at 09:05:39 PM CEST 
//


package org.opencds.vmr.v1_0.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Proposal, e.g., by a CDS system, for an Encounter to take place.
 * 
 * <p>Java class for AppointmentProposal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppointmentProposal">
 *   &lt;complexContent>
 *     &lt;extension base="{org.opencds.vmr.v1_0.schema.vmr}EncounterBase">
 *       &lt;sequence>
 *         &lt;element name="criticality" type="{org.opencds.vmr.v1_0.schema.datatypes}CD" minOccurs="0"/>
 *         &lt;element name="proposedAppointmentTime" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_TS" minOccurs="0"/>
 *         &lt;element name="repeatNumber" type="{org.opencds.vmr.v1_0.schema.datatypes}INT" minOccurs="0"/>
 *         &lt;element name="relatedEntity" type="{org.opencds.vmr.v1_0.schema.vmr}RelatedEntity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatedClinicalStatement" type="{org.opencds.vmr.v1_0.schema.vmr}RelatedClinicalStatement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppointmentProposal", propOrder = {
    "criticality",
    "proposedAppointmentTime",
    "repeatNumber",
    "relatedEntity",
    "relatedClinicalStatement"
})
public class AppointmentProposal
    extends EncounterBase
{

    protected CD criticality;
    protected IVLTS proposedAppointmentTime;
    protected INT repeatNumber;
    protected List<RelatedEntity> relatedEntity;
    protected List<RelatedClinicalStatement> relatedClinicalStatement;

    /**
     * Gets the value of the criticality property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getCriticality() {
        return criticality;
    }

    /**
     * Sets the value of the criticality property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setCriticality(CD value) {
        this.criticality = value;
    }

    /**
     * Gets the value of the proposedAppointmentTime property.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getProposedAppointmentTime() {
        return proposedAppointmentTime;
    }

    /**
     * Sets the value of the proposedAppointmentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setProposedAppointmentTime(IVLTS value) {
        this.proposedAppointmentTime = value;
    }

    /**
     * Gets the value of the repeatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getRepeatNumber() {
        return repeatNumber;
    }

    /**
     * Sets the value of the repeatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setRepeatNumber(INT value) {
        this.repeatNumber = value;
    }

    /**
     * Gets the value of the relatedEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedEntity }
     * 
     * 
     */
    public List<RelatedEntity> getRelatedEntity() {
        if (relatedEntity == null) {
            relatedEntity = new ArrayList<RelatedEntity>();
        }
        return this.relatedEntity;
    }

    /**
     * Gets the value of the relatedClinicalStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedClinicalStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedClinicalStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedClinicalStatement }
     * 
     * 
     */
    public List<RelatedClinicalStatement> getRelatedClinicalStatement() {
        if (relatedClinicalStatement == null) {
            relatedClinicalStatement = new ArrayList<RelatedClinicalStatement>();
        }
        return this.relatedClinicalStatement;
    }

}
