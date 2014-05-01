//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.01 at 08:44:06 PM CEST 
//


package org.opencds.vmr.v1_0.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * A set of consecutive values of an ordered base datatype. 
 * 
 * Any ordered type can be the basis of an IVL; it does not matter whether the base type is discrete or continuous. If the base datatype is only partially ordered, all elements of the IVL must be elements of a totally ordered subset of the partially ordered datatype. For example, PQ is considered ordered. However the ordering of PQs is only partial; a total order is only defined among comparable quantities (quantities of the same physical dimension). While IVLs between 2 and 4 meter exists, there is no IVL between 2 meters and 4 seconds.
 * 
 * 
 * <p>Java class for IVL_RTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IVL_RTO">
 *   &lt;complexContent>
 *     &lt;extension base="{org.opencds.vmr.v1_0.schema.datatypes}ANY">
 *       &lt;attGroup ref="{org.opencds.vmr.v1_0.schema.datatypes}ATTR_RTO_HIGH"/>
 *       &lt;attGroup ref="{org.opencds.vmr.v1_0.schema.datatypes}ATTR_RTO_LOW"/>
 *       &lt;attribute name="lowIsInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="highIsInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IVL_RTO", namespace = "org.opencds.vmr.v1_0.schema.datatypes")
public class IVLRTO
    extends ANY
{

    @XmlAttribute(name = "lowIsInclusive")
    protected Boolean lowIsInclusive;
    @XmlAttribute(name = "highIsInclusive")
    protected Boolean highIsInclusive;
    @XmlAttribute(name = "highNumerator", required = true)
    protected double highNumerator;
    @XmlAttribute(name = "highDenominator", required = true)
    protected double highDenominator;
    @XmlAttribute(name = "lowNumerator", required = true)
    protected double lowNumerator;
    @XmlAttribute(name = "lowDenominator", required = true)
    protected double lowDenominator;

    /**
     * Gets the value of the lowIsInclusive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLowIsInclusive() {
        return lowIsInclusive;
    }

    /**
     * Sets the value of the lowIsInclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLowIsInclusive(Boolean value) {
        this.lowIsInclusive = value;
    }

    /**
     * Gets the value of the highIsInclusive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHighIsInclusive() {
        return highIsInclusive;
    }

    /**
     * Sets the value of the highIsInclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHighIsInclusive(Boolean value) {
        this.highIsInclusive = value;
    }

    /**
     * Gets the value of the highNumerator property.
     * 
     */
    public double getHighNumerator() {
        return highNumerator;
    }

    /**
     * Sets the value of the highNumerator property.
     * 
     */
    public void setHighNumerator(double value) {
        this.highNumerator = value;
    }

    /**
     * Gets the value of the highDenominator property.
     * 
     */
    public double getHighDenominator() {
        return highDenominator;
    }

    /**
     * Sets the value of the highDenominator property.
     * 
     */
    public void setHighDenominator(double value) {
        this.highDenominator = value;
    }

    /**
     * Gets the value of the lowNumerator property.
     * 
     */
    public double getLowNumerator() {
        return lowNumerator;
    }

    /**
     * Sets the value of the lowNumerator property.
     * 
     */
    public void setLowNumerator(double value) {
        this.lowNumerator = value;
    }

    /**
     * Gets the value of the lowDenominator property.
     * 
     */
    public double getLowDenominator() {
        return lowDenominator;
    }

    /**
     * Sets the value of the lowDenominator property.
     * 
     */
    public void setLowDenominator(double value) {
        this.lowDenominator = value;
    }

}
