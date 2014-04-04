package me.hch;

import javax.xml.namespace.QName;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-4-4
 * Time: 下午6:47
 * To change this template use File | Settings | File Templates.
 */



public class CommonWsClient {

    private RPCServiceClient serviceClient;
    private Options options;
    private EndpointReference targetEPR;

    public CommonWsClient(String endpoint) throws AxisFault {
        serviceClient = new RPCServiceClient();
        options = serviceClient.getOptions();
        targetEPR = new EndpointReference(endpoint);
        options.setTo(targetEPR);
    }

    public Object[] invokeOp(String targetNamespace, String opName,
                             Object[] opArgs, Class<?>[] opReturnType) throws AxisFault,
            ClassNotFoundException {
        // 设定操作的名称
        QName opQName = new QName(targetNamespace, opName);
        // 设定返回值

        //Class<?>[] opReturn = new Class[] { opReturnType };

        // 操作需要传入的参数已经在参数中给定，这里直接传入方法中调用
        return serviceClient.invokeBlocking(opQName, opArgs, opReturnType);
    }

    /**
     * @param args
     * @throws AxisFault
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws AxisFault, ClassNotFoundException {
        // TODO Auto-generated method stub

        final String endPointReference = "http://localhost:8080/axis2/services/WS4SZ";
        final String targetNamespace = "targ......";


        CommonWsClient client = new CommonWsClient(endPointReference);

        String opName = "getDepartWorkInfo";
        Object[] opArgs = new Object[]{""};
        Class<?>[] opReturnType = new Class[]{String[].class};

        Object[] response = client.invokeOp(targetNamespace, opName, opArgs, opReturnType);
        System.out.println(((String[]) response[0])[0]);

    }

}