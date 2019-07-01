package org.openmes.jws.client.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openmes.jws.client.handler.BockTicketCallbackHandler;

import de.fi.atm.ATMService;
import de.fi.atm.ATMServicePort;
import de.fi.atm.types.ATMOrderConfirmationType;


public class TestStaticServiceClient {

	private static ATMService service;
	private static ATMServicePort servicePort;
	
	@BeforeClass
	public static void initWebServiceClient(){
		try {
			service = new ATMService();
			servicePort = service.getATMServiceSOAP();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	@Test
	public void callService() {
		ATMOrderConfirmationType result = null;
		 
		
		try {
			result = servicePort. bookTicket(TestModelHelper.createRequestObject());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Synchroner aufruf abgeschlossen");	
			
	}
	
	@Test
	public void callAsyncService() {
		
		System.out.println("Asynchroner aufruf abgeschlossen");	
		try {
			servicePort.bookTicketAsync(TestModelHelper.createRequestObject(), new BockTicketCallbackHandler());
		} catch (Exception e) {
			
		}
		System.out.println("Ergebnis wird über BockTicketCallbackHandler zurückgegeben");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		
	}
		
		
}
