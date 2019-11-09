
package de.fi.atm;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import de.fi.atm.types.ATMOrderConfirmationType;
import de.fi.atm.types.ATMOrderType;
import de.fi.atm.types.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ATMServicePort", targetNamespace = "http://www.fi.de/atm")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ATMServicePort {


    /**
     * 
     * @param parameters
     * @return
     *     returns de.fi.atm.types.ATMOrderConfirmationType
     */
    @WebMethod
    @WebResult(name = "ATMOrderConfirmation", targetNamespace = "http://www.fi.de/atm/types", partName = "result")
    public ATMOrderConfirmationType bookTicket(
        @WebParam(name = "ATMOrder", targetNamespace = "http://www.fi.de/atm/types", partName = "parameters")
        ATMOrderType parameters);

}
