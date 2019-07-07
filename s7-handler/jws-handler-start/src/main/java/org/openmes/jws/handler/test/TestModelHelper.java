package org.openmes.jws.handler.test;


import de.fi.atm.types.ATMOrderConfirmation;
import de.fi.atm.types.ATMOrderConfirmationType;
import de.fi.atm.types.ATMOrderType;
import de.fi.atm.types.PeopleGroupType;
import de.fi.atm.types.PersonType;
import de.fi.atm.types.ProductType;
import de.fi.atm.types.ProductsType;

public class TestModelHelper {

	public static ATMOrderType createRequestObject() {
		
		ATMOrderType order = new ATMOrderType();
		
		PeopleGroupType peopleGroup = new PeopleGroupType();
		ProductsType products = new ProductsType();
		
		order.setPeople(peopleGroup);
		order.setProducts(products);
				
		ProductType product = new ProductType();
		
		products.getProduct().add(product);
		
		PersonType person = new PersonType();
		
		person.setFirstname("Michael");
		person.setLastname("Schaefer");
		person.setCity("Kassel");
		person.setStreet("Franzgraben");
				
		peopleGroup.getPerson().add(person);
			
		return order;
				
	}
	
	
	public static ATMOrderConfirmationType createResponseObject() {
		
		
		ATMOrderConfirmationType atmOrderConfirmationType = new ATMOrderConfirmationType();
		
		ATMOrderConfirmation atmOrderConfirmation = new ATMOrderConfirmation();
		
		atmOrderConfirmation.setProductname("JAX-WS 2.2");
		atmOrderConfirmation.setConfirmed(true);
		atmOrderConfirmation.setParticipant("Martin Fowler");
		
		atmOrderConfirmationType.getConfirmations().add(atmOrderConfirmation);
		
		return atmOrderConfirmationType;
		
	}
	
	
}
