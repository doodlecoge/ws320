package me.hch.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.0-milestone2
 * 2014-03-30T22:32:32.804+08:00
 * Generated source version: 3.0.0-milestone2
 * 
 */
@WebService(targetNamespace = "http://service.hch.me/", name = "HelloService")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloService {

    @WebResult(name = "return", targetNamespace = "")
    @Action(input = "http://service.hch.me/HelloService/helloRequest", output = "http://service.hch.me/HelloService/helloResponse")
    @RequestWrapper(localName = "hello", targetNamespace = "http://service.hch.me/", className = "me.hch.service.Hello")
    @WebMethod
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://service.hch.me/", className = "me.hch.service.HelloResponse")
    public String hello(
            @WebParam(name = "arg0", targetNamespace = "")
            String arg0
    );
}
