//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.01 at 06:23:30 PM CEST 
//


package org.opencds.vmr.v1_0.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstract base class for a goal, which is a clinical end or aim towards which effort is directed.
 * 
 * <p>Java class for GoalBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GoalBase">
 *   &lt;complexContent>
 *     &lt;extension base="{org.opencds.vmr.v1_0.schema.vmr}ClinicalStatement">
 *       &lt;sequence>
 *         &lt;element name="goalFocus" type="{org.opencds.vmr.v1_0.schema.datatypes}CD"/>
 *         &lt;element name="criticality" type="{org.opencds.vmr.v1_0.schema.datatypes}CD" minOccurs="0"/>
 *         &lt;element name="goalPursuitEffectiveTime" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_TS" minOccurs="0"/>
 *         &lt;element name="goalAchievementTargetTime" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_TS" minOccurs="0"/>
 *         &lt;element name="targetBodySite" type="{org.opencds.vmr.v1_0.schema.vmr}BodySite" minOccurs="0"/>
 *         &lt;element name="targetGoalValue" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice minOccurs="0">
 *                   &lt;element name="boolean" type="{org.opencds.vmr.v1_0.schema.datatypes}BL"/>
 *                   &lt;element name="concept" type="{org.opencds.vmr.v1_0.schema.datatypes}CD"/>
 *                   &lt;element name="decimal" type="{org.opencds.vmr.v1_0.schema.datatypes}REAL"/>
 *                   &lt;element name="decimalRange" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_REAL"/>
 *                   &lt;element name="integer" type="{org.opencds.vmr.v1_0.schema.datatypes}INT"/>
 *                   &lt;element name="integerRange" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_INT"/>
 *                   &lt;element name="physicalQuantity" type="{org.opencds.vmr.v1_0.schema.datatypes}PQ"/>
 *                   &lt;element name="physicalQuantityRange" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_PQ"/>
 *                   &lt;element name="ratio" type="{org.opencds.vmr.v1_0.schema.datatypes}RTO"/>
 *                   &lt;element name="ratioRange" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_RTO"/>
 *                   &lt;element name="simpleConcept" type="{org.opencds.vmr.v1_0.schema.datatypes}CS"/>
 *                   &lt;element name="text" type="{org.opencds.vmr.v1_0.schema.datatypes}ST"/>
 *                   &lt;element name="time" type="{org.opencds.vmr.v1_0.schema.datatypes}TS"/>
 *                   &lt;element name="timeRange" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_TS"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoalBase", propOrder = {
    "goalFocus",
    "criticality",
    "goalPursuitEffectiveTime",
    "goalAchievementTargetTime",
    "targetBodySite",
    "targetGoalValue"
})
@XmlSeeAlso({
    GoalProposal.class,
    Goal.class
})
public abstract class GoalBase
    extends ClinicalStatement
{

    @XmlElement(required = true)
    protected CD goalFocus;
    protected CD criticality;
    protected IVLTS goalPursuitEffectiveTime;
    protected IVLTS goalAchievementTargetTime;
    protected BodySite targetBodySite;
    protected GoalBase.TargetGoalValue targetGoalValue;

    /**
     * Gets the value of the goalFocus property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getGoalFocus() {
        return goalFocus;
    }

    /**
     * Sets the value of the goalFocus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setGoalFocus(CD value) {
        this.goalFocus = value;
    }

    /**
     * Gets the value of the criticality property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getCriticality() {
        return criticality;
    }

    /**
     * Sets the value of the criticality property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setCriticality(CD value) {
        this.criticality = value;
    }

    /**
     * Gets the value of the goalPursuitEffectiveTime property.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getGoalPursuitEffectiveTime() {
        return goalPursuitEffectiveTime;
    }

    /**
     * Sets the value of the goalPursuitEffectiveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setGoalPursuitEffectiveTime(IVLTS value) {
        this.goalPursuitEffectiveTime = value;
    }

    /**
     * Gets the value of the goalAchievementTargetTime property.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getGoalAchievementTargetTime() {
        return goalAchievementTargetTime;
    }

    /**
     * Sets the value of the goalAchievementTargetTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setGoalAchievementTargetTime(IVLTS value) {
        this.goalAchievementTargetTime = value;
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

    /**
     * Gets the value of the targetGoalValue property.
     * 
     * @return
     *     possible object is
     *     {@link GoalBase.TargetGoalValue }
     *     
     */
    public GoalBase.TargetGoalValue getTargetGoalValue() {
        return targetGoalValue;
    }

    /**
     * Sets the value of the targetGoalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoalBase.TargetGoalValue }
     *     
     */
    public void setTargetGoalValue(GoalBase.TargetGoalValue value) {
        this.targetGoalValue = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element name="boolean" type="{org.opencds.vmr.v1_0.schema.datatypes}BL"/>
     *         &lt;element name="concept" type="{org.opencds.vmr.v1_0.schema.datatypes}CD"/>
     *         &lt;element name="decimal" type="{org.opencds.vmr.v1_0.schema.datatypes}REAL"/>
     *         &lt;element name="decimalRange" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_REAL"/>
     *         &lt;element name="integer" type="{org.opencds.vmr.v1_0.schema.datatypes}INT"/>
     *         &lt;element name="integerRange" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_INT"/>
     *         &lt;element name="physicalQuantity" type="{org.opencds.vmr.v1_0.schema.datatypes}PQ"/>
     *         &lt;element name="physicalQuantityRange" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_PQ"/>
     *         &lt;element name="ratio" type="{org.opencds.vmr.v1_0.schema.datatypes}RTO"/>
     *         &lt;element name="ratioRange" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_RTO"/>
     *         &lt;element name="simpleConcept" type="{org.opencds.vmr.v1_0.schema.datatypes}CS"/>
     *         &lt;element name="text" type="{org.opencds.vmr.v1_0.schema.datatypes}ST"/>
     *         &lt;element name="time" type="{org.opencds.vmr.v1_0.schema.datatypes}TS"/>
     *         &lt;element name="timeRange" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_TS"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "_boolean",
        "concept",
        "decimal",
        "decimalRange",
        "integer",
        "integerRange",
        "physicalQuantity",
        "physicalQuantityRange",
        "ratio",
        "ratioRange",
        "simpleConcept",
        "text",
        "time",
        "timeRange"
    })
    public static class TargetGoalValue {

        @XmlElement(name = "boolean")
        protected BL _boolean;
        protected CD concept;
        protected REAL decimal;
        protected IVLREAL decimalRange;
        protected INT integer;
        protected IVLINT integerRange;
        protected PQ physicalQuantity;
        protected IVLPQ physicalQuantityRange;
        protected RTO ratio;
        protected IVLRTO ratioRange;
        protected CS simpleConcept;
        protected ST text;
        protected TS time;
        protected IVLTS timeRange;

        /**
         * Gets the value of the boolean property.
         * 
         * @return
         *     possible object is
         *     {@link BL }
         *     
         */
        public BL getBoolean() {
            return _boolean;
        }

        /**
         * Sets the value of the boolean property.
         * 
         * @param value
         *     allowed object is
         *     {@link BL }
         *     
         */
        public void setBoolean(BL value) {
            this._boolean = value;
        }

        /**
         * Gets the value of the concept property.
         * 
         * @return
         *     possible object is
         *     {@link CD }
         *     
         */
        public CD getConcept() {
            return concept;
        }

        /**
         * Sets the value of the concept property.
         * 
         * @param value
         *     allowed object is
         *     {@link CD }
         *     
         */
        public void setConcept(CD value) {
            this.concept = value;
        }

        /**
         * Gets the value of the decimal property.
         * 
         * @return
         *     possible object is
         *     {@link REAL }
         *     
         */
        public REAL getDecimal() {
            return decimal;
        }

        /**
         * Sets the value of the decimal property.
         * 
         * @param value
         *     allowed object is
         *     {@link REAL }
         *     
         */
        public void setDecimal(REAL value) {
            this.decimal = value;
        }

        /**
         * Gets the value of the decimalRange property.
         * 
         * @return
         *     possible object is
         *     {@link IVLREAL }
         *     
         */
        public IVLREAL getDecimalRange() {
            return decimalRange;
        }

        /**
         * Sets the value of the decimalRange property.
         * 
         * @param value
         *     allowed object is
         *     {@link IVLREAL }
         *     
         */
        public void setDecimalRange(IVLREAL value) {
            this.decimalRange = value;
        }

        /**
         * Gets the value of the integer property.
         * 
         * @return
         *     possible object is
         *     {@link INT }
         *     
         */
        public INT getInteger() {
            return integer;
        }

        /**
         * Sets the value of the integer property.
         * 
         * @param value
         *     allowed object is
         *     {@link INT }
         *     
         */
        public void setInteger(INT value) {
            this.integer = value;
        }

        /**
         * Gets the value of the integerRange property.
         * 
         * @return
         *     possible object is
         *     {@link IVLINT }
         *     
         */
        public IVLINT getIntegerRange() {
            return integerRange;
        }

        /**
         * Sets the value of the integerRange property.
         * 
         * @param value
         *     allowed object is
         *     {@link IVLINT }
         *     
         */
        public void setIntegerRange(IVLINT value) {
            this.integerRange = value;
        }

        /**
         * Gets the value of the physicalQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link PQ }
         *     
         */
        public PQ getPhysicalQuantity() {
            return physicalQuantity;
        }

        /**
         * Sets the value of the physicalQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link PQ }
         *     
         */
        public void setPhysicalQuantity(PQ value) {
            this.physicalQuantity = value;
        }

        /**
         * Gets the value of the physicalQuantityRange property.
         * 
         * @return
         *     possible object is
         *     {@link IVLPQ }
         *     
         */
        public IVLPQ getPhysicalQuantityRange() {
            return physicalQuantityRange;
        }

        /**
         * Sets the value of the physicalQuantityRange property.
         * 
         * @param value
         *     allowed object is
         *     {@link IVLPQ }
         *     
         */
        public void setPhysicalQuantityRange(IVLPQ value) {
            this.physicalQuantityRange = value;
        }

        /**
         * Gets the value of the ratio property.
         * 
         * @return
         *     possible object is
         *     {@link RTO }
         *     
         */
        public RTO getRatio() {
            return ratio;
        }

        /**
         * Sets the value of the ratio property.
         * 
         * @param value
         *     allowed object is
         *     {@link RTO }
         *     
         */
        public void setRatio(RTO value) {
            this.ratio = value;
        }

        /**
         * Gets the value of the ratioRange property.
         * 
         * @return
         *     possible object is
         *     {@link IVLRTO }
         *     
         */
        public IVLRTO getRatioRange() {
            return ratioRange;
        }

        /**
         * Sets the value of the ratioRange property.
         * 
         * @param value
         *     allowed object is
         *     {@link IVLRTO }
         *     
         */
        public void setRatioRange(IVLRTO value) {
            this.ratioRange = value;
        }

        /**
         * Gets the value of the simpleConcept property.
         * 
         * @return
         *     possible object is
         *     {@link CS }
         *     
         */
        public CS getSimpleConcept() {
            return simpleConcept;
        }

        /**
         * Sets the value of the simpleConcept property.
         * 
         * @param value
         *     allowed object is
         *     {@link CS }
         *     
         */
        public void setSimpleConcept(CS value) {
            this.simpleConcept = value;
        }

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link ST }
         *     
         */
        public ST getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link ST }
         *     
         */
        public void setText(ST value) {
            this.text = value;
        }

        /**
         * Gets the value of the time property.
         * 
         * @return
         *     possible object is
         *     {@link TS }
         *     
         */
        public TS getTime() {
            return time;
        }

        /**
         * Sets the value of the time property.
         * 
         * @param value
         *     allowed object is
         *     {@link TS }
         *     
         */
        public void setTime(TS value) {
            this.time = value;
        }

        /**
         * Gets the value of the timeRange property.
         * 
         * @return
         *     possible object is
         *     {@link IVLTS }
         *     
         */
        public IVLTS getTimeRange() {
            return timeRange;
        }

        /**
         * Sets the value of the timeRange property.
         * 
         * @param value
         *     allowed object is
         *     {@link IVLTS }
         *     
         */
        public void setTimeRange(IVLTS value) {
            this.timeRange = value;
        }

    }

}