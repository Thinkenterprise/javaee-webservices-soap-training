
package de.fi.atm.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ATMOrderConfirmationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ATMOrderConfirmationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="confirmations" type="{http://www.fi.de/atm/types}ATMOrderConfirmation" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMOrderConfirmationType", propOrder = {
    "confirmations"
})
public class ATMOrderConfirmationType {

    @XmlElement(required = true)
    protected List<ATMOrderConfirmation> confirmations;

    /**
     * Gets the value of the confirmations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confirmations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfirmations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMOrderConfirmation }
     * 
     * 
     */
    public List<ATMOrderConfirmation> getConfirmations() {
        if (confirmations == null) {
            confirmations = new ArrayList<ATMOrderConfirmation>();
        }
        return this.confirmations;
    }

}
