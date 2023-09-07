package com.phq;

import com.phq.common.URL;
import com.phq.protocol.HttpServer;
import com.phq.register.LocalRegister;
import com.phq.register.MapRemoteRegister;

public class Provider {

    public static void main(String[] args) {

        LocalRegister.regist(HelloService.class.getName(), "1.0", HelloServiceImpl.class);

        // 注册中心注册 服务注册
        URL url = new URL("localhost", 8080);
        MapRemoteRegister.regist(HelloService.class.getName(), url);


        // Netty、Tomcat
        HttpServer httpServer = new HttpServer();
        httpServer.start(url.getHostname(), url.getPort());
    }
}
