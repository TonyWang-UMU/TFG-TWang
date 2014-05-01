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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An administrable substance which may have component substances, such as specific antigens, diluents, etc.
 * 
 * <p>Java class for AdministrableSubstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdministrableSubstance">
 *   &lt;complexContent>
 *     &lt;extension base="{org.opencds.vmr.v1_0.schema.vmr}AdministrableSubstanceSimple">
 *       &lt;sequence>
 *         &lt;element name="relatedEntity" type="{org.opencds.vmr.v1_0.schema.vmr}RelatedEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdministrableSubstance", propOrder = {
    "relatedEntity"
})
@XmlSeeAlso({
    RelatedEntity.AdministrableSubstance.class
})
public class AdministrableSubstance
    extends AdministrableSubstanceSimple
{

    protected List<RelatedEntity> relatedEntity;

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

}
