//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.01 at 09:01:02 PM CEST 
//


package org.opencds.vmr.v1_0.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the clinical statements required regarding the evaluated person of interest.  Can include CodedAttributeRequirements and TimeAttributeRequirements.
 * 
 * If no CodedAttributeRequirement specified, all relevant clinical statements are required regardless of their coded attributes.  If no TimeAttributeRequirement specified, all relevant clinical statements are required regardless of their time attributes.  All specified CodedAttributeRequirements and TimeAttributeRequirements should be fulfilled in provided ClinicalStatements.
 * 
 * <p>Java class for ClinicalStatementInputSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClinicalStatementInputSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requiredGeneralClinicalStatementClass" type="{org.opencds.vmr.v1_0.schema.datatypes}CS"/>
 *         &lt;element name="requiredClinicalStatementTemplate" type="{org.opencds.vmr.v1_0.schema.datatypes}II" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="requiredSpecificClinicalStatementClass" type="{org.opencds.vmr.v1_0.schema.datatypes}CS" minOccurs="0"/>
 *         &lt;element name="codedAttributeRequirement" type="{org.opencds.vmr.v1_0.schema.cdsinput.specification}CodedAttributeRequirement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="timeAttributeRequirement" type="{org.opencds.vmr.v1_0.schema.cdsinput.specification}TimeAttributeRequirement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClinicalStatementInputSpecification", namespace = "org.opencds.vmr.v1_0.schema.cdsinput.specification", propOrder = {
    "requiredGeneralClinicalStatementClass",
    "requiredClinicalStatementTemplate",
    "requiredSpecificClinicalStatementClass",
    "codedAttributeRequirement",
    "timeAttributeRequirement"
})
public class ClinicalStatementInputSpecification {

    @XmlElement(required = true)
    protected CS requiredGeneralClinicalStatementClass;
    protected List<II> requiredClinicalStatementTemplate;
    protected CS requiredSpecificClinicalStatementClass;
    protected List<CodedAttributeRequirement> codedAttributeRequirement;
    protected List<TimeAttributeRequirement> timeAttributeRequirement;

    /**
     * Gets the value of the requiredGeneralClinicalStatementClass property.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getRequiredGeneralClinicalStatementClass() {
        return requiredGeneralClinicalStatementClass;
    }

    /**
     * Sets the value of the requiredGeneralClinicalStatementClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setRequiredGeneralClinicalStatementClass(CS value) {
        this.requiredGeneralClinicalStatementClass = value;
    }

    /**
     * Gets the value of the requiredClinicalStatementTemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredClinicalStatementTemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredClinicalStatementTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     */
    public List<II> getRequiredClinicalStatementTemplate() {
        if (requiredClinicalStatementTemplate == null) {
            requiredClinicalStatementTemplate = new ArrayList<II>();
        }
        return this.requiredClinicalStatementTemplate;
    }

    /**
     * Gets the value of the requiredSpecificClinicalStatementClass property.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getRequiredSpecificClinicalStatementClass() {
        return requiredSpecificClinicalStatementClass;
    }

    /**
     * Sets the value of the requiredSpecificClinicalStatementClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setRequiredSpecificClinicalStatementClass(CS value) {
        this.requiredSpecificClinicalStatementClass = value;
    }

    /**
     * Gets the value of the codedAttributeRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codedAttributeRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodedAttributeRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodedAttributeRequirement }
     * 
     * 
     */
    public List<CodedAttributeRequirement> getCodedAttributeRequirement() {
        if (codedAttributeRequirement == null) {
            codedAttributeRequirement = new ArrayList<CodedAttributeRequirement>();
        }
        return this.codedAttributeRequirement;
    }

    /**
     * Gets the value of the timeAttributeRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeAttributeRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeAttributeRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeAttributeRequirement }
     * 
     * 
     */
    public List<TimeAttributeRequirement> getTimeAttributeRequirement() {
        if (timeAttributeRequirement == null) {
            timeAttributeRequirement = new ArrayList<TimeAttributeRequirement>();
        }
        return this.timeAttributeRequirement;
    }

}
