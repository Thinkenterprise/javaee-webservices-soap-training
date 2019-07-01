package org.openmes.jws.client.handler;

import java.util.concurrent.ExecutionException;

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

import de.fi.atm.types.ATMOrderConfirmationType;

public class BockTicketCallbackHandler implements AsyncHandler<ATMOrderConfirmationType> {

	@Override
	public void handleResponse(Response<ATMOrderConfirmationType> response) {
		   
		ATMOrderConfirmationType result = null;
		
		System.out.println(BockTicketCallbackHandler.class.getSimpleName() + " called ...");
		
		try {
			result = response.get ();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}