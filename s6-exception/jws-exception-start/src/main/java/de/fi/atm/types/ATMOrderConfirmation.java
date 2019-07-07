
package de.fi.atm.types;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für ATMOrderConfirmation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ATMOrderConfirmation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionid" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="confirmed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="charged" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="invoiced" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="showdate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="showtime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="participant" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ticketno" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Reservation" type="{http://www.fi.de/atm/types}ConfirmationReservationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMOrderConfirmation", propOrder = {
    "transactionid",
    "confirmed",
    "charged",
    "invoiced",
    "showdate",
    "showtime",
    "participant",
    "productname",
    "ticketno",
    "reservation"
})
public class ATMOrderConfirmation {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String transactionid;
    protected boolean confirmed;
    protected boolean charged;
    protected boolean invoiced;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar showdate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar showtime;
    @XmlElement(required = true)
    protected String participant;
    @XmlElement(required = true)
    protected String productname;
    @XmlElement(required = true)
    protected BigInteger ticketno;
    @XmlElement(name = "Reservation", required = true)
    protected ConfirmationReservationType reservation;

    /**
     * Ruft den Wert der transactionid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionid() {
        return transactionid;
    }

    /**
     * Legt den Wert der transactionid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionid(String value) {
        this.transactionid = value;
    }

    /**
     * Ruft den Wert der confirmed-Eigenschaft ab.
     * 
     */
    public boolean isConfirmed() {
        return confirmed;
    }

    /**
     * Legt den Wert der confirmed-Eigenschaft fest.
     * 
     */
    public void setConfirmed(boolean value) {
        this.confirmed = value;
    }

    /**
     * Ruft den Wert der charged-Eigenschaft ab.
     * 
     */
    public boolean isCharged() {
        return charged;
    }

    /**
     * Legt den Wert der charged-Eigenschaft fest.
     * 
     */
    public void setCharged(boolean value) {
        this.charged = value;
    }

    /**
     * Ruft den Wert der invoiced-Eigenschaft ab.
     * 
     */
    public boolean isInvoiced() {
        return invoiced;
    }

    /**
     * Legt den Wert der invoiced-Eigenschaft fest.
     * 
     */
    public void setInvoiced(boolean value) {
        this.invoiced = value;
    }

    /**
     * Ruft den Wert der showdate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShowdate() {
        return showdate;
    }

    /**
     * Legt den Wert der showdate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShowdate(XMLGregorianCalendar value) {
        this.showdate = value;
    }

    /**
     * Ruft den Wert der showtime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShowtime() {
        return showtime;
    }

    /**
     * Legt den Wert der showtime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShowtime(XMLGregorianCalendar value) {
        this.showtime = value;
    }

    /**
     * Ruft den Wert der participant-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipant() {
        return participant;
    }

    /**
     * Legt den Wert der participant-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipant(String value) {
        this.participant = value;
    }

    /**
     * Ruft den Wert der productname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductname() {
        return productname;
    }

    /**
     * Legt den Wert der productname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductname(String value) {
        this.productname = value;
    }

    /**
     * Ruft den Wert der ticketno-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTicketno() {
        return ticketno;
    }

    /**
     * Legt den Wert der ticketno-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTicketno(BigInteger value) {
        this.ticketno = value;
    }

    /**
     * Ruft den Wert der reservation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationReservationType }
     *     
     */
    public ConfirmationReservationType getReservation() {
        return reservation;
    }

    /**
     * Legt den Wert der reservation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationReservationType }
     *     
     */
    public void setReservation(ConfirmationReservationType value) {
        this.reservation = value;
    }

}
