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
 * The relationship between two ClinicalStatements.  
 * 
 * <p>Java class for RelatedClinicalStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedClinicalStatement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetRelationshipToSource" type="{org.opencds.vmr.v1_0.schema.datatypes}CD"/>
 *         &lt;choice>
 *           &lt;element name="adverseEvent" type="{org.opencds.vmr.v1_0.schema.vmr}AdverseEvent"/>
 *           &lt;element name="deniedAdverseEvent" type="{org.opencds.vmr.v1_0.schema.vmr}DeniedAdverseEvent"/>
 *           &lt;element name="encounterEvent" type="{org.opencds.vmr.v1_0.schema.vmr}EncounterEvent"/>
 *           &lt;element name="missedAppointment" type="{org.opencds.vmr.v1_0.schema.vmr}MissedAppointment"/>
 *           &lt;element name="scheduledAppointment" type="{org.opencds.vmr.v1_0.schema.vmr}ScheduledAppointment"/>
 *           &lt;element name="appointmentRequest" type="{org.opencds.vmr.v1_0.schema.vmr}AppointmentRequest"/>
 *           &lt;element name="appointmentProposal" type="{org.opencds.vmr.v1_0.schema.vmr}AppointmentProposal"/>
 *           &lt;element name="goal" type="{org.opencds.vmr.v1_0.schema.vmr}Goal"/>
 *           &lt;element name="goalProposal" type="{org.opencds.vmr.v1_0.schema.vmr}GoalProposal"/>
 *           &lt;element name="observationResult" type="{org.opencds.vmr.v1_0.schema.vmr}ObservationResult"/>
 *           &lt;element name="unconductedObservation" type="{org.opencds.vmr.v1_0.schema.vmr}UnconductedObservation"/>
 *           &lt;element name="observationOrder" type="{org.opencds.vmr.v1_0.schema.vmr}ObservationOrder"/>
 *           &lt;element name="observationProposal" type="{org.opencds.vmr.v1_0.schema.vmr}ObservationProposal"/>
 *           &lt;element name="problem" type="{org.opencds.vmr.v1_0.schema.vmr}Problem"/>
 *           &lt;element name="deniedProblem" type="{org.opencds.vmr.v1_0.schema.vmr}DeniedProblem"/>
 *           &lt;element name="procedureEvent" type="{org.opencds.vmr.v1_0.schema.vmr}ProcedureEvent"/>
 *           &lt;element name="undeliveredProcedure" type="{org.opencds.vmr.v1_0.schema.vmr}UndeliveredProcedure"/>
 *           &lt;element name="scheduledProcedure" type="{org.opencds.vmr.v1_0.schema.vmr}ScheduledProcedure"/>
 *           &lt;element name="procedureOrder" type="{org.opencds.vmr.v1_0.schema.vmr}ProcedureOrder"/>
 *           &lt;element name="procedureProposal" type="{org.opencds.vmr.v1_0.schema.vmr}ProcedureProposal"/>
 *           &lt;element name="substanceAdministrationEvent" type="{org.opencds.vmr.v1_0.schema.vmr}SubstanceAdministrationEvent"/>
 *           &lt;element name="undeliveredSubstanceAdministration" type="{org.opencds.vmr.v1_0.schema.vmr}UndeliveredSubstanceAdministration"/>
 *           &lt;element name="substanceAdministrationOrder" type="{org.opencds.vmr.v1_0.schema.vmr}SubstanceAdministrationOrder"/>
 *           &lt;element name="substanceAdministrationProposal" type="{org.opencds.vmr.v1_0.schema.vmr}SubstanceAdministrationProposal"/>
 *           &lt;element name="substanceDispensationEvent" type="{org.opencds.vmr.v1_0.schema.vmr}SubstanceDispensationEvent"/>
 *           &lt;element name="supplyEvent" type="{org.opencds.vmr.v1_0.schema.vmr}SupplyEvent"/>
 *           &lt;element name="undeliveredSupply" type="{org.opencds.vmr.v1_0.schema.vmr}UndeliveredSupply"/>
 *           &lt;element name="supplyOrder" type="{org.opencds.vmr.v1_0.schema.vmr}SupplyOrder"/>
 *           &lt;element name="supplyProposal" type="{org.opencds.vmr.v1_0.schema.vmr}SupplyProposal"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedClinicalStatement", propOrder = {
    "targetRelationshipToSource",
    "adverseEvent",
    "deniedAdverseEvent",
    "encounterEvent",
    "missedAppointment",
    "scheduledAppointment",
    "appointmentRequest",
    "appointmentProposal",
    "goal",
    "goalProposal",
    "observationResult",
    "unconductedObservation",
    "observationOrder",
    "observationProposal",
    "problem",
    "deniedProblem",
    "procedureEvent",
    "undeliveredProcedure",
    "scheduledProcedure",
    "procedureOrder",
    "procedureProposal",
    "substanceAdministrationEvent",
    "undeliveredSubstanceAdministration",
    "substanceAdministrationOrder",
    "substanceAdministrationProposal",
    "substanceDispensationEvent",
    "supplyEvent",
    "undeliveredSupply",
    "supplyOrder",
    "supplyProposal"
})
public class RelatedClinicalStatement {

