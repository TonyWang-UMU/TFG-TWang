//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.01 at 09:01:02 PM CEST 
//


package org.opencds.vmr.v1_0.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The relationship between one Entity and another Entity.
 * 
 * <p>Java class for RelatedEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetRole" type="{org.opencds.vmr.v1_0.schema.datatypes}CD"/>
 *         &lt;element name="relationshipTimeInterval" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_TS" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="administrableSubstance">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{org.opencds.vmr.v1_0.schema.vmr}AdministrableSubstance">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="entity">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{org.opencds.vmr.v1_0.schema.vmr}Entity">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="facility">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{org.opencds.vmr.v1_0.schema.vmr}Facility">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="organization">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{org.opencds.vmr.v1_0.schema.vmr}Organization">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="person">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{org.opencds.vmr.v1_0.schema.vmr}Person">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="specimen">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{org.opencds.vmr.v1_0.schema.vmr}Specimen">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
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
@XmlType(name = "RelatedEntity", propOrder = {
    "targetRole",
    "relationshipTimeInterval",
    "administrableSubstance",
    "entity",
    "facility",
    "organization",
    "person",
    "specimen"
})
public class RelatedEntity {

    @XmlElement(required = true)
    protected CD targetRole;
    protected IVLTS relationshipTimeInterval;
    protected RelatedEntity.AdministrableSubstance administrableSubstance;
    protected RelatedEntity.Entity entity;
    protected RelatedEntity.Facility facility;
    protected RelatedEntity.Organization organization;
    protected RelatedEntity.Person person;
    protected RelatedEntity.Specimen specimen;

    /**
     * Gets the value of the targetRole property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getTargetRole() {
        return targetRole;
    }

    /**
     * Sets the value of the targetRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setTargetRole(CD value) {
        this.targetRole = value;
    }

    /**
     * Gets the value of the relationshipTimeInterval property.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getRelationshipTimeInterval() {
        return relationshipTimeInterval;
    }

    /**
     * Sets the value of the relationshipTimeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setRelationshipTimeInterval(IVLTS value) {
        this.relationshipTimeInterval = value;
    }

    /**
     * Gets the value of the administrableSubstance property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedEntity.AdministrableSubstance }
     *     
     */
    public RelatedEntity.AdministrableSubstance getAdministrableSubstance() {
        return administrableSubstance;
    }

    /**
     * Sets the value of the administrableSubstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedEntity.AdministrableSubstance }
     *     
     */
    public void setAdministrableSubstance(RelatedEntity.AdministrableSubstance value) {
        this.administrableSubstance = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedEntity.Entity }
     *     
     */
    public RelatedEntity.Entity getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedEntity.Entity }
     *     
     */
    public void setEntity(RelatedEntity.Entity value) {
        this.entity = value;
    }

    /**
     * Gets the value of the facility property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedEntity.Facility }
     *     
     */
    public RelatedEntity.Facility getFacility() {
        return facility;
    }

    /**
     * Sets the value of the facility property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedEntity.Facility }
     *     
     */
    public void setFacility(RelatedEntity.Facility value) {
        this.facility = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedEntity.Organization }
     *     
     */
    public RelatedEntity.Organization getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedEntity.Organization }
     *     
     */
    public void setOrganization(RelatedEntity.Organization value) {
        this.organization = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedEntity.Person }
     *     
     */
    public RelatedEntity.Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedEntity.Person }
     *     
     */
    public void setPerson(RelatedEntity.Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the specimen property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedEntity.Specimen }
     *     
     */
    public RelatedEntity.Specimen getSpecimen() {
        return specimen;
    }

    /**
     * Sets the value of the specimen property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedEntity.Specimen }
     *     
     */
    public void setSpecimen(RelatedEntity.Specimen value) {
        this.specimen = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{org.opencds.vmr.v1_0.schema.vmr}AdministrableSubstance">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AdministrableSubstance
        extends org.opencds.vmr.v1_0.schema.AdministrableSubstance
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{org.opencds.vmr.v1_0.schema.vmr}Entity">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Entity
        extends org.opencds.vmr.v1_0.schema.Entity
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{org.opencds.vmr.v1_0.schema.vmr}Facility">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Facility
        extends org.opencds.vmr.v1_0.schema.Facility
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{org.opencds.vmr.v1_0.schema.vmr}Organization">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Organization
        extends org.opencds.vmr.v1_0.schema.Organization
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{org.opencds.vmr.v1_0.schema.vmr}Person">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Person
        extends org.opencds.vmr.v1_0.schema.Person
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{org.opencds.vmr.v1_0.schema.vmr}Specimen">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Specimen
        extends org.opencds.vmr.v1_0.schema.Specimen
    {


    }

}
