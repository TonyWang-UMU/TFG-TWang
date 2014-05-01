//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.01 at 09:05:39 PM CEST 
//


package org.opencds.vmr.v1_0.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstract base class for the provision of some clinical material or equipment to the subject, such as a wheelchair.
 * 
 * <p>Java class for SupplyBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplyBase">
 *   &lt;complexContent>
 *     &lt;extension base="{org.opencds.vmr.v1_0.schema.vmr}ClinicalStatement">
 *       &lt;sequence>
 *         &lt;element name="supplyCode" type="{org.opencds.vmr.v1_0.schema.datatypes}CD"/>
 *         &lt;element name="quantity" type="{org.opencds.vmr.v1_0.schema.datatypes}PQ" minOccurs="0"/>
 *         &lt;element name="targetBodySite" type="{org.opencds.vmr.v1_0.schema.vmr}BodySite" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplyBase", propOrder = {
    "supplyCode",
    "quantity",
    "targetBodySite"
})
@XmlSeeAlso({
    UndeliveredSupply.class,
    SupplyOrder.class,
    SupplyEvent.class,
    SupplyProposal.class
})
public abstract class SupplyBase
    extends ClinicalStatement
{

    @XmlElement(required = true)
    protected CD supplyCode;
    protected PQ quantity;
    protected BodySite targetBodySite;

    /**
     * Gets the value of the supplyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getSupplyCode() {
        return supplyCode;
    }

    /**
     * Sets the value of the supplyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setSupplyCode(CD value) {
        this.supplyCode = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setQuantity(PQ value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the targetBodySite property.
     * 
     * @return
     *     possible object is
     *     {@link BodySite }
     *     
     */
    public BodySite getTargetBodySite() {
        return targetBodySite;
    }

    /**
     * Sets the value of the targetBodySite property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodySite }
     *     
     */
    public void setTargetBodySite(BodySite value) {
        this.targetBodySite = value;
    }

}
