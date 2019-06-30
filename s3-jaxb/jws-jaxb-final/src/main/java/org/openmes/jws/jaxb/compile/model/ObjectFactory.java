//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140802.1033 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.06.30 um 12:16:48 PM CEST 
//


package org.openmes.jws.jaxb.compile.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openmes.jws.jaxb.compile.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ATMOrder_QNAME = new QName("http://www.fi.de/atm/types", "ATMOrder");
    private final static QName _ATMOrderConfirmation_QNAME = new QName("http://www.fi.de/atm/types", "ATMOrderConfirmation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openmes.jws.jaxb.compile.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ATMOrderConfirmationType }
     * 
     */
    public ATMOrderConfirmationType createATMOrderConfirmationType() {
        return new ATMOrderConfirmationType();
    }

    /**
     * Create an instance of {@link ATMOrder }
     * 
     */
    public ATMOrder createATMOrder() {
        return new ATMOrder();
    }

    /**
     * Create an instance of {@link ProductsType }
     * 
     */
    public ProductsType createProductsType() {
        return new ProductsType();
    }

    /**
     * Create an instance of {@link PeopleGroupType }
     * 
     */
    public PeopleGroupType createPeopleGroupType() {
        return new PeopleGroupType();
    }

    /**
     * Create an instance of {@link ReservationType }
     * 
     */
    public ReservationType createReservationType() {
        return new ReservationType();
    }

    /**
     * Create an instance of {@link ProductType }
     * 
     */
    public ProductType createProductType() {
        return new ProductType();
    }

    /**
     * Create an instance of {@link PersonType }
     * 
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Create an instance of {@link ConfirmationReservationType }
     * 
     */
    public ConfirmationReservationType createConfirmationReservationType() {
        return new ConfirmationReservationType();
    }

    /**
     * Create an instance of {@link PriceType }
     * 
     */
    public PriceType createPriceType() {
        return new PriceType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATMOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fi.de/atm/types", name = "ATMOrder")
    public JAXBElement<ATMOrder> createATMOrder(ATMOrder value) {
        return new JAXBElement<ATMOrder>(_ATMOrder_QNAME, ATMOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATMOrderConfirmationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fi.de/atm/types", name = "ATMOrderConfirmation")
    public JAXBElement<ATMOrderConfirmationType> createATMOrderConfirmation(ATMOrderConfirmationType value) {
        return new JAXBElement<ATMOrderConfirmationType>(_ATMOrderConfirmation_QNAME, ATMOrderConfirmationType.class, null, value);
    }

}
