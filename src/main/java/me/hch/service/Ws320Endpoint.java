package me.hch.service;

import me.hch.model.MemoryCache;
import me.hch.model.NODE;
import me.hch.model.ScheduleCache;
import me.hch.mvc.model.HospitalEntity;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.Map;

/**
 * Created by hch on 2014/5/9.
 */

@Endpoint
public class Ws320Endpoint {
    private static final String NS = "http://service.hch.me";
    private static final MemoryCache cache = MemoryCache.getInstance();

    @PayloadRoot(
            localPart = "GetHospInfoRequest",
            namespace = NS
    )
    @ResponsePayload
    public Element handleGetHospInfoRequest(@RequestPayload Element xml) {
        String hospitalName = getHospitalName(xml);
        Document document = DocumentHelper.createDocument();
        Element resp = document.addElement(NODE.GET_HOSPITAL_RESPONSE, NS);

        if (hospitalName == null) {
            Map<String, HospitalEntity> hospitals = cache.getHospitals();
            for (HospitalEntity hospital : hospitals.values()) {
                addHospital(resp, hospital);
            }
        } else {
            HospitalEntity hospital = cache.getHospitalByName(hospitalName);
            addHospital(resp, hospital);
        }
        return resp;
    }

    private String getHospitalName(Element req) {
        Element elFilter = req.element(NODE.FILTER);
        Element elHospName = elFilter.element(NODE.HOSPITAL_NAME);
        if (null == elHospName || "".equals(elHospName.getText())) {
            return null;
        } else {
            return elHospName.getText();
        }
    }

    private void addHospital(Element resp, HospitalEntity hospital) {
        ScheduleCache schedules = cache.getSchedules(hospital.getId());

        if (schedules == null) return;

        Element elHospital = resp.addElement(NODE.HOSPITAL);
        elHospital.addAttribute(NODE.ATTR_NAME, hospital.getName());
        Element elBasic = elHospital.addElement(NODE.BASIC, NS);
        Element elPhone = elBasic.addElement(NODE.PHONE, NS);
        elPhone.setText(hospital.getPhone());
        // todo: add hospital basic info

        elHospital.add(schedules.getData().getRootElement());
    }


    @PayloadRoot(
            localPart = "GetRegInfoRequest",
            namespace = NS
    )
    @ResponsePayload
    public Element handleGetRegInfoRequest(@RequestPayload Element xml) {
        Document document = DocumentHelper.createDocument();
        Element ele = document.addElement("GetRegInfoResponse", NS);
        ele.setText("GetRegInfoResponse");
        return ele;

    }


    @PayloadRoot(
            localPart = "GetRegPoolRequest",
            namespace = NS
    )
    @ResponsePayload
    public Element handleGetRegPoolRequest(@RequestPayload Element xml) {
        Document document = DocumentHelper.createDocument();
        Element ele = document.addElement("GetRegPoolResponse", NS);
        ele.setText("GetRegPoolResponse");
        return ele;

    }


    @PayloadRoot(
            localPart = "NotifyHospInfoRequest",
            namespace = NS
    )
    @ResponsePayload
    public Element handleNotifyHospInfoRequest(@RequestPayload Element xml) {
        Document document = DocumentHelper.createDocument();
        Element ele = document.addElement("NotifyHospInfoResponse", NS);
        ele.setText("NotifyHospInfoResponse");
        return ele;
    }


    @PayloadRoot(
            localPart = "RegisterRequest",
            namespace = NS
    )
    @ResponsePayload
    public Element handleRegisterRequest(@RequestPayload Element xml) {
        Document document = DocumentHelper.createDocument();
        Element ele = document.addElement("RegisterResponse", NS);
        ele.setText("RegisterResponse");
        return ele;
    }

}