    @XmlElement(required = true)
    protected CD targetRelationshipToSource;
    protected AdverseEvent adverseEvent;
    protected DeniedAdverseEvent deniedAdverseEvent;
    protected EncounterEvent encounterEvent;
    protected MissedAppointment missedAppointment;
    protected ScheduledAppointment scheduledAppointment;
    protected AppointmentRequest appointmentRequest;
    protected AppointmentProposal appointmentProposal;
    protected Goal goal;
    protected GoalProposal goalProposal;
    protected ObservationResult observationResult;
    protected UnconductedObservation unconductedObservation;
    protected ObservationOrder observationOrder;
    protected ObservationProposal observationProposal;
    protected Problem problem;
    protected DeniedProblem deniedProblem;
    protected ProcedureEvent procedureEvent;
    protected UndeliveredProcedure undeliveredProcedure;
    protected ScheduledProcedure scheduledProcedure;
    protected ProcedureOrder procedureOrder;
    protected ProcedureProposal procedureProposal;
    protected SubstanceAdministrationEvent substanceAdministrationEvent;
    protected UndeliveredSubstanceAdministration undeliveredSubstanceAdministration;
    protected SubstanceAdministrationOrder substanceAdministrationOrder;
    protected SubstanceAdministrationProposal substanceAdministrationProposal;
    protected SubstanceDispensationEvent substanceDispensationEvent;
    protected SupplyEvent supplyEvent;
    protected UndeliveredSupply undeliveredSupply;
    protected SupplyOrder supplyOrder;
    protected SupplyProposal supplyProposal;

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

    /**
     * Gets the value of the adverseEvent property.
     * 
     * @return
     *     possible object is
     *     {@link AdverseEvent }
     *     
     */
    public AdverseEvent getAdverseEvent() {
        return adverseEvent;
    }

    /**
     * Sets the value of the adverseEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdverseEvent }
     *     
     */
    public void setAdverseEvent(AdverseEvent value) {
        this.adverseEvent = value;
    }

    /**
     * Gets the value of the deniedAdverseEvent property.
     * 
     * @return
     *     possible object is
     *     {@link DeniedAdverseEvent }
     *     
     */
    public DeniedAdverseEvent getDeniedAdverseEvent() {
        return deniedAdverseEvent;
    }

    /**
     * Sets the value of the deniedAdverseEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeniedAdverseEvent }
     *     
     */
    public void setDeniedAdverseEvent(DeniedAdverseEvent value) {
        this.deniedAdverseEvent = value;
    }

    /**
     * Gets the value of the encounterEvent property.
     * 
     * @return
     *     possible object is
     *     {@link EncounterEvent }
     *     
     */
    public EncounterEvent getEncounterEvent() {
        return encounterEvent;
    }

    /**
     * Sets the value of the encounterEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncounterEvent }
     *     
     */
    public void setEncounterEvent(EncounterEvent value) {
        this.encounterEvent = value;
    }

    /**
     * Gets the value of the missedAppointment property.
     * 
     * @return
     *     possible object is
     *     {@link MissedAppointment }
     *     
     */
    public MissedAppointment getMissedAppointment() {
        return missedAppointment;
    }

    /**
     * Sets the value of the missedAppointment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MissedAppointment }
     *     
     */
    public void setMissedAppointment(MissedAppointment value) {
        this.missedAppointment = value;
    }

    /**
     * Gets the value of the scheduledAppointment property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledAppointment }
     *     
     */
    public ScheduledAppointment getScheduledAppointment() {
        return scheduledAppointment;
    }

    /**
     * Sets the value of the scheduledAppointment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledAppointment }
     *     
     */
    public void setScheduledAppointment(ScheduledAppointment value) {
        this.scheduledAppointment = value;
    }

    /**
     * Gets the value of the appointmentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AppointmentRequest }
     *     
     */
    public AppointmentRequest getAppointmentRequest() {
        return appointmentRequest;
    }

    /**
     * Sets the value of the appointmentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentRequest }
     *     
     */
    public void setAppointmentRequest(AppointmentRequest value) {
        this.appointmentRequest = value;
    }

    /**
     * Gets the value of the appointmentProposal property.
     * 
     * @return
     *     possible object is
     *     {@link AppointmentProposal }
     *     
     */
    public AppointmentProposal getAppointmentProposal() {
        return appointmentProposal;
    }

