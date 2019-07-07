
package de.fi.atm.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.fi.atm.types package. 
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
    private final static QName _ATMOrderError_QNAME = new QName("http://www.fi.de/atm/types", "ATMOrderError");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.fi.atm.types
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
     * Create an instance of {@link ATMOrderErrorType }
     * 
     */
    public ATMOrderErrorType createATMOrderErrorType() {
        return new ATMOrderErrorType();
    }

    /**
     * Create an instance of {@link ATMOrderType }
     * 
     */
    public ATMOrderType createATMOrderType() {
        return new ATMOrderType();
    }

    /**
     * Create an instance of {@link ATMOrderConfirmation }
     * 
     */
    public ATMOrderConfirmation createATMOrderConfirmation() {
        return new ATMOrderConfirmation();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ATMOrderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fi.de/atm/types", name = "ATMOrder")
    public JAXBElement<ATMOrderType> createATMOrder(ATMOrderType value) {
        return new JAXBElement<ATMOrderType>(_ATMOrder_QNAME, ATMOrderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATMOrderConfirmationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fi.de/atm/types", name = "ATMOrderConfirmation")
    public JAXBElement<ATMOrderConfirmationType> createATMOrderConfirmation(ATMOrderConfirmationType value) {
        return new JAXBElement<ATMOrderConfirmationType>(_ATMOrderConfirmation_QNAME, ATMOrderConfirmationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATMOrderErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fi.de/atm/types", name = "ATMOrderError")
    public JAXBElement<ATMOrderErrorType> createATMOrderError(ATMOrderErrorType value) {
        return new JAXBElement<ATMOrderErrorType>(_ATMOrderError_QNAME, ATMOrderErrorType.class, null, value);
    }

}
