//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140802.1033 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.06.30 um 12:16:48 PM CEST 
//


package org.openmes.jws.jaxb.compile.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für ATMOrderType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ATMOrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="People" type="{http://www.fi.de/atm/types}PeopleGroupType"/>
 *         &lt;element name="Products" type="{http://www.fi.de/atm/types}ProductsType"/>
 *         &lt;element name="securetoken" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMOrderType", propOrder = {
    "people",
    "product",
    "securetoken"
})
public class ATMOrder {

    @XmlElement(name = "People", required = true)
    protected PeopleGroupType people;
    @XmlElement(name = "Products", required = true)
    protected ProductsType product;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String securetoken;

    /**
     * Ruft den Wert der people-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PeopleGroupType }
     *     
     */
    public PeopleGroupType getPeople() {
        return people;
    }

    /**
     * Legt den Wert der people-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PeopleGroupType }
     *     
     */
    public void setPeople(PeopleGroupType value) {
        this.people = value;
    }

    /**
     * Ruft den Wert der product-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProductsType }
     *     
     */
    public ProductsType getProduct() {
        return product;
    }

    /**
     * Legt den Wert der product-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductsType }
     *     
     */
    public void setProduct(ProductsType value) {
        this.product = value;
    }

    /**
     * Ruft den Wert der securetoken-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecuretoken() {
        return securetoken;
    }

    /**
     * Legt den Wert der securetoken-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecuretoken(String value) {
        this.securetoken = value;
    }

}
