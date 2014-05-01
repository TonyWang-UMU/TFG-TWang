//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.01 at 08:52:49 PM CEST 
//


package org.opencds.vmr.v1_0.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A record of something of clinical relevance that is being done, has been done, can be done, or is intended or requested to be done.  An abstract base class that serves as the basis for concrete clinical statements, such as ObservationEvent and ProcedureProposal.
 * 
 * Naming and modeling conventions:
 * 
 * 	- in general, attribute names end in 'Code' if and only if the name of the attribute overlaps with the name of the parent class
 * 
 * 
 * 	- times are named as follows: Time is the default suffix for these attributes.  EventTime is used to distinguish the time an order is placed vs. when the ordered act should take place. EffectiveTime and TimeInterval are used when there is a desire to emphasize that a prolonged time interval (e.g., > 1 day) can be used rather than a point in time or a short time interval.  Note that regardless of the naming convention, IVL_TS attributes allow time intervals of any length.
 * 
 * 
 * 	- subjectEffectiveTime is the time that is primarily related to the subject's experience of disease or treatment events (or durations), rather than when those events were reported or recorded by the performer
 * 
 * 
 * 	- performerEventTime is the event time that is primarily related to the performer, rather than the subject.
 * 
 * 
 * 	- the state between ordering and the ordered event occurring is modeled only in cases of procedures and encounters, due to the substantial rate at which orders do not result in events.
 * 
 * 
 * Approaches to representing specific statements:
 * 
 * 	- No known allergies --> DeniedAdverseEvent with adverseEventAgentCode that is the generic root-level code for substances and adverseEventCode that is the generic root-level code for adverse events.
 * 
 * 
 * 	- No known drug allergies --> DeniedAdverseEvent with adverseEventAgentCode that is the root-level code for medications and adverseEventCode that is the generic root-level code for adverse events.
 * 
 * 
 * 	- No known food allergies --> DeniedAdverseEvent with adverseEventAgentCode that is the root-level code for food and adverseEventCode that is the generic root-level code for adverse events.
 * 
 * 
 * 	- No known medications --> UndeliveredSubstanceAdministration with substance that is the root-level code for medications.
 * 
 * 
 * 	- No known problems --> DeniedProblem with problemCode that is the root-level code for problems or conditions.
 * 
 * 
 * 	- Patient takes an unknown drug --> SubstanceAdministrationEvent where code for substance represents "unknown medication".
 * 
 * <p>Java class for ClinicalStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClinicalStatement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="templateId" type="{org.opencds.vmr.v1_0.schema.datatypes}II" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{org.opencds.vmr.v1_0.schema.datatypes}II"/>
 *         &lt;element name="dataSourceType" type="{org.opencds.vmr.v1_0.schema.datatypes}CD" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClinicalStatement", propOrder = {
    "templateId",
    "id",
    "dataSourceType"
})
@XmlSeeAlso({
    ObservationBase.class,
    ProcedureBase.class,
    GoalBase.class,
    SupplyBase.class,
    SubstanceAdministrationBase.class,
    ProblemBase.class,
    EncounterBase.class,
    AdverseEventBase.class
})
public abstract class ClinicalStatement {

    protected List<II> templateId;
    @XmlElement(required = true)
    protected II id;
    protected CD dataSourceType;

    /**
     * Gets the value of the templateId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     */
    public List<II> getTemplateId() {
        if (templateId == null) {
            templateId = new ArrayList<II>();
        }
        return this.templateId;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setId(II value) {
        this.id = value;
    }

    /**
     * Gets the value of the dataSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getDataSourceType() {
        return dataSourceType;
    }

    /**
     * Sets the value of the dataSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setDataSourceType(CD value) {
        this.dataSourceType = value;
    }

}
