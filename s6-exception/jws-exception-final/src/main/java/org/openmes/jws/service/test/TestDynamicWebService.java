package org.openmes.jws.service.test;

import javax.xml.ws.Endpoint;

import org.openmes.jws.service.ATMServiceProvider;

public class TestDynamicWebService {

	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:8088/mockATMServiceSOAP", new ATMServiceProvider());
		
		while(true);
				
	}
		
}
