package org.openmes.jws.jaxb.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openmes.jws.jaxb.model.ATMOrder;
import org.openmes.jws.test.TestModelHelper;

public class TestJAXBSerialization {

	private static JAXBContext context;
	
	@BeforeClass
	public static void iniitializeTest() {
		
		try {
			context = JAXBContext.newInstance(new Class[] {org.openmes.jws.jaxb.model.ATMOrder.class});
		} catch (JAXBException e) {
			e.printStackTrace();
		}
				
	}
	
	@Test
	public void testMarshalling() {
		Marshaller marshaller;
		OutputStream outputStream;
		try {
			outputStream = new FileOutputStream(new File("xmlStream.xml"));
			marshaller = context.createMarshaller();
			marshaller.marshal(TestModelHelper.createRequestObject(), outputStream);
						
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}
	
	
	@Test
	public void testUnmarshalling() {
		InputStream inputStream;
		Unmarshaller unmarshaller;
		
		try {
			inputStream = new FileInputStream(new File("xmlStream.xml"));
			unmarshaller = context.createUnmarshaller();
			ATMOrder oder = (ATMOrder)unmarshaller.unmarshal(inputStream);
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
