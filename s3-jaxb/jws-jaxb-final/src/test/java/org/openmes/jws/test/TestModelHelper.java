package org.openmes.jws.test;

import java.util.ArrayList;

import org.openmes.jws.jaxb.model.ATMOrder;
import org.openmes.jws.jaxb.model.PeopleGroup;
import org.openmes.jws.jaxb.model.Person;
import org.openmes.jws.jaxb.model.Product;
import org.openmes.jws.jaxb.model.Products;

public class TestModelHelper {

	public static ATMOrder createRequestObject() {
		
		ATMOrder order = new ATMOrder();
		
		PeopleGroup peopleGroup = new PeopleGroup();
		Products products = new Products();
		
		order.setPeople(peopleGroup);
		order.setProducts(products);
				
		Product product = new Product();
		
		ArrayList<Product> productlist = new ArrayList<Product>();
		productlist.add(product);
				
		products.setProduct(productlist);
		
		Person person = new Person();
		
		person.setFirstname("Michael");
		person.setLastname("Schaefer");
		person.setCity("Kassel");
		person.setStreet("Franzgraben");
				
		ArrayList<Person> personalList = new ArrayList<Person>();
		personalList.add(person);
		
		peopleGroup.setPerson(personalList);
			
		return order;
				
	}
	
	
}
