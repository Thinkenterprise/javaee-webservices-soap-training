package org.openmes.jws.client.test;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestDynamicServiceClient {

	static private Service service;
	
	@BeforeClass
	public static void initWebServiceClient() {

		try {
			
			service = Service.create(new URL(
					"http://localhost:8088/mockATMServiceSOAP?WSDL"),
					new QName("http://www.fi.de/atm", "ATMService"));
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		System.out.println("initWebServiceClient");
	}
 
	
	
	 @Test
	public void callXMLService() {

		InputStream inputStream;
		Source source;

		try {

			inputStream = new FileInputStream(new File(
					"res/bookTicketRequest.xml"));

			source = new StreamSource(inputStream);

			Dispatch<Source> dispatcher = service.createDispatch(new QName(
					"http://www.fi.de/atm", "ATMServiceSOAP"), Source.class,
					Service.Mode.PAYLOAD);

			Source result = dispatcher.invoke(source);
			System.out.println(result);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void callJAXBService() {
		
	}

}
