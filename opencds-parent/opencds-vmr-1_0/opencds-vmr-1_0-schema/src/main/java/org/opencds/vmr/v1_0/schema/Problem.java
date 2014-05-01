//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.01 at 06:23:30 PM CEST 
//


package org.opencds.vmr.v1_0.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * An assertion regarding a clinical condition of the subject that needs to be treated or managed.
 * 
 * <p>Java class for Problem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Problem">
 *   &lt;complexContent>
 *     &lt;extension base="{org.opencds.vmr.v1_0.schema.vmr}ProblemBase">
 *       &lt;sequence>
 *         &lt;element name="importance" type="{org.opencds.vmr.v1_0.schema.datatypes}CD" minOccurs="0"/>
 *         &lt;element name="severity" type="{org.opencds.vmr.v1_0.schema.datatypes}CD" minOccurs="0"/>
 *         &lt;element name="problemStatus" type="{org.opencds.vmr.v1_0.schema.datatypes}CD" minOccurs="0"/>
 *         &lt;element name="ageAtOnset" type="{org.opencds.vmr.v1_0.schema.datatypes}PQ" minOccurs="0"/>
 *         &lt;element name="wasCauseOfDeath" type="{org.opencds.vmr.v1_0.schema.datatypes}BL" minOccurs="0"/>
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
@XmlType(name = "Problem", propOrder = {
    "importance",
    "severity",
    "problemStatus",
    "ageAtOnset",
    "wasCauseOfDeath",
    "relatedEntity",
    "relatedClinicalStatement"
})
public class Problem
    extends ProblemBase
{

    protected CD importance;
    protected CD severity;
    protected CD problemStatus;
    protected PQ ageAtOnset;
    protected BL wasCauseOfDeath;
    protected List<RelatedEntity> relatedEntity;
    protected List<RelatedClinicalStatement> relatedClinicalStatement;

    /**
     * Gets the value of the importance property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getImportance() {
        return importance;
    }

    /**
     * Sets the value of the importance property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setImportance(CD value) {
        this.importance = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setSeverity(CD value) {
        this.severity = value;
    }

    /**
     * Gets the value of the problemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getProblemStatus() {
        return problemStatus;
    }

    /**
     * Sets the value of the problemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setProblemStatus(CD value) {
        this.problemStatus = value;
    }

    /**
     * Gets the value of the ageAtOnset property.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getAgeAtOnset() {
        return ageAtOnset;
    }

    /**
     * Sets the value of the ageAtOnset property.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setAgeAtOnset(PQ value) {
        this.ageAtOnset = value;
    }

    /**
     * Gets the value of the wasCauseOfDeath property.
     * 
     * @return
     *     possible object is
     *     {@link BL }
     *     
     */
    public BL getWasCauseOfDeath() {
        return wasCauseOfDeath;
    }

    /**
     * Sets the value of the wasCauseOfDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link BL }
     *     
     */
    public void setWasCauseOfDeath(BL value) {
        this.wasCauseOfDeath = value;
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