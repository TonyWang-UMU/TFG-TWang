//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.01 at 12:54:04 AM CEST 
//


package org.opencds.vmr.v1_0.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A requirement for a time attribute of a clinical statement.  Specified in terms of the target time attribute and the required time interval for that attribute in relatonship to the index evaluation time.  A searchBackTimePeriod and/or a searchForwardTimePeriod must be provided.
 * 
 * <p>Java class for TimeAttributeRequirement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeAttributeRequirement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetTimeAttribute" type="{org.opencds.vmr.v1_0.schema.datatypes}CS"/>
 *         &lt;element name="searchBackTimePeriod" type="{org.opencds.vmr.v1_0.schema.datatypes}PQ" minOccurs="0"/>
 *         &lt;element name="searchForwardTimePeriod" type="{org.opencds.vmr.v1_0.schema.datatypes}PQ" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeAttributeRequirement", namespace = "org.opencds.vmr.v1_0.schema.cdsinput.specification", propOrder = {
    "targetTimeAttribute",
    "searchBackTimePeriod",
    "searchForwardTimePeriod"
})
public class TimeAttributeRequirement {

    @XmlElement(required = true)
    protected CS targetTimeAttribute;
    protected PQ searchBackTimePeriod;
    protected PQ searchForwardTimePeriod;

    /**
     * Gets the value of the targetTimeAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getTargetTimeAttribute() {
        return targetTimeAttribute;
    }

    /**
     * Sets the value of the targetTimeAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setTargetTimeAttribute(CS value) {
        this.targetTimeAttribute = value;
    }

    /**
     * Gets the value of the searchBackTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getSearchBackTimePeriod() {
        return searchBackTimePeriod;
    }

    /**
     * Sets the value of the searchBackTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setSearchBackTimePeriod(PQ value) {
        this.searchBackTimePeriod = value;
    }

    /**
     * Gets the value of the searchForwardTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getSearchForwardTimePeriod() {
        return searchForwardTimePeriod;
    }

    /**
     * Sets the value of the searchForwardTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setSearchForwardTimePeriod(PQ value) {
        this.searchForwardTimePeriod = value;
    }

}
