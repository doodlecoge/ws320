package me.hch.service.client;

import me.hch.Ws320RuntimeException;
import me.hch.util.Config;
import me.hch.util.FileUtils;
import org.codehaus.xfire.client.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;

/**
 * Created by Administrator on 14-8-22.
 */
public class XFireClient implements HisClientIface {
    private static final Logger log = LoggerFactory.getLogger(XFireClient.class);
    private static final Config WsdlConfig = Config.getInstance("/confidential/ws_loc.properties");

    public static void main(String[] args) {
        String wzyy = new XFireClient().getDepartInfo("WZYY");
        System.out.println(wzyy);
    }

    @Override
    public String getDepartInfo(String hospitalId) {
        Client c = null;
        try {
            c = new Client(new URL(WsdlConfig.getString(hospitalId)));

            String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
                    "<Message>"+
                    "<RequestInfo>"+
                    "<HospitalID>SZET</HospitalID>"+
                    "</RequestInfo>"+
                    "</Message>";


            String reqxml = FileUtils.load("/ds/info-req.xml");
            String payload = reqxml.replace("{hospital-id}", hospitalId);
            payload = payload.replaceAll(">\\s+<", "><");

            System.out.println(payload);

            log.debug("request payload1: " + payload);
            log.debug("request payload2: " + xml);


            Object[] obj = new Object[1];
            obj[0] = payload;


            Object[] results = c.invoke("getDepartInfo", obj);
            String responseStr = (String) results[0];

            return responseStr;
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
}
