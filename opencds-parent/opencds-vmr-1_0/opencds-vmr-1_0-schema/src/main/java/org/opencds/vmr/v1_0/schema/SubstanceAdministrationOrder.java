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
import javax.xml.bind.annotation.XmlType;


/**
 * A clinical order for a substance administration.  Includes medication prescriptions.
 * 
 * <p>Java class for SubstanceAdministrationOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubstanceAdministrationOrder">
 *   &lt;complexContent>
 *     &lt;extension base="{org.opencds.vmr.v1_0.schema.vmr}SubstanceAdministrationBase">
 *       &lt;sequence>
 *         &lt;element name="criticality" type="{org.opencds.vmr.v1_0.schema.datatypes}CD" minOccurs="0"/>
 *         &lt;element name="doseRestriction" type="{org.opencds.vmr.v1_0.schema.vmr}DoseRestriction" minOccurs="0"/>
 *         &lt;element name="administrationTimeInterval" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_TS" minOccurs="0"/>
 *         &lt;element name="dosingSig" type="{org.opencds.vmr.v1_0.schema.datatypes}CD" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numberFillsAllowed" type="{org.opencds.vmr.v1_0.schema.datatypes}INT" minOccurs="0"/>
 *         &lt;element name="orderEventTime" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_TS" minOccurs="0"/>
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
@XmlType(name = "SubstanceAdministrationOrder", propOrder = {
    "criticality",
    "doseRestriction",
    "administrationTimeInterval",
    "dosingSig",
    "numberFillsAllowed",
    "orderEventTime",
    "relatedEntity",
    "relatedClinicalStatement"
})
public class SubstanceAdministrationOrder
    extends SubstanceAdministrationBase
{

    protected CD criticality;
    protected DoseRestriction doseRestriction;
    protected IVLTS administrationTimeInterval;
    protected List<CD> dosingSig;
    protected INT numberFillsAllowed;
    protected IVLTS orderEventTime;
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
     * Gets the value of the doseRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link DoseRestriction }
     *     
     */
    public DoseRestriction getDoseRestriction() {
        return doseRestriction;
    }

    /**
     * Sets the value of the doseRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoseRestriction }
     *     
     */
    public void setDoseRestriction(DoseRestriction value) {
        this.doseRestriction = value;
    }

    /**
     * Gets the value of the administrationTimeInterval property.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getAdministrationTimeInterval() {
        return administrationTimeInterval;
    }

    /**
     * Sets the value of the administrationTimeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setAdministrationTimeInterval(IVLTS value) {
        this.administrationTimeInterval = value;
    }

    /**
     * Gets the value of the dosingSig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dosingSig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDosingSig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CD }
     * 
     * 
     */
    public List<CD> getDosingSig() {
        if (dosingSig == null) {
            dosingSig = new ArrayList<CD>();
        }
        return this.dosingSig;
    }

    /**
     * Gets the value of the numberFillsAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getNumberFillsAllowed() {
        return numberFillsAllowed;
    }

    /**
     * Sets the value of the numberFillsAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setNumberFillsAllowed(INT value) {
        this.numberFillsAllowed = value;
    }

    /**
     * Gets the value of the orderEventTime property.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getOrderEventTime() {
        return orderEventTime;
    }

    /**
     * Sets the value of the orderEventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setOrderEventTime(IVLTS value) {
        this.orderEventTime = value;
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
