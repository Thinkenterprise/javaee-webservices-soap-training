
package org.openmes.jws.server.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "bookTicket", namespace = "http://www.fi.de/atm")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookTicket", namespace = "http://www.fi.de/atm")
public class BookTicket {

    @XmlElement(name = "arg0", namespace = "http://www.fi.de/atm/type")
    private org.openmes.jws.server.service.model.ATMOrderType arg0;

    /**
     * 
     * @return
     *     returns ATMOrderType
     */
    public org.openmes.jws.server.service.model.ATMOrderType getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(org.openmes.jws.server.service.model.ATMOrderType arg0) {
        this.arg0 = arg0;
    }

}