    /**
     * Sets the value of the appointmentProposal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentProposal }
     *     
     */
    public void setAppointmentProposal(AppointmentProposal value) {
        this.appointmentProposal = value;
    }

    /**
     * Gets the value of the goal property.
     * 
     * @return
     *     possible object is
     *     {@link Goal }
     *     
     */
    public Goal getGoal() {
        return goal;
    }

    /**
     * Sets the value of the goal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Goal }
     *     
     */
    public void setGoal(Goal value) {
        this.goal = value;
    }

    /**
     * Gets the value of the goalProposal property.
     * 
     * @return
     *     possible object is
     *     {@link GoalProposal }
     *     
     */
    public GoalProposal getGoalProposal() {
        return goalProposal;
    }

    /**
     * Sets the value of the goalProposal property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoalProposal }
     *     
     */
    public void setGoalProposal(GoalProposal value) {
        this.goalProposal = value;
    }

    /**
     * Gets the value of the observationResult property.
     * 
     * @return
     *     possible object is
     *     {@link ObservationResult }
     *     
     */
    public ObservationResult getObservationResult() {
        return observationResult;
    }

    /**
     * Sets the value of the observationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationResult }
     *     
     */
    public void setObservationResult(ObservationResult value) {
        this.observationResult = value;
    }

    /**
     * Gets the value of the unconductedObservation property.
     * 
     * @return
     *     possible object is
     *     {@link UnconductedObservation }
     *     
     */
    public UnconductedObservation getUnconductedObservation() {
        return unconductedObservation;
    }

    /**
     * Sets the value of the unconductedObservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnconductedObservation }
     *     
     */
    public void setUnconductedObservation(UnconductedObservation value) {
        this.unconductedObservation = value;
    }

    /**
     * Gets the value of the observationOrder property.
     * 
     * @return
     *     possible object is
     *     {@link ObservationOrder }
     *     
     */
    public ObservationOrder getObservationOrder() {
        return observationOrder;
    }

    /**
     * Sets the value of the observationOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationOrder }
     *     
     */
    public void setObservationOrder(ObservationOrder value) {
        this.observationOrder = value;
    }

    /**
     * Gets the value of the observationProposal property.
     * 
     * @return
     *     possible object is
     *     {@link ObservationProposal }
     *     
     */
    public ObservationProposal getObservationProposal() {
        return observationProposal;
    }

    /**
     * Sets the value of the observationProposal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationProposal }
     *     
     */
    public void setObservationProposal(ObservationProposal value) {
        this.observationProposal = value;
    }

    /**
     * Gets the value of the problem property.
     * 
     * @return
     *     possible object is
     *     {@link Problem }
     *     
     */
    public Problem getProblem() {
        return problem;
    }

    /**
     * Sets the value of the problem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Problem }
     *     
     */
    public void setProblem(Problem value) {
        this.problem = value;
    }

    /**
     * Gets the value of the deniedProblem property.
     * 
     * @return
     *     possible object is
     *     {@link DeniedProblem }
     *     
     */
    public DeniedProblem getDeniedProblem() {
        return deniedProblem;
    }

    /**
     * Sets the value of the deniedProblem property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeniedProblem }
     *     
     */
    public void setDeniedProblem(DeniedProblem value) {
        this.deniedProblem = value;
    }

    /**
     * Gets the value of the procedureEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ProcedureEvent }
     *     
     */
    public ProcedureEvent getProcedureEvent() {
        return procedureEvent;
    }

    /**
     * Sets the value of the procedureEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedureEvent }
     *     
     */
    public void setProcedureEvent(ProcedureEvent value) {
        this.procedureEvent = value;
    }

    /**
     * Gets the value of the undeliveredProcedure property.
     * 
     * @return
     *     possible object is
     *     {@link UndeliveredProcedure }
     *     
     */
    public UndeliveredProcedure getUndeliveredProcedure() {
        return undeliveredProcedure;
    }

    /**
     * Sets the value of the undeliveredProcedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndeliveredProcedure }
     *     
     */
    public void setUndeliveredProcedure(UndeliveredProcedure value) {
        this.undeliveredProcedure = value;
    }

    /**
     * Gets the value of the scheduledProcedure property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledProcedure }
     *     
     */
    public ScheduledProcedure getScheduledProcedure() {
        return scheduledProcedure;
    }

    /**
     * Sets the value of the scheduledProcedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledProcedure }
     *     
     */
    public void setScheduledProcedure(ScheduledProcedure value) {
        this.scheduledProcedure = value;
    }

    /**
     * Gets the value of the procedureOrder property.
     * 
     * @return
     *     possible object is
     *     {@link ProcedureOrder }
     *     
     */
    public ProcedureOrder getProcedureOrder() {
        return procedureOrder;
    }

