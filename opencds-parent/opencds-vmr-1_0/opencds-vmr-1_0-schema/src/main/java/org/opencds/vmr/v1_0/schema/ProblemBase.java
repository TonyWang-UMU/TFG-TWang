//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.01 at 08:48:19 PM CEST 
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
 * Abstract base class for problems, which are clinical conditions that need to be treated or managed.
 * 
 * <p>Java class for ProblemBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProblemBase">
 *   &lt;complexContent>
 *     &lt;extension base="{org.opencds.vmr.v1_0.schema.vmr}ClinicalStatement">
 *       &lt;sequence>
 *         &lt;element name="problemCode" type="{org.opencds.vmr.v1_0.schema.datatypes}CD"/>
 *         &lt;element name="problemEffectiveTime" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_TS" minOccurs="0"/>
 *         &lt;element name="diagnosticEventTime" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_TS" minOccurs="0"/>
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
@XmlType(name = "ProblemBase", propOrder = {
    "problemCode",
    "problemEffectiveTime",
    "diagnosticEventTime",
    "affectedBodySite"
})
@XmlSeeAlso({
    Problem.class,
    DeniedProblem.class
})
public abstract class ProblemBase
    extends ClinicalStatement
{

    @XmlElement(required = true)
    protected CD problemCode;
    protected IVLTS problemEffectiveTime;
    protected IVLTS diagnosticEventTime;
    protected List<BodySite> affectedBodySite;

    /**
     * Gets the value of the problemCode property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getProblemCode() {
        return problemCode;
    }

    /**
     * Sets the value of the problemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setProblemCode(CD value) {
        this.problemCode = value;
    }

    /**
     * Gets the value of the problemEffectiveTime property.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getProblemEffectiveTime() {
        return problemEffectiveTime;
    }

    /**
     * Sets the value of the problemEffectiveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setProblemEffectiveTime(IVLTS value) {
        this.problemEffectiveTime = value;
    }

    /**
     * Gets the value of the diagnosticEventTime property.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getDiagnosticEventTime() {
        return diagnosticEventTime;
    }

    /**
     * Sets the value of the diagnosticEventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setDiagnosticEventTime(IVLTS value) {
        this.diagnosticEventTime = value;
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
