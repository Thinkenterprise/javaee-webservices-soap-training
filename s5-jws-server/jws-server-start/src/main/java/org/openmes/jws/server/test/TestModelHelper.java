package org.openmes.jws.server.test;

import org.openmes.jws.server.business.model.Order;
import org.openmes.jws.server.business.model.OrderConfirmation;
import org.openmes.jws.server.service.model.ATMOrderConfirmationType;
import org.openmes.jws.server.service.model.ATMOrderType;


public class TestModelHelper {

	
	public static ATMOrderConfirmationType mapOrderConfirmation(OrderConfirmation orderConfirmation) {
		
		ATMOrderConfirmationType atmOrderConfirmationType = new ATMOrderConfirmationType();
		
		atmOrderConfirmationType.setDate(orderConfirmation.getDate());
				
		return atmOrderConfirmationType;
				
	}

	public static Order mapATMOrderType(ATMOrderType parameters) {
		
		Order order = new Order();
		
		order.setName(parameters.getPeople());
		
		return order;
				
	}

	
	
	
}
