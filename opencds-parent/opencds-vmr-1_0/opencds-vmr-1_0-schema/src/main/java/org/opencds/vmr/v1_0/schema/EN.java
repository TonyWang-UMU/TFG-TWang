//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.01 at 09:01:02 PM CEST 
//


package org.opencds.vmr.v1_0.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A name for a person, organization, place or thing. 
 * 
 * Examples:   Jim Bob Walton, Jr., Health Level Seven, Inc., Lake Tahoe, etc. An entity name may be as simple as a character string or may consist of several entity name parts, such as, Jim, Bob, Walton, and Jr., Health Level Seven, and Inc.
 * 
 * Entity names are essentially sequences of entity name parts, but add a "use" code.
 * 
 * 
 * <p>Java class for EN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EN">
 *   &lt;complexContent>
 *     &lt;extension base="{org.opencds.vmr.v1_0.schema.datatypes}ANY">
 *       &lt;sequence>
 *         &lt;element name="part" type="{org.opencds.vmr.v1_0.schema.datatypes}ENXP" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="use" type="{org.opencds.vmr.v1_0.schema.datatypes}set_EntityNameUse" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EN", namespace = "org.opencds.vmr.v1_0.schema.datatypes", propOrder = {
    "part"
})
public class EN
    extends ANY
{

    @XmlElement(required = true)
    protected List<ENXP> part;
    @XmlAttribute(name = "use")
    protected List<EntityNameUse> use;

    /**
     * Gets the value of the part property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the part property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENXP }
     * 
     * 
     */
    public List<ENXP> getPart() {
        if (part == null) {
            part = new ArrayList<ENXP>();
        }
        return this.part;
    }

    /**
     * Gets the value of the use property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the use property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityNameUse }
     * 
     * 
     */
    public List<EntityNameUse> getUse() {
        if (use == null) {
            use = new ArrayList<EntityNameUse>();
        }
        return this.use;
    }

}
