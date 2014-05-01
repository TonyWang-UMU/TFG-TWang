//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.01 at 08:48:19 PM CEST 
//


package org.opencds.vmr.v1_0.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A material of a particular constitution that can be given to a person to enable a clinical effect.  It can have component administrable substances.
 * 
 * <p>Java class for AdministrableSubstanceSimple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdministrableSubstanceSimple">
 *   &lt;complexContent>
 *     &lt;extension base="{org.opencds.vmr.v1_0.schema.vmr}EntityBase">
 *       &lt;sequence>
 *         &lt;element name="substanceCode" type="{org.opencds.vmr.v1_0.schema.datatypes}CD"/>
 *         &lt;element name="strength" type="{org.opencds.vmr.v1_0.schema.datatypes}RTO" minOccurs="0"/>
 *         &lt;element name="form" type="{org.opencds.vmr.v1_0.schema.datatypes}CD" minOccurs="0"/>
 *         &lt;element name="substanceBrandCode" type="{org.opencds.vmr.v1_0.schema.datatypes}CD" minOccurs="0"/>
 *         &lt;element name="substanceGenericCode" type="{org.opencds.vmr.v1_0.schema.datatypes}CD" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{org.opencds.vmr.v1_0.schema.datatypes}CD" minOccurs="0"/>
 *         &lt;element name="lotNo" type="{org.opencds.vmr.v1_0.schema.datatypes}ST" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdministrableSubstanceSimple", propOrder = {
    "substanceCode",
    "strength",
    "form",
    "substanceBrandCode",
    "substanceGenericCode",
    "manufacturer",
    "lotNo"
})
@XmlSeeAlso({
    AdministrableSubstance.class
})
public class AdministrableSubstanceSimple
    extends EntityBase
{

    @XmlElement(required = true)
    protected CD substanceCode;
    protected RTO strength;
    protected CD form;
    protected CD substanceBrandCode;
    protected CD substanceGenericCode;
    protected CD manufacturer;
    protected ST lotNo;

    /**
     * Gets the value of the substanceCode property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getSubstanceCode() {
        return substanceCode;
    }

    /**
     * Sets the value of the substanceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setSubstanceCode(CD value) {
        this.substanceCode = value;
    }

    /**
     * Gets the value of the strength property.
     * 
     * @return
     *     possible object is
     *     {@link RTO }
     *     
     */
    public RTO getStrength() {
        return strength;
    }

    /**
     * Sets the value of the strength property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTO }
     *     
     */
    public void setStrength(RTO value) {
        this.strength = value;
    }

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setForm(CD value) {
        this.form = value;
    }

    /**
     * Gets the value of the substanceBrandCode property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getSubstanceBrandCode() {
        return substanceBrandCode;
    }

    /**
     * Sets the value of the substanceBrandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setSubstanceBrandCode(CD value) {
        this.substanceBrandCode = value;
    }

    /**
     * Gets the value of the substanceGenericCode property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getSubstanceGenericCode() {
        return substanceGenericCode;
    }

    /**
     * Sets the value of the substanceGenericCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setSubstanceGenericCode(CD value) {
        this.substanceGenericCode = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setManufacturer(CD value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the lotNo property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getLotNo() {
        return lotNo;
    }

    /**
     * Sets the value of the lotNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setLotNo(ST value) {
        this.lotNo = value;
    }

}
