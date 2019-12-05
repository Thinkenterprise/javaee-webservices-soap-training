package org.openmes.jws.service.test;

import javax.xml.ws.Endpoint;

public class TestStaticWebService {

	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:8088/mockATMServiceSOAP",null);
		while(true);
	}
	
}
