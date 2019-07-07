package org.openmes.jws.handler.test;

import javax.xml.ws.soap.SOAPFaultException;

import org.junit.Test;
import org.openmes.jws.handler.ATMHandlerResolver;

import de.fi.atm.ATMService;
import de.fi.atm.ATMServicePort;

public class TestStaticWebServiceClient {

	public static void main(String[] args) {

		ATMService atmService = new ATMService();

		atmService.setHandlerResolver(new ATMHandlerResolver());

		ATMServicePort atmServicePort = atmService.getATMServiceSOAP();

		try {
			atmServicePort.bookTicket(TestModelHelper.createRequestObject());
		} catch (SOAPFaultException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
