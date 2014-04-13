package me.hch.service.client;

import me.hch.Ws320Exception;
import me.hch.util.Config;
import me.hch.util.FileUtils;
import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.rpc.client.RPCServiceClient;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;

import javax.xml.namespace.QName;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 14-4-13.
 */
public class DefaultHisClient implements HisClientIface {
    private static Config urlConfig = Config.getInstance("confidential/ws_loc.properties");


    public static void main(String[] args) {
        DefaultHisClient dhc = new DefaultHisClient();

        String absolutePath = new File("./").getAbsoluteFile().getAbsolutePath();
        System.out.println(absolutePath);
        FileUtils fu = FileUtils.getInstance("./ignore/");
        Set<String> hospitalIds = urlConfig.getKeys();
        for (String hospitalId : hospitalIds) {
            String result = null;

            try {
                result = dhc.getDepartInfo(hospitalId);
                fu.saveAs(hospitalId + ".getDepartInfo.xml", result);

                result = dhc.getDoctorInfo(hospitalId);
                fu.saveAs(hospitalId + ".getDoctorInfo.xml", result);

                result = dhc.getDepartWorkSchedule(hospitalId);
                fu.saveAs(hospitalId + ".getDepartWorkSchedule.xml", result);

                result = dhc.getDoctorWorkSchedule(hospitalId);
                fu.saveAs(hospitalId + ".getDoctorWorkSchedule.xml", result);
            } catch (Exception e) {
                System.out.println(hospitalId);
            }
        }
    }

    public String getDepartInfo(String hospitalId) {
        String url = urlConfig.getString(hospitalId);
        String xml = FileUtils.load("confidential/basic-info-req.xml");

        return getStringFromWs(url, "getDepartInfo", xml);
    }

    public String getDoctorInfo(String hospitalId) {
        String url = urlConfig.getString(hospitalId);
        String xml = FileUtils.load("confidential/basic-info-req.xml");
        xml = xml.replace("{HOSPITAL-ID}", hospitalId);

        return getStringFromWs(url, "getDoctorInfo", xml);
    }

    public String getDepartWorkSchedule(String hospitalId) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        Calendar cal = Calendar.getInstance();
        String beginTime = df.format(cal.getTime());

        cal.add(Calendar.DAY_OF_YEAR, 6);
        String endTime = df.format(cal.getTime());

        String xml = FileUtils.load("confidential/work-schedule-req.xml");

        xml = xml.replace("{HOSPITAL-ID}", hospitalId);
        xml = xml.replace("{BEGIN-TIME}", beginTime);
        xml = xml.replace("{END-TIME}", endTime);

        String url = urlConfig.getString(hospitalId);
        return getStringFromWs(url, "getDepartWorkInfo", xml);
    }

    public String getDoctorWorkSchedule(String hospitalId) {

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        Calendar cal = Calendar.getInstance();
        String beginTime = df.format(cal.getTime());

        cal.add(Calendar.DAY_OF_YEAR, 6);
        String endTime = df.format(cal.getTime());

        String xml = FileUtils.load("confidential/work-schedule-req.xml");

        xml = xml.replace("{HOSPITAL-ID}", hospitalId);
        xml = xml.replace("{BEGIN-TIME}", beginTime);
        xml = xml.replace("{END-TIME}", endTime);

        String url = urlConfig.getString(hospitalId);
        return getStringFromWs(url, "getDoctorWorkInfo", xml);
    }


    public static String getStringFromWs(String url, String operation, String xml) {
        try {
            RPCServiceClient serviceClient = new RPCServiceClient();
            Options options = serviceClient.getOptions();
            EndpointReference targetEPR = new EndpointReference(url);
            options.setTo(targetEPR);
            options.setManageSession(true);
            options.setProperty(HTTPConstants.REUSE_HTTP_CLIENT, true);
            options.setTimeOutInMilliSeconds(1000 * 60);

            String targetNamespace = getTargetNamespace(url);
            QName qname = new QName(targetNamespace, operation);

            String ret = (String) serviceClient.invokeBlocking(
                    qname,
                    new Object[]{xml},
                    new Class[]{String.class}
            )[0];
            serviceClient.cleanupTransport();
            return ret;
        } catch (IOException e) {
            throw new Ws320Exception(e);
        }
    }

    private static String getTargetNamespace(String wsdlUrl) throws IOException {
        HttpClient client = new HttpClient();
        HttpMethod get = new GetMethod(wsdlUrl);
        int status = client.executeMethod(get);
        if (status != HttpStatus.SC_OK) {
            throw new Ws320Exception("http response " + status);
        }
        byte[] responseBody = get.getResponseBody();
        get.releaseConnection();

        Pattern ptn = Pattern.compile("targetNamespace=\"(.*?)\"");
        Matcher matcher = ptn.matcher(new String(responseBody));
        if (matcher.find()) {
            return matcher.group(1);
        } else {
            return null;
        }
    }


    @Deprecated
    public static String getAsString(String url, String operation, String xml) throws IOException {
        Options options = new Options();
        EndpointReference targetEPR = new EndpointReference(url);
        options.setTo(targetEPR);
        // options.setAction("urn:getPrice");

        ServiceClient sender = new ServiceClient();
        sender.setOptions(options);

        OMFactory fac = OMAbstractFactory.getOMFactory();
        String tns = getTargetNamespace(url);
        OMNamespace omNs = fac.createOMNamespace(tns, "");

        OMElement method = fac.createOMElement(operation, omNs);
        OMElement arg0 = fac.createOMElement("aaa", null);
        arg0.setText(xml);
        method.addChild(arg0);
        method.build();

        OMElement result = sender.sendReceive(method);
        return result.toString();
    }
}
