package org.openmes.jws.service.test;

import javax.xml.namespace.QName;
import javax.xml.soap.Detail;
import javax.xml.soap.DetailEntry;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPFault;


public class TestModelHelper {

	
public static SOAPFault createFault(String message, String code, String actor) {
		
		SOAPFault soapFault = null;
		
		
		try {
			SOAPFactory soapFactory = SOAPFactory.newInstance();
			soapFault = soapFactory.createFault();
						
			soapFault.setFaultCode(code);
			soapFault.setFaultActor(actor);
			soapFault.setFaultString(message);	
			
			Detail detail = soapFault.addDetail();

			QName entryName = new QName("http://www.fi.de/atm/types", "amtfaultdetailentry", "message");
			DetailEntry entry = detail.addDetailEntry(entryName);
			entry.addTextNode("Der Wert entspricht nicht der vorgegeben Menge");

					
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return soapFault;
		
		
	}
	
	
	
}
