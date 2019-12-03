package org.openmes.jws.jaxb.test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestJAXBSerialization {
	
	
private static JAXBContext context;
	
	@BeforeClass
	public static void iniitializeTest() {
		
		try {
			context = JAXBContext.newInstance(new Class[] {null});
		} catch (JAXBException e) {
			e.printStackTrace();
		}
				
	}
	
	@Test
	public void testMarshalling() {
		
	}
	
	
	@Test
	public void testUnmarshalling() {
		
		
	}
	

}
