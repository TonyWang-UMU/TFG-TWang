//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.01 at 12:54:04 AM CEST 
//


package org.opencds.vmr.v1_0.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The parent class containing the data used by a CDS system to generate inferences.  Includes an input vMR and optionally CDS context and/or CDS resource data.
 * 
 * <p>Java class for CDSInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CDSInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="templateId" type="{org.opencds.vmr.v1_0.schema.datatypes}II" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cdsContext" type="{org.opencds.vmr.v1_0.schema.cdsinput}CDSContext" minOccurs="0"/>
 *         &lt;element name="vmrInput" type="{org.opencds.vmr.v1_0.schema.vmr}VMR"/>
 *         &lt;element name="cdsResource" type="{org.opencds.vmr.v1_0.schema.cdsinput}CDSResource" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CDSInput", namespace = "org.opencds.vmr.v1_0.schema.cdsinput", propOrder = {
    "templateId",
    "cdsContext",
    "vmrInput",
    "cdsResource"
})
public class CDSInput {

    protected List<II> templateId;
    protected CDSContext cdsContext;
    @XmlElement(required = true)
    protected VMR vmrInput;
    protected List<CDSResource> cdsResource;

    /**
     * Gets the value of the templateId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     */
    public List<II> getTemplateId() {
        if (templateId == null) {
            templateId = new ArrayList<II>();
        }
        return this.templateId;
    }

    /**
     * Gets the value of the cdsContext property.
     * 
     * @return
     *     possible object is
     *     {@link CDSContext }
     *     
     */
    public CDSContext getCdsContext() {
        return cdsContext;
    }

    /**
     * Sets the value of the cdsContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link CDSContext }
     *     
     */
    public void setCdsContext(CDSContext value) {
        this.cdsContext = value;
    }

    /**
     * Gets the value of the vmrInput property.
     * 
     * @return
     *     possible object is
     *     {@link VMR }
     *     
     */
    public VMR getVmrInput() {
        return vmrInput;
    }

    /**
     * Sets the value of the vmrInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link VMR }
     *     
     */
    public void setVmrInput(VMR value) {
        this.vmrInput = value;
    }

    /**
     * Gets the value of the cdsResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cdsResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCdsResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CDSResource }
     * 
     * 
     */
    public List<CDSResource> getCdsResource() {
        if (cdsResource == null) {
            cdsResource = new ArrayList<CDSResource>();
        }
        return this.cdsResource;
    }

}
