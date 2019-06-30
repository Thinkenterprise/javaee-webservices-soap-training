
package org.openmes.jws.jaxb.model;

public class ATMOrder {

  
    protected PeopleGroup people;

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
