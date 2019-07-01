package org.openmes.jws.client.test;


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
		
		person.setFirstname("Dave");
		person.setLastname("Winer");
		person.setCity("Silicon Valley");
		person.setStreet("555 Bailey");
				
		peopleGroup.getPerson().add(person);
			
		return order;
				
	}	
	
}
