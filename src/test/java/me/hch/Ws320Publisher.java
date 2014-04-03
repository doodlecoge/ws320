package me.hch;

import me.hch.service_impl.Ws320Impl;

import javax.xml.ws.Endpoint;

/**
 * Created by huaiwang on 14-4-2.
 */
public class Ws320Publisher {
    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:8088/aaa", new Ws320Impl());
    }
}
