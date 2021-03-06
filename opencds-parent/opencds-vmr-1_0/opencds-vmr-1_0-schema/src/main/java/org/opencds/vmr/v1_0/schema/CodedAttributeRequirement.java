//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.01 at 09:05:39 PM CEST 
//


package org.opencds.vmr.v1_0.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A requirement for a coded attribute of a clinical statement.  Specified in terms of the target coded attribute and the code(s) for that attribute that allow the requirement to be fulfilled.
 * 
 * <p>Java class for CodedAttributeRequirement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodedAttributeRequirement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetCodedAttribute" type="{org.opencds.vmr.v1_0.schema.datatypes}CS"/>
 *         &lt;element name="targetCode" type="{org.opencds.vmr.v1_0.schema.datatypes}CD" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodedAttributeRequirement", namespace = "org.opencds.vmr.v1_0.schema.cdsinput.specification", propOrder = {
    "targetCodedAttribute",
    "targetCode"
})
public class CodedAttributeRequirement {

    @XmlElement(required = true)
    protected CS targetCodedAttribute;
    @XmlElement(required = true)
    protected List<CD> targetCode;

    /**
     * Gets the value of the targetCodedAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getTargetCodedAttribute() {
        return targetCodedAttribute;
    }

    /**
     * Sets the value of the targetCodedAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setTargetCodedAttribute(CS value) {
        this.targetCodedAttribute = value;
    }

    /**
     * Gets the value of the targetCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CD }
     * 
     * 
     */
    public List<CD> getTargetCode() {
        if (targetCode == null) {
            targetCode = new ArrayList<CD>();
        }
        return this.targetCode;
    }

}
