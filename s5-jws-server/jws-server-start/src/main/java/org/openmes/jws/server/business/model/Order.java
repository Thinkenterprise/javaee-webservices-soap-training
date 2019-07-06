package org.openmes.jws.server.business.model;

public class Order {

	public String name;
	public String product;
	
	public Order() {}
	
	public Order(Order order) {
		name=order.getName();
		product=order.getProduct();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
		
}
