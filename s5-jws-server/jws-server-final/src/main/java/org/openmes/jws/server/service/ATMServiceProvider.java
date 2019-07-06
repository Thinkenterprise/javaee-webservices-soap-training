package org.openmes.jws.server.service;

import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.Provider;
import javax.xml.ws.Service.Mode;
import javax.xml.ws.ServiceMode;
import javax.xml.ws.WebServiceProvider;

import org.w3c.dom.DOMException;

@WebServiceProvider(serviceName="ATMServicePortImplService",
				    portName="ATMServicePortImplPort",
				    targetNamespace="http://www.fi.de/atm")
@ServiceMode(Mode.MESSAGE)
public class ATMServiceProvider implements Provider<SOAPMessage> {

	@Override
	public SOAPMessage invoke(SOAPMessage parameter) {
		try {
			System.out.println(parameter.getSOAPBody().getFirstChild().getTextContent());
		} catch (DOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SOAPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return parameter;
	}

	

}
