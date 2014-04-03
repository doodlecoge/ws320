package me.hch.service_impl;

import me.hch.service.*;
import me.hch.service.Hospital;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

/**
 * Created by hch on 2014/3/30.
 */
@WebService(
        serviceName = "CalculatorServiceImpl",
        endpointInterface = "me.hch.service.Ws320",
        targetNamespace = "http://service.hch.me/")
public class Ws320Impl implements Ws320 {
    @Resource
    private WebServiceContext wsctx;

    /**
     * This method get HttpServletRequest associated with
     * current context. The web service should be deployed
     * in Tomcat or similar web container, otherwise, you
     * will get null object.
     *
     * @return null if not deployed in web container, else
     * return HttpServletRequest instance.
     */
    private HttpServletRequest getServletRequest() {
        MessageContext msgctx = wsctx.getMessageContext();
        return (HttpServletRequest) msgctx.get(MessageContext.SERVLET_REQUEST);
    }

    @Override
    public GetHospInfoRsp getHospInfo(GetHospInfoReq parameters) {
        Hospital hospital = new Hospital();
        hospital.setHospName("SDFY");

        GetHospInfoRsp rsp = new GetHospInfoRsp();
        rsp.getHospital().add(hospital);
        return rsp;
    }

    @Override
    public RegisterRsp register(RegisterReq parameters) {
        return null;
    }

    @Override
    public NotifyHospInfoRsp notifyHospInfo(NotifyHospInfoReq parameters) {
        return null;
    }

    @Override
    public GetRegInfoRsp getRegInfo(GetRegInfoReq parameters) {
        return null;
    }

    @Override
    public GetRegPoolRsp getRegPool(GetRegPoolReq parameters) {
        return null;
    }
}
