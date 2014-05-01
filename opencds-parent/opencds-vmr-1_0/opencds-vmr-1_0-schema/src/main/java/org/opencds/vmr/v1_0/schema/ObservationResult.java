//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.01 at 08:52:49 PM CEST 
//


package org.opencds.vmr.v1_0.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The findings from an observation.
 * 
 * <p>Java class for ObservationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObservationResult">
 *   &lt;complexContent>
 *     &lt;extension base="{org.opencds.vmr.v1_0.schema.vmr}ObservationBase">
 *       &lt;sequence>
 *         &lt;element name="observationEventTime" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_TS" minOccurs="0"/>
 *         &lt;element name="observationValue" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice minOccurs="0">
 *                   &lt;element name="address" type="{org.opencds.vmr.v1_0.schema.datatypes}AD"/>
 *                   &lt;element name="boolean" type="{org.opencds.vmr.v1_0.schema.datatypes}BL"/>
 *                   &lt;element name="concept" type="{org.opencds.vmr.v1_0.schema.datatypes}CD"/>
 *                   &lt;element name="decimal" type="{org.opencds.vmr.v1_0.schema.datatypes}REAL"/>
 *                   &lt;element name="decimalRange" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_REAL"/>
 *                   &lt;element name="identifier" type="{org.opencds.vmr.v1_0.schema.datatypes}II"/>
 *                   &lt;element name="integer" type="{org.opencds.vmr.v1_0.schema.datatypes}INT"/>
 *                   &lt;element name="integerRange" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_INT"/>
 *                   &lt;element name="name" type="{org.opencds.vmr.v1_0.schema.datatypes}EN"/>
 *                   &lt;element name="physicalQuantity" type="{org.opencds.vmr.v1_0.schema.datatypes}PQ"/>
 *                   &lt;element name="physicalQuantityRange" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_PQ"/>
 *                   &lt;element name="ratio" type="{org.opencds.vmr.v1_0.schema.datatypes}RTO"/>
 *                   &lt;element name="ratioRange" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_RTO"/>
 *                   &lt;element name="simpleConcept" type="{org.opencds.vmr.v1_0.schema.datatypes}CS"/>
 *                   &lt;element name="telecom" type="{org.opencds.vmr.v1_0.schema.datatypes}TEL"/>
 *                   &lt;element name="text" type="{org.opencds.vmr.v1_0.schema.datatypes}ST"/>
 *                   &lt;element name="time" type="{org.opencds.vmr.v1_0.schema.datatypes}TS"/>
 *                   &lt;element name="timeRange" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_TS"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="interpretation" type="{org.opencds.vmr.v1_0.schema.datatypes}CD" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatedEntity" type="{org.opencds.vmr.v1_0.schema.vmr}RelatedEntity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatedClinicalStatement" type="{org.opencds.vmr.v1_0.schema.vmr}RelatedClinicalStatement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservationResult", propOrder = {
    "observationEventTime",
    "observationValue",
    "interpretation",
    "relatedEntity",
    "relatedClinicalStatement"
})
public class ObservationResult
    extends ObservationBase
{

    protected IVLTS observationEventTime;
    protected ObservationResult.ObservationValue observationValue;
    protected List<CD> interpretation;
    protected List<RelatedEntity> relatedEntity;
    protected List<RelatedClinicalStatement> relatedClinicalStatement;

    /**
     * Gets the value of the observationEventTime property.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getObservationEventTime() {
        return observationEventTime;
    }

    /**
     * Sets the value of the observationEventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setObservationEventTime(IVLTS value) {
        this.observationEventTime = value;
    }

    /**
     * Gets the value of the observationValue property.
     * 
     * @return
     *     possible object is
     *     {@link ObservationResult.ObservationValue }
     *     
     */
    public ObservationResult.ObservationValue getObservationValue() {
        return observationValue;
    }

    /**
     * Sets the value of the observationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationResult.ObservationValue }
     *     
     */
    public void setObservationValue(ObservationResult.ObservationValue value) {
        this.observationValue = value;
    }

    /**
     * Gets the value of the interpretation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interpretation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterpretation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CD }
     * 
     * 
     */
    public List<CD> getInterpretation() {
        if (interpretation == null) {
            interpretation = new ArrayList<CD>();
        }
        return this.interpretation;
    }

    /**
     * Gets the value of the relatedEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedEntity }
     * 
     * 
     */
    public List<RelatedEntity> getRelatedEntity() {
        if (relatedEntity == null) {
            relatedEntity = new ArrayList<RelatedEntity>();
        }
        return this.relatedEntity;
    }

    /**
     * Gets the value of the relatedClinicalStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedClinicalStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedClinicalStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedClinicalStatement }
     * 
     * 
     */
    public List<RelatedClinicalStatement> getRelatedClinicalStatement() {
        if (relatedClinicalStatement == null) {
            relatedClinicalStatement = new ArrayList<RelatedClinicalStatement>();
        }
        return this.relatedClinicalStatement;
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
     *         &lt;element name="address" type="{org.opencds.vmr.v1_0.schema.datatypes}AD"/>
     *         &lt;element name="boolean" type="{org.opencds.vmr.v1_0.schema.datatypes}BL"/>
     *         &lt;element name="concept" type="{org.opencds.vmr.v1_0.schema.datatypes}CD"/>
     *         &lt;element name="decimal" type="{org.opencds.vmr.v1_0.schema.datatypes}REAL"/>
     *         &lt;element name="decimalRange" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_REAL"/>
     *         &lt;element name="identifier" type="{org.opencds.vmr.v1_0.schema.datatypes}II"/>
     *         &lt;element name="integer" type="{org.opencds.vmr.v1_0.schema.datatypes}INT"/>
     *         &lt;element name="integerRange" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_INT"/>
     *         &lt;element name="name" type="{org.opencds.vmr.v1_0.schema.datatypes}EN"/>
     *         &lt;element name="physicalQuantity" type="{org.opencds.vmr.v1_0.schema.datatypes}PQ"/>
     *         &lt;element name="physicalQuantityRange" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_PQ"/>
     *         &lt;element name="ratio" type="{org.opencds.vmr.v1_0.schema.datatypes}RTO"/>
     *         &lt;element name="ratioRange" type="{org.opencds.vmr.v1_0.schema.datatypes}IVL_RTO"/>
     *         &lt;element name="simpleConcept" type="{org.opencds.vmr.v1_0.schema.datatypes}CS"/>
     *         &lt;element name="telecom" type="{org.opencds.vmr.v1_0.schema.datatypes}TEL"/>
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
        "address",
        "_boolean",
        "concept",
        "decimal",
        "decimalRange",
        "identifier",
        "integer",
        "integerRange",
        "name",
        "physicalQuantity",
        "physicalQuantityRange",
        "ratio",
        "ratioRange",
        "simpleConcept",
        "telecom",
        "text",
        "time",
        "timeRange"
    })
    public static class ObservationValue {

        protected AD address;
        @XmlElement(name = "boolean")
        protected BL _boolean;
        protected CD concept;
        protected REAL decimal;
        protected IVLREAL decimalRange;
        protected II identifier;
        protected INT integer;
        protected IVLINT integerRange;
        protected EN name;
        protected PQ physicalQuantity;
        protected IVLPQ physicalQuantityRange;
        protected RTO ratio;
        protected IVLRTO ratioRange;
        protected CS simpleConcept;
        protected TEL telecom;
        protected ST text;
        protected TS time;
        protected IVLTS timeRange;

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link AD }
         *     
         */
        public AD getAddress() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link AD }
         *     
         */
        public void setAddress(AD value) {
            this.address = value;
        }

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
         * Gets the value of the identifier property.
         * 
         * @return
         *     possible object is
         *     {@link II }
         *     
         */
        public II getIdentifier() {
            return identifier;
        }

        /**
         * Sets the value of the identifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link II }
         *     
         */
        public void setIdentifier(II value) {
            this.identifier = value;
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
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link EN }
         *     
         */
        public EN getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link EN }
         *     
         */
        public void setName(EN value) {
            this.name = value;
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
         * Gets the value of the telecom property.
         * 
         * @return
         *     possible object is
         *     {@link TEL }
         *     
         */
        public TEL getTelecom() {
            return telecom;
        }

        /**
         * Sets the value of the telecom property.
         * 
         * @param value
         *     allowed object is
         *     {@link TEL }
         *     
         */
        public void setTelecom(TEL value) {
            this.telecom = value;
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
