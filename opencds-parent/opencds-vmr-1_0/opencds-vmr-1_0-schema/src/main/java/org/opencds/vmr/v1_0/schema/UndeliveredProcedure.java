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
 * Documentation that a procedure was not delivered.  E.g., documentation that a surgery was not performed because the patient refused.
 * 
 * <p>Java class for UndeliveredProcedure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UndeliveredProcedure">
 *   &lt;complexContent>
 *     &lt;extension base="{org.opencds.vmr.v1_0.schema.vmr}ProcedureBase">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{org.opencds.vmr.v1_0.schema.datatypes}CD" minOccurs="0"/>
 *         &lt;element name="subjectEffectiveTime" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_TS" minOccurs="0"/>
 *         &lt;element name="documentationTime" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_TS" minOccurs="0"/>
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
@XmlType(name = "UndeliveredProcedure", propOrder = {
    "reason",
    "subjectEffectiveTime",
    "documentationTime",
    "relatedEntity",
    "relatedClinicalStatement"
})
public class UndeliveredProcedure
    extends ProcedureBase
{

    protected CD reason;
    protected IVLTS subjectEffectiveTime;
    protected IVLTS documentationTime;
    protected List<RelatedEntity> relatedEntity;
    protected List<RelatedClinicalStatement> relatedClinicalStatement;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setReason(CD value) {
        this.reason = value;
    }

    /**
     * Gets the value of the subjectEffectiveTime property.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getSubjectEffectiveTime() {
        return subjectEffectiveTime;
    }

    /**
     * Sets the value of the subjectEffectiveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setSubjectEffectiveTime(IVLTS value) {
        this.subjectEffectiveTime = value;
    }

    /**
     * Gets the value of the documentationTime property.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getDocumentationTime() {
        return documentationTime;
    }

    /**
     * Sets the value of the documentationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setDocumentationTime(IVLTS value) {
        this.documentationTime = value;
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