    /**
     * Sets the value of the procedureOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedureOrder }
     *     
     */
    public void setProcedureOrder(ProcedureOrder value) {
        this.procedureOrder = value;
    }

    /**
     * Gets the value of the procedureProposal property.
     * 
     * @return
     *     possible object is
     *     {@link ProcedureProposal }
     *     
     */
    public ProcedureProposal getProcedureProposal() {
        return procedureProposal;
    }

    /**
     * Sets the value of the procedureProposal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedureProposal }
     *     
     */
    public void setProcedureProposal(ProcedureProposal value) {
        this.procedureProposal = value;
    }

    /**
     * Gets the value of the substanceAdministrationEvent property.
     * 
     * @return
     *     possible object is
     *     {@link SubstanceAdministrationEvent }
     *     
     */
    public SubstanceAdministrationEvent getSubstanceAdministrationEvent() {
        return substanceAdministrationEvent;
    }

    /**
     * Sets the value of the substanceAdministrationEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstanceAdministrationEvent }
     *     
     */
    public void setSubstanceAdministrationEvent(SubstanceAdministrationEvent value) {
        this.substanceAdministrationEvent = value;
    }

    /**
     * Gets the value of the undeliveredSubstanceAdministration property.
     * 
     * @return
     *     possible object is
     *     {@link UndeliveredSubstanceAdministration }
     *     
     */
    public UndeliveredSubstanceAdministration getUndeliveredSubstanceAdministration() {
        return undeliveredSubstanceAdministration;
    }

    /**
     * Sets the value of the undeliveredSubstanceAdministration property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndeliveredSubstanceAdministration }
     *     
     */
    public void setUndeliveredSubstanceAdministration(UndeliveredSubstanceAdministration value) {
        this.undeliveredSubstanceAdministration = value;
    }

    /**
     * Gets the value of the substanceAdministrationOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SubstanceAdministrationOrder }
     *     
     */
    public SubstanceAdministrationOrder getSubstanceAdministrationOrder() {
        return substanceAdministrationOrder;
    }

    /**
     * Sets the value of the substanceAdministrationOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstanceAdministrationOrder }
     *     
     */
    public void setSubstanceAdministrationOrder(SubstanceAdministrationOrder value) {
        this.substanceAdministrationOrder = value;
    }

    /**
     * Gets the value of the substanceAdministrationProposal property.
     * 
     * @return
     *     possible object is
     *     {@link SubstanceAdministrationProposal }
     *     
     */
    public SubstanceAdministrationProposal getSubstanceAdministrationProposal() {
        return substanceAdministrationProposal;
    }

    /**
     * Sets the value of the substanceAdministrationProposal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstanceAdministrationProposal }
     *     
     */
    public void setSubstanceAdministrationProposal(SubstanceAdministrationProposal value) {
        this.substanceAdministrationProposal = value;
    }

    /**
     * Gets the value of the substanceDispensationEvent property.
     * 
     * @return
     *     possible object is
     *     {@link SubstanceDispensationEvent }
     *     
     */
    public SubstanceDispensationEvent getSubstanceDispensationEvent() {
        return substanceDispensationEvent;
    }

    /**
     * Sets the value of the substanceDispensationEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstanceDispensationEvent }
     *     
     */
    public void setSubstanceDispensationEvent(SubstanceDispensationEvent value) {
        this.substanceDispensationEvent = value;
    }

    /**
     * Gets the value of the supplyEvent property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyEvent }
     *     
     */
    public SupplyEvent getSupplyEvent() {
        return supplyEvent;
    }

    /**
     * Sets the value of the supplyEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyEvent }
     *     
     */
    public void setSupplyEvent(SupplyEvent value) {
        this.supplyEvent = value;
    }

    /**
     * Gets the value of the undeliveredSupply property.
     * 
     * @return
     *     possible object is
     *     {@link UndeliveredSupply }
     *     
     */
    public UndeliveredSupply getUndeliveredSupply() {
        return undeliveredSupply;
    }

    /**
     * Sets the value of the undeliveredSupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndeliveredSupply }
     *     
     */
    public void setUndeliveredSupply(UndeliveredSupply value) {
        this.undeliveredSupply = value;
    }

    /**
     * Gets the value of the supplyOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyOrder }
     *     
     */
    public SupplyOrder getSupplyOrder() {
        return supplyOrder;
    }

    /**
     * Sets the value of the supplyOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyOrder }
     *     
     */
    public void setSupplyOrder(SupplyOrder value) {
        this.supplyOrder = value;
    }

    /**
     * Gets the value of the supplyProposal property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyProposal }
     *     
     */
    public SupplyProposal getSupplyProposal() {
        return supplyProposal;
    }

    /**
     * Sets the value of the supplyProposal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyProposal }
     *     
     */
    public void setSupplyProposal(SupplyProposal value) {
        this.supplyProposal = value;
    }

}
