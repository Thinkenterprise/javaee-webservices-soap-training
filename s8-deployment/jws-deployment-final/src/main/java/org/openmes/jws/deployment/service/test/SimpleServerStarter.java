package org.openmes.jws.deployment.service.test;

import javax.xml.ws.Endpoint;

import org.openmes.jws.deployment.service.ATMServicePortImpl;


public class SimpleServerStarter {

	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:8081/jws-deployment-tomcat/ATMService", new ATMServicePortImpl());
		
	}
	
}
