package me.hch.service_impl;

import me.hch.service.*;
import me.hch.service.Hospital;

import javax.jws.WebService;

/**
 * Created by hch on 2014/3/30.
 */
@WebService(
        serviceName = "CalculatorServiceImpl",
        endpointInterface = "me.hch.service.Ws320",
        targetNamespace = "http://service.hch.me/")
public class Ws320Impl implements Ws320 {
    @Override
    public GetHospInfoRsp getHospInfo(GetHospInfoReq parameters) {
        Hospital hospital = new Hospital();
        hospital.setHospName("SDFY");

        GetHospInfoRsp rsp = new GetHospInfoRsp();
        rsp.getHospital().add(hospital);
        return rsp;
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
