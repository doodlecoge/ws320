package me.hch;

import me.hch.service.GetHospInfoReq;
import me.hch.service.GetHospInfoRsp;
import me.hch.service.Ws320;
import me.hch.service.Ws320ImplService;
import me.hch.service_impl.Ws320Impl;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by huaiwang on 14-4-2.
 */
public class Ws320Client {
    public static void main(String[] args) throws MalformedURLException {
        /*
        use this url if deployed in tomcat,
        otherwise use the next commented out url
        if published in Ws320Publisher class.
        */
        String wsdlLoc = "http://localhost:8080/ws320?wsdl";
        // String wsdlLoc = "http://127.0.0.1:8088/aaa?wsdl";

        String ns = "http://service.hch.me/";
        String serviceName = "CalculatorServiceImpl";

        // do not use no arguments constructor
        // pass wsdl location, namespace and service name manully
        Ws320ImplService s = new Ws320ImplService(
                new URL(wsdlLoc), new QName(ns, serviceName)
        );

        GetHospInfoReq req = new GetHospInfoReq();

        Ws320 p = s.getWs320ImplPort();
        GetHospInfoRsp hospInfo = p.getHospInfo(req);


        System.out.println(hospInfo.getHospital().get(0).getHospName());
    }
}
