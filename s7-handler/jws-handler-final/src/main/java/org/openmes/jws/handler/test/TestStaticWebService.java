package org.openmes.jws.handler.test;

import javax.xml.ws.Endpoint;

import org.junit.Test;
import org.openmes.jws.service.ATMServiceImpl;

public class TestStaticWebService {

	public static void main(String[] args) {

		Endpoint.publish("http://localhost:8088/mockATMServiceSOAP", new ATMServiceImpl());

		while (true);

	}

}
