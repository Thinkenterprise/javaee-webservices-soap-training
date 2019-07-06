package org.openmes.jws.server.test;

import static org.junit.Assert.fail;

import javax.xml.ws.Endpoint;

import org.junit.Test;

public class TestDynamicWebService {

	
	@Test
	public void deployWebService() {
		
		try {
			Endpoint.publish("http://localhost:8088/mockATMServiceSOAP", null);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		
		
		while(true);
				
	}
}
