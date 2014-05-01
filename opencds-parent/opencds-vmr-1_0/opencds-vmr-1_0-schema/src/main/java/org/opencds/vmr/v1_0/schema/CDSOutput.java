//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.01 at 08:44:06 PM CEST 
//


package org.opencds.vmr.v1_0.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The parent class containing the data used by a CDS system to communicate inferences.  Can use the vMR data structure or a base data type to communicate the results.
 * 
 * <p>Java class for CDSOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CDSOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vmrOutput" type="{org.opencds.vmr.v1_0.schema.vmr}VMR" minOccurs="0"/>
 *         &lt;element name="simpleOutput" type="{org.opencds.vmr.v1_0.schema.datatypes}ANY" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CDSOutput", namespace = "org.opencds.vmr.v1_0.schema.cdsoutput", propOrder = {
    "vmrOutput",
    "simpleOutput"
})
public class CDSOutput {

    protected VMR vmrOutput;
    protected ANY simpleOutput;

    /**
     * Gets the value of the vmrOutput property.
     * 
     * @return
     *     possible object is
     *     {@link VMR }
     *     
     */
    public VMR getVmrOutput() {
        return vmrOutput;
    }

    /**
     * Sets the value of the vmrOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link VMR }
     *     
     */
    public void setVmrOutput(VMR value) {
        this.vmrOutput = value;
    }

    /**
     * Gets the value of the simpleOutput property.
     * 
     * @return
     *     possible object is
     *     {@link ANY }
     *     
     */
    public ANY getSimpleOutput() {
        return simpleOutput;
    }

    /**
     * Sets the value of the simpleOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link ANY }
     *     
     */
    public void setSimpleOutput(ANY value) {
        this.simpleOutput = value;
    }

}
