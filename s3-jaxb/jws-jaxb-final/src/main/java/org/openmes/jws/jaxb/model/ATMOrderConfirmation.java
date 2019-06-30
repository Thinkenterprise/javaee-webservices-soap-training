package org.openmes.jws.jaxb.model;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlType(name="ATMOrderConfirmationType")
public class ATMOrderConfirmation {

    protected String transactionid;
    protected boolean confirmed;
    protected boolean charged;
    protected boolean invoiced;
   
    protected XMLGregorianCalendar showdate;
   
    protected XMLGregorianCalendar showtime;
   
    protected String participant;
  
    protected String productname;
   
    protected BigInteger ticketno;
   
    protected ConfirmationReservation reservation;

    /**
     * Gets the value of the transactionid property.
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
     * Sets the value of the transactionid property.
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
     * Gets the value of the confirmed property.
     * 
     */
    public boolean isConfirmed() {
        return confirmed;
    }

    /**
     * Sets the value of the confirmed property.
     * 
     */
    public void setConfirmed(boolean value) {
        this.confirmed = value;
    }

    /**
     * Gets the value of the charged property.
     * 
     */
    public boolean isCharged() {
        return charged;
    }

    /**
     * Sets the value of the charged property.
     * 
     */
    public void setCharged(boolean value) {
        this.charged = value;
    }

    /**
     * Gets the value of the invoiced property.
     * 
     */
    public boolean isInvoiced() {
        return invoiced;
    }

    /**
     * Sets the value of the invoiced property.
     * 
     */
    public void setInvoiced(boolean value) {
        this.invoiced = value;
    }

    /**
     * Gets the value of the showdate property.
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
     * Sets the value of the showdate property.
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
     * Gets the value of the showtime property.
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
     * Sets the value of the showtime property.
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
     * Gets the value of the participant property.
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
     * Sets the value of the participant property.
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
     * Gets the value of the productname property.
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
     * Sets the value of the productname property.
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
     * Gets the value of the ticketno property.
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
     * Sets the value of the ticketno property.
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
     * Gets the value of the reservation property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationReservation }
     *     
     */
    public ConfirmationReservation getReservation() {
        return reservation;
    }

    /**
     * Sets the value of the reservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationReservation }
     *     
     */
    public void setReservation(ConfirmationReservation value) {
        this.reservation = value;
    }

}
