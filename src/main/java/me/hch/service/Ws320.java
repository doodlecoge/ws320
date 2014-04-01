package me.hch.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;

/**
 * This class was generated by Apache CXF 3.0.0-milestone2
 * 2014-03-30T23:17:34.382+08:00
 * Generated source version: 3.0.0-milestone2
 * 
 */
@WebService(targetNamespace = "http://service.hch.me/", name = "Ws320")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Ws320 {

    @WebResult(name = "GetHospInfoRsp", targetNamespace = "http://service.hch.me/", partName = "parameters")
    @Action(input = "http://service.hch.me/Ws320/GetHospInfoRequest", output = "http://service.hch.me/Ws320/GetHospInfoResponse")
    @WebMethod(operationName = "GetHospInfo")
    public GetHospInfoRsp getHospInfo(
            @WebParam(partName = "parameters", name = "GetHospInfoReq", targetNamespace = "http://service.hch.me/")
            GetHospInfoReq parameters
    );

    @WebResult(name = "GetRegInfoRsp", targetNamespace = "http://service.hch.me/", partName = "parameters")
    @Action(input = "http://service.hch.me/Ws320/GetRegInfoReq", output = "http://service.hch.me/Ws320/GetRegInfoRsp")
    @WebMethod(operationName = "GetRegInfo")
    public GetRegInfoRsp getRegInfo(
            @WebParam(partName = "parameters", name = "GetRegInfoReq", targetNamespace = "http://service.hch.me/")
            GetRegInfoReq parameters
    );

    @WebResult(name = "GetRegPoolRsp", targetNamespace = "http://service.hch.me/", partName = "parameters")
    @Action(input = "http://service.hch.me/Ws320/GetRegPoolReq", output = "http://service.hch.me/Ws320/GetRegPoolRsp")
    @WebMethod(operationName = "GetRegPool")
    public GetRegPoolRsp getRegPool(
            @WebParam(partName = "parameters", name = "GetRegPoolReq", targetNamespace = "http://service.hch.me/")
            GetRegPoolReq parameters
    );
}
