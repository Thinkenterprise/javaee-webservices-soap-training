
package org.openmes.jws.jaxb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="ATMOrder")
@XmlType(name="ATMOrderType")
@XmlAccessorType(value=XmlAccessType.NONE)
public class ATMOrder {

   @XmlElement(required=true)
    protected PeopleGroup people;
   @XmlElement(required=true)
    protected Products products;
    
   protected int scipped;
   
    /**
     * Gets the value of the people property.
     * 
     * @return
     *     possible object is
     *     {@link PeopleGroup }
     *     
     */
    public PeopleGroup getPeople() {
        return people;
    }

    /**
     * Sets the value of the people property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeopleGroup }
     *     
     */
    public void setPeople(PeopleGroup value) {
        this.people = value;
    }

    /**
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link Products }
     *     
     */
    public Products getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link Products }
     *     
     */
    public void setProducts(Products value) {
        this.products = value;
    }

   

}
