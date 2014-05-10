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
    public Element handleRequest(@RequestPayload Element xml) {
        Document document = DocumentHelper.createDocument();
        Element ele = document.addElement("GetHospInfoResponse", NAME_SPACE);
        ele.setText("0000000000000000");
        return ele;

    }
}
