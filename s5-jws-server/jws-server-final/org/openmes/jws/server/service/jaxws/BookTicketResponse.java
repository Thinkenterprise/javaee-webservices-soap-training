
package org.openmes.jws.server.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "bookTicketResponse", namespace = "http://www.fi.de/atm")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookTicketResponse", namespace = "http://www.fi.de/atm")
public class BookTicketResponse {

    @XmlElement(name = "return", namespace = "http://www.fi.de/atm/type")
    private org.openmes.jws.server.service.model.ATMOrderConfirmationType _return;

    /**
     * 
     * @return
     *     returns ATMOrderConfirmationType
     */
    public org.openmes.jws.server.service.model.ATMOrderConfirmationType getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(org.openmes.jws.server.service.model.ATMOrderConfirmationType _return) {
        this._return = _return;
    }

}
