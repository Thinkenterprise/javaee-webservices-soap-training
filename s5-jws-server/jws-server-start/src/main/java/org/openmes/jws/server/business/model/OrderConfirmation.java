package org.openmes.jws.server.business.model;

import java.util.Date;

public class OrderConfirmation extends Order{

	public Date date;

	public OrderConfirmation(Order order) {
		super(order);
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
