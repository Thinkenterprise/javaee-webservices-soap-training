package org.openmes.jws.service.test;

import static org.junit.Assert.*;

import org.junit.Test;

import de.fi.atm.ATMOrderError;
import de.fi.atm.ATMService;
import de.fi.atm.ATMServicePort;

public class TestStaticWebServiceClient {

	public static void main(String[] args) {
		
		ATMService atmService = new ATMService();
		ATMServicePort atmServicePort = atmService.getATMServiceSOAP();
		
		try {
			atmServicePort.bookTicket(null);
		
		} catch (ATMOrderError e) {
			System.out.println("Beaknnte Fachlicher Fehler im Web Service");
			e.printStackTrace();
			fail();
		} catch (RuntimeException e) {
			System.out.println("Technische Fehler im Web Service");
			e.printStackTrace();
			fail();
		} catch (Exception e) {
			System.out.println("Unbekannte fachlicher Fehler im Web Service");
			e.printStackTrace();
			fail();
		}
					
	}
	
}
