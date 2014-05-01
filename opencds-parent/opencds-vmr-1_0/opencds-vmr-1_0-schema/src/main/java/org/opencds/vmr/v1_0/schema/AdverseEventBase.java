//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.01 at 08:58:27 PM CEST 
//


package org.opencds.vmr.v1_0.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstract base class for adverse events, which are unfavorable healthcare events (e.g., death, rash, difficulty breathing) that are thought to have been caused by some agent (e.g., a medication, immunization, food, or environmental agent). If a given agent is thought to cause multiple reactions, these reactions should be represented using multiple adverse events.
 * 
 * <p>Java class for AdverseEventBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdverseEventBase">
 *   &lt;complexContent>
 *     &lt;extension base="{org.opencds.vmr.v1_0.schema.vmr}ClinicalStatement">
 *       &lt;sequence>
 *         &lt;element name="adverseEventCode" type="{org.opencds.vmr.v1_0.schema.datatypes}CD"/>
 *         &lt;element name="adverseEventAgent" type="{org.opencds.vmr.v1_0.schema.datatypes}CD" minOccurs="0"/>
 *         &lt;element name="adverseEventTime" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_TS" minOccurs="0"/>
 *         &lt;element name="documentationTime" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_TS" minOccurs="0"/>
 *         &lt;element name="affectedBodySite" type="{org.opencds.vmr.v1_0.schema.vmr}BodySite" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdverseEventBase", propOrder = {
    "adverseEventCode",
    "adverseEventAgent",
    "adverseEventTime",
    "documentationTime",
    "affectedBodySite"
})
@XmlSeeAlso({
    AdverseEvent.class,
    DeniedAdverseEvent.class
})
public abstract class AdverseEventBase
    extends ClinicalStatement
{

    @XmlElement(required = true)
    protected CD adverseEventCode;
    protected CD adverseEventAgent;
    protected IVLTS adverseEventTime;
    protected IVLTS documentationTime;
    protected List<BodySite> affectedBodySite;

    /**
     * Gets the value of the adverseEventCode property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getAdverseEventCode() {
        return adverseEventCode;
    }

    /**
     * Sets the value of the adverseEventCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setAdverseEventCode(CD value) {
        this.adverseEventCode = value;
    }

    /**
     * Gets the value of the adverseEventAgent property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getAdverseEventAgent() {
        return adverseEventAgent;
    }

    /**
     * Sets the value of the adverseEventAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setAdverseEventAgent(CD value) {
        this.adverseEventAgent = value;
    }

    /**
     * Gets the value of the adverseEventTime property.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getAdverseEventTime() {
        return adverseEventTime;
    }

    /**
     * Sets the value of the adverseEventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setAdverseEventTime(IVLTS value) {
        this.adverseEventTime = value;
    }

    /**
     * Gets the value of the documentationTime property.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getDocumentationTime() {
        return documentationTime;
    }

    /**
     * Sets the value of the documentationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setDocumentationTime(IVLTS value) {
        this.documentationTime = value;
    }

    /**
     * Gets the value of the affectedBodySite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affectedBodySite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedBodySite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BodySite }
     * 
     * 
     */
    public List<BodySite> getAffectedBodySite() {
        if (affectedBodySite == null) {
            affectedBodySite = new ArrayList<BodySite>();
        }
        return this.affectedBodySite;
    }

}
