package org.openmes.jws.server.business.component;

import java.util.Calendar;

import org.openmes.jws.server.business.model.Order;
import org.openmes.jws.server.business.model.OrderConfirmation;

public class BusinessComponent {

	
	public OrderConfirmation execute(Order order) {
		
		OrderConfirmation orderConfirmation = new OrderConfirmation(order);
			
		orderConfirmation.setDate(Calendar.getInstance().getTime());
		
		return orderConfirmation;
	}
	
}
