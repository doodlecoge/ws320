package me.hch.service;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by hch on 2014/5/9.
 */

@Endpoint
public class Ws320Endpoint {
    private static final String NAME_SPACE = "http://service.hch.me";

    @PayloadRoot(
            localPart = "GetHospInfoRequest",
            namespace = NAME_SPACE
    )
    @ResponsePayload
    public Element handleGetHospInfoRequest(@RequestPayload Element xml) {
        Document document = DocumentHelper.createDocument();
        Element ele = document.addElement("GetHospInfoResponse", NAME_SPACE);
        ele.setText("GetHospInfoResponse");
        return ele;

    }


    @PayloadRoot(
            localPart = "GetRegInfoRequest",
            namespace = NAME_SPACE
    )
    @ResponsePayload
    public Element handleGetRegInfoRequest(@RequestPayload Element xml) {
        Document document = DocumentHelper.createDocument();
        Element ele = document.addElement("GetRegInfoResponse", NAME_SPACE);
        ele.setText("GetRegInfoResponse");
        return ele;

    }


    @PayloadRoot(
            localPart = "GetRegPoolRequest",
            namespace = NAME_SPACE
    )
    @ResponsePayload
    public Element handleGetRegPoolRequest(@RequestPayload Element xml) {
        Document document = DocumentHelper.createDocument();
        Element ele = document.addElement("GetRegPoolResponse", NAME_SPACE);
        ele.setText("GetRegPoolResponse");
        return ele;

    }


    @PayloadRoot(
            localPart = "NotifyHospInfoRequest",
            namespace = NAME_SPACE
    )
    @ResponsePayload
    public Element handleNotifyHospInfoRequest(@RequestPayload Element xml) {
        Document document = DocumentHelper.createDocument();
        Element ele = document.addElement("NotifyHospInfoResponse", NAME_SPACE);
        ele.setText("NotifyHospInfoResponse");
        return ele;
    }


    @PayloadRoot(
            localPart = "RegisterRequest",
            namespace = NAME_SPACE
    )
    @ResponsePayload
    public Element handleRegisterRequest(@RequestPayload Element xml) {
        Document document = DocumentHelper.createDocument();
        Element ele = document.addElement("RegisterResponse", NAME_SPACE);
        ele.setText("RegisterResponse");
        return ele;
    }

}
