package org.openmes.jws.service;

import javax.jws.WebService;

import org.openmes.jws.handler.test.TestModelHelper;

import de.fi.atm.ATMServicePort;
import de.fi.atm.types.ATMOrderConfirmationType;
import de.fi.atm.types.ATMOrderType;


@WebService(endpointInterface="de.fi.atm.ATMServicePort")
public class ATMServiceImpl implements ATMServicePort {

	@Override
	public ATMOrderConfirmationType bookTicket(ATMOrderType parameters) {
		return TestModelHelper.createResponseObject();
	}

	

}
