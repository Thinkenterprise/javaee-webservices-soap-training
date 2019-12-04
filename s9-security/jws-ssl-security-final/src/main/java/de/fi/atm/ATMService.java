
package de.fi.atm;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ATMService", targetNamespace = "http://www.fi.de/atm", wsdlLocation = "file:/C:/environment/source/jax-ws/java-ee-jax-ws-training/s9-jws-security-sample/jws-ssl-security-final/WebContent/WEB-INF/wsdl/ATMService.wsdl")
public class ATMService
    extends Service
{

    private final static URL ATMSERVICE_WSDL_LOCATION;
    private final static WebServiceException ATMSERVICE_EXCEPTION;
    private final static QName ATMSERVICE_QNAME = new QName("http://www.fi.de/atm", "ATMService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/environment/source/jax-ws/java-ee-jax-ws-training/s9-jws-security-sample/jws-ssl-security-final/WebContent/WEB-INF/wsdl/ATMService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ATMSERVICE_WSDL_LOCATION = url;
        ATMSERVICE_EXCEPTION = e;
    }

    public ATMService() {
        super(__getWsdlLocation(), ATMSERVICE_QNAME);
    }

    public ATMService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ATMSERVICE_QNAME, features);
    }

    public ATMService(URL wsdlLocation) {
        super(wsdlLocation, ATMSERVICE_QNAME);
    }

    public ATMService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ATMSERVICE_QNAME, features);
    }

    public ATMService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ATMService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ATMServicePort
     */
    @WebEndpoint(name = "ATMServiceSOAP")
    public ATMServicePort getATMServiceSOAP() {
        return super.getPort(new QName("http://www.fi.de/atm", "ATMServiceSOAP"), ATMServicePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ATMServicePort
     */
    @WebEndpoint(name = "ATMServiceSOAP")
    public ATMServicePort getATMServiceSOAP(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.fi.de/atm", "ATMServiceSOAP"), ATMServicePort.class, features);
    }

    /**
     * 
     * @return
     *     returns ATMServicePort
     */
    @WebEndpoint(name = "ATMServiceSOAPHttps")
    public ATMServicePort getATMServiceSOAPHttps() {
        return super.getPort(new QName("http://www.fi.de/atm", "ATMServiceSOAPHttps"), ATMServicePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ATMServicePort
     */
    @WebEndpoint(name = "ATMServiceSOAPHttps")
    public ATMServicePort getATMServiceSOAPHttps(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.fi.de/atm", "ATMServiceSOAPHttps"), ATMServicePort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ATMSERVICE_EXCEPTION!= null) {
            throw ATMSERVICE_EXCEPTION;
        }
        return ATMSERVICE_WSDL_LOCATION;
    }

}