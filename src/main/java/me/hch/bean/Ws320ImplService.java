package me.hch.bean;

import me.hch.service.*;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-04-20T14:18:39.625+08:00
 * Generated source version: 2.7.10
 * 
 */
@WebServiceClient(name = "Ws320ImplService", 
                  wsdlLocation = "ws320.wsdl11.wsdl",
                  targetNamespace = "http://service.hch.me") 
public class Ws320ImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.hch.me", "Ws320ImplService");
    public final static QName Ws320ImplPort = new QName("http://service.hch.me", "Ws320ImplPort");
    static {
        URL url = Ws320ImplService.class.getResource("ws320.wsdl11.wsdl");
        if (url == null) {
            url = Ws320ImplService.class.getClassLoader().getResource("ws320.wsdl11.wsdl");
        } 
        if (url == null) {
            java.util.logging.Logger.getLogger(Ws320ImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "ws320.wsdl11.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public Ws320ImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Ws320ImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Ws320ImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns Ws320
     */
    @WebEndpoint(name = "Ws320ImplPort")
    public me.hch.service.Ws320 getWs320ImplPort() {
        return super.getPort(Ws320ImplPort, me.hch.service.Ws320.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Ws320
     */
    @WebEndpoint(name = "Ws320ImplPort")
    public me.hch.service.Ws320 getWs320ImplPort(WebServiceFeature... features) {
        return super.getPort(Ws320ImplPort, me.hch.service.Ws320.class, features);
    }

}
