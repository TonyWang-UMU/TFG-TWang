//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.01 at 08:52:49 PM CEST 
//


package org.opencds.vmr.v1_0.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * A quantity constructed as the quotient of a numerator quantity divided by a denominator quantity. 
 * Common factors in the numerator and denominator are not automatically cancelled out. 
 * The RTO datatype supports titers (e.g., 1:128) and other quantities produced by laboratories that truly represent ratios. Ratios are not simply structured numerics, particularly blood pressure measurements (e.g. 120/60) are not ratios.
 * Notes: 
 *  1.    Ratios are different from rational numbers, i.e., in ratios common factors in the numerator and denominator never cancel out. A ratio of two real or integer numbers is not automatically reduced to a real number. This datatype is not defined to generally represent rational numbers. It is used only if common factors in numerator and denominator are not supposed to cancel out. This is only rarely the case. For observation values, ratios occur almost exclusively with titers. In most other cases, REAL should be used instead of the RTO.
 * 
 * <p>Java class for RTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RTO">
 *   &lt;complexContent>
 *     &lt;extension base="{org.opencds.vmr.v1_0.schema.datatypes}QTY">
 *       &lt;attGroup ref="{org.opencds.vmr.v1_0.schema.datatypes}ATTR_RTO"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTO", namespace = "org.opencds.vmr.v1_0.schema.datatypes")
public class RTO
    extends QTY
{

    @XmlAttribute(name = "numerator", required = true)
    protected double numerator;
    @XmlAttribute(name = "denominator", required = true)
    protected double denominator;

    /**
     * Gets the value of the numerator property.
     * 
     */
    public double getNumerator() {
        return numerator;
    }

    /**
     * Sets the value of the numerator property.
     * 
     */
    public void setNumerator(double value) {
        this.numerator = value;
    }

    /**
     * Gets the value of the denominator property.
     * 
     */
    public double getDenominator() {
        return denominator;
    }

    /**
     * Sets the value of the denominator property.
     * 
     */
    public void setDenominator(double value) {
        this.denominator = value;
    }

}
