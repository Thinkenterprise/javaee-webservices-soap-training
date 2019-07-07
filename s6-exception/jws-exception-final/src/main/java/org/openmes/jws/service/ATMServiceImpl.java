package org.openmes.jws.service;

import javax.jws.WebService;

import de.fi.atm.ATMOrderError;
import de.fi.atm.ATMServicePort;
import de.fi.atm.types.ATMOrderConfirmationType;
import de.fi.atm.types.ATMOrderErrorType;
import de.fi.atm.types.ATMOrderType;

@WebService(endpointInterface="de.fi.atm.ATMServicePort")
public class ATMServiceImpl implements ATMServicePort {

	@Override
	public ATMOrderConfirmationType bookTicket(ATMOrderType parameters)
			throws ATMOrderError {
	
	ATMOrderErrorType atmOrderErrorType = new ATMOrderErrorType();
		
		atmOrderErrorType.setMsg("Buchung nicht Möglich");
		atmOrderErrorType.setCode(100);
		ATMOrderError atmOrderError = new ATMOrderError("Business Exception", atmOrderErrorType);
		
		throw atmOrderError;
	}

}
