package org.openmes.jws.server.service;


import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.openmes.jws.server.service.model.ATMOrderConfirmationType;
import org.openmes.jws.server.service.model.ATMOrderType;


@WebService(targetNamespace="http://www.fi.de/atm")
public interface ATMServicePort {

	
	public @WebResult(targetNamespace="http://www.fi.de/atm/type")ATMOrderConfirmationType bookTicket(@WebParam(targetNamespace="http://www.fi.de/atm/type") ATMOrderType order ); 
	
	
	public void fooMethod();
	
	
}
