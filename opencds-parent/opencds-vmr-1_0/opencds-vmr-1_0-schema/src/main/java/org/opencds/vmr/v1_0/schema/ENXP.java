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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * A part with a type code signifying the role of the part in the whole entity name, and qualifier codes for more detail about the name part type. (Typical name parts for person names are given names, and family names, titles, etc.).
 * 
 * <p>Java class for ENXP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ENXP">
 *   &lt;complexContent>
 *     &lt;extension base="{org.opencds.vmr.v1_0.schema.datatypes}XP">
 *       &lt;attribute name="type" use="required" type="{org.opencds.vmr.v1_0.schema.datatypes}EntityNamePartType" />
 *       &lt;attribute name="qualifier" type="{org.opencds.vmr.v1_0.schema.datatypes}set_EntityNamePartQualifier" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENXP", namespace = "org.opencds.vmr.v1_0.schema.datatypes")
public class ENXP
    extends XP
{

    @XmlAttribute(name = "type", required = true)
    protected EntityNamePartType type;
    @XmlAttribute(name = "qualifier")
    protected List<EntityNamePartQualifier> qualifier;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EntityNamePartType }
     *     
     */
    public EntityNamePartType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityNamePartType }
     *     
     */
    public void setType(EntityNamePartType value) {
        this.type = value;
    }

    /**
     * Gets the value of the qualifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityNamePartQualifier }
     * 
     * 
     */
    public List<EntityNamePartQualifier> getQualifier() {
        if (qualifier == null) {
            qualifier = new ArrayList<EntityNamePartQualifier>();
        }
        return this.qualifier;
    }

}
