package org.openmes.jws.client.test;

import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.concurrent.Future;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Response;
import javax.xml.ws.soap.SOAPBinding;

import org.junit.BeforeClass;
import org.junit.Test;


import de.fi.atm.ATMService;
import de.fi.atm.ATMServicePort;
import de.fi.atm.types.ATMOrderConfirmationType;



public class TestStaticServiceClient {

	private static ATMService service;
	private static ATMServicePort servicePort = null;
	
	private static class DefaultTrustManager implements X509TrustManager {

	    @Override
	    public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {}

	    @Override
	    public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {}

	    @Override
	    public X509Certificate[] getAcceptedIssuers() {
	        return null;
	    }
	}
	
	
	
	@BeforeClass
	public static void initWebServiceClient(){
		
		 SSLContext ctx;
		try {
			ctx = SSLContext.getInstance("TLS");
			  ctx.init(new KeyManager[0], new TrustManager[] {new DefaultTrustManager()}, new SecureRandom());
		        SSLContext.setDefault(ctx);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	      

			
		
		try {
			service = new ATMService();
			servicePort = service.getATMServiceSOAPHttps();
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
	
	
   
}
