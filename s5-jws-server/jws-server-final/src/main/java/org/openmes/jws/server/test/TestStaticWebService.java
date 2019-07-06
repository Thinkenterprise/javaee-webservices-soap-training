package org.openmes.jws.server.test;

import javax.xml.ws.Endpoint;

import org.junit.Test;
import org.openmes.jws.server.service.ATMServicePortImpl;

public class TestStaticWebService {

	@Test
	public void deployWebService() {
		
		Endpoint.publish("http://localhost:8088/mockATMServiceSOAP",new ATMServicePortImpl());
			
		while(true);
		
				
		
		
	}
	
	
	
}
