package me.hch.service.client;

import me.hch.Ws320RuntimeException;
import me.hch.service.HttpEngine;
import me.hch.util.Config;
import me.hch.util.FileUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by hch on 2014/6/27.
 */
public class HttpWsClient implements HisClientIface {
    private static final Logger log = LoggerFactory.getLogger(HttpWsClient.class);
    private static final String Envelope = FileUtils.load("/ds/envelope.xml");
    private static final String InfoReq = FileUtils.load("/ds/info-req.xml");
    private static final String Ns = "http://ws.apache.org/axis2";
    private static final HttpEngine Eng = new HttpEngine();
    private static final Config WsdlConfig = Config.getInstance("/confidential/ws_loc.properties");


    public static void main(String[] args) throws DocumentException {
        HttpWsClient client = new HttpWsClient();

        Set<String> keys = WsdlConfig.getKeys();
        for (String key : keys) {
            key = "WZYY";
            try {
                System.out.println(key + "=" + WsdlConfig.getString(key));
                String departInfo = client.getDepartInfo(key);
                System.out.println(departInfo);
            } catch (Exception e) {
                e.printStackTrace();
            }
            break;
        }


    }

    @Override
    public String getDepartInfo(String hospitalId) {
        String wsdl = WsdlConfig.getString(hospitalId);

        try {
        String ns = getNs(wsdl);

        String reqxml = FileUtils.load("/ds/info-req.xml");
        String payload = reqxml.replace("{hospital-id}", hospitalId);
        String envelope = buildEnvelope("getDepartInfo", payload, ns);
            Eng.post(wsdl, envelope);
            String resp = Eng.getResponse();

            log.debug("server response: " + resp);

            return extractResponse(resp, "Body/getDepartInfoResponse/return");
        } catch (Exception e) {
            throw new Ws320RuntimeException(e);
        }
    }

    @Override
    public String getDoctorInfo(String hospitalId) {
        return null;
    }

    @Override
    public String getDepartWorkSchedule(String hospitalId) {
        return null;
    }

    @Override
    public String getDoctorWorkSchedule(String hospitalId) {
        return null;
    }


    private String buildEnvelope(String method, String payload, String ns) {
        if(ns == null) ns = Ns;
        try {
            Document document = DocumentHelper.parseText(Envelope);
            Element rootElement = document.getRootElement();
            Element envelope = rootElement.element("Body");
            Element el = envelope.addElement(method, ns);
            Element arg0 = el.addElement("Xml", ns);
            arg0.addText(payload);
            return document.asXML();
        } catch (DocumentException e) {
            throw new Ws320RuntimeException(e);
        }
    }

    private String getNs(String wsdl) throws Exception {
        Eng.get(wsdl);
        String xml = Eng.getResponse();
        Pattern ptn = Pattern.compile("targetNamespace=\"([^\"]+)\"");
        Matcher matcher = ptn.matcher(xml);
        if(matcher.find()) {
            log.debug("targetNamespace: " + matcher.group(1));
            return matcher.group(1);
        } else {
            return null;
        }
    }

    private String extractResponse(String resp, String path)
            throws DocumentException {
        String[] split = path.split("/");
        Document document = DocumentHelper.parseText(resp);
        Element rootElement = document.getRootElement();

        Element el = rootElement;
        for (String p : split) {
            el = el.element(p);
        }

        return el.getText();
    }

}
