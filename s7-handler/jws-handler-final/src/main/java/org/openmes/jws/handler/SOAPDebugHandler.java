package org.openmes.jws.handler;

import java.io.IOException;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class SOAPDebugHandler implements SOAPHandler<SOAPMessageContext> {

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		
		System.out.println(SOAPDebugHandler.class.getSimpleName());
		
		SOAPMessage soapMessage = context.getMessage();
			
		
		try {
			soapMessage.writeTo(System.out);
		} catch (SOAPException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		System.out.println(SOAPDebugHandler.class.getSimpleName() + "called");
		return true;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		return false;
	}

	@Override
	public void close(MessageContext context) {
		
		
	}

	@Override
	public Set<QName> getHeaders() {
		return null;
	}

}
