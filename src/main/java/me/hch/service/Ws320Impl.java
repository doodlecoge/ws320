package me.hch.service;

import com.sun.xml.ws.developer.SchemaValidation;
import me.hch.bean.*;
import me.hch.bean.Hospital;
import me.hch.job.CacheUpdatingJob;
import me.hch.model.MemoryCache;
import me.hch.util.TimeUtils;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Map;

/**
 * Created by hch on 2014/3/30.
 */
@SchemaValidation(handler = Ws320Validator.class, inbound = true, outbound = false)
@WebService(
        serviceName = "CalculatorServiceImpl",
        endpointInterface = "me.hch.service.Ws320",
        targetNamespace = "http://service.hch.me")
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
    public GetHospInfoRsp getHospInfo(GetHospInfoReq req) {
        String userName = req.getAuthInfo().getUserName();
        String password = req.getAuthInfo().getPassword();

        System.out.println(userName + ", " + password);
        // todo: authenticate code here


        long now = Calendar.getInstance().getTimeInMillis();
        long diff = now - CacheUpdatingJob.getInstance().lastUpdateTime;

        GetHospInfoRsp rsp = new GetHospInfoRsp();
        if (diff > TimeUtils.DayMs * 6) {
            Result result = new Result();
            result.setResultCode(BigInteger.valueOf(1));
            result.setResultMsg("cache not ready");
            rsp.setResult(result);
        } else {
            Map<String, Hospital> hospitals = MemoryCache.getInstance().getHospitals();
            rsp.getHospital().addAll(hospitals.values());
        }
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
