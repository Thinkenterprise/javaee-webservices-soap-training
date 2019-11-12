package org.openmes.jws.deployment.service;

import javax.jws.WebService;

import de.fi.atm.ATMServicePort;
import de.fi.atm.types.ATMOrderConfirmationType;
import de.fi.atm.types.ATMOrderType;

@WebService( endpointInterface="de.fi.atm.ATMServicePort",
serviceName="ATMService",
portName="ATMServiceSOAP",
targetNamespace="http://www.fi.de/atm")

public class ATMServicePortImpl implements ATMServicePort {

	public ATMOrderConfirmationType bookTicket(ATMOrderType parameters) {
		System.out.println("Service Implementation called ...");
		return new ATMOrderConfirmationType();
				
	}

}
