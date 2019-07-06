package org.openmes.jws.server.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.openmes.jws.server.business.component.BusinessComponent;
import org.openmes.jws.server.business.model.Order;
import org.openmes.jws.server.business.model.OrderConfirmation;
import org.openmes.jws.server.service.model.ATMOrderConfirmationType;
import org.openmes.jws.server.service.model.ATMOrderType;
import org.openmes.jws.server.test.TestModelHelper;

@WebService(endpointInterface="org.openmes.jws.server.service.ATMServicePort")
public class ATMServicePortImpl implements ATMServicePort {

	BusinessComponent businessComponent = new BusinessComponent();
	
	
	
	public ATMOrderConfirmationType bookTicket(ATMOrderType atmOrder) {
		
		Order order = TestModelHelper.mapATMOrderType(atmOrder);
		
		OrderConfirmation orderConfirmation = businessComponent.execute(order);
		
		return TestModelHelper.mapOrderConfirmation(orderConfirmation);
	}


	
	@WebMethod(exclude=true)
	public void fooMethod() {
		
	}

	

}
