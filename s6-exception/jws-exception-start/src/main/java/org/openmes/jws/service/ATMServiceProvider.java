package org.openmes.jws.service;

import javax.xml.soap.SOAPMessage;
import javax.xml.ws.Provider;
import javax.xml.ws.Service.Mode;
import javax.xml.ws.ServiceMode;
import javax.xml.ws.WebServiceProvider;
import javax.xml.ws.soap.SOAPFaultException;

@WebServiceProvider(serviceName="ATMService",
				    portName="ATMServiceSOAP",
				    targetNamespace="http://www.fi.de/atm",
				    wsdlLocation="ATMService.wsdl")
				   
@ServiceMode(value=Mode.MESSAGE)
public class ATMServiceProvider implements Provider<SOAPMessage> {

	@Override
	public SOAPMessage invoke(SOAPMessage parameter) {
		
		throw new SOAPFaultException(SoapFaultHelper.createFault("Fehler", "Client", "Training"));

		
	}
}
