package org.openmes.jws.server.service;


import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.openmes.jws.server.service.model.ATMOrderConfirmationType;
import org.openmes.jws.server.service.model.ATMOrderType;


@WebService
public interface ATMServicePort {

	
	public ATMOrderConfirmationType bookTicket(ATMOrderType order); 
	public void fooMethod();
	
	
}
