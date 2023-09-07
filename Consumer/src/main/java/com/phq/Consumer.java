package com.phq;

import com.phq.proxy.ProxyFactory;

public class Consumer {

    public static void main(String[] args) {

        HelloService helloService = ProxyFactory.getProxy(HelloService.class);
        String result = helloService.sayHello("hanqing123123。。。。。。123");
        System.out.println(result);

    }
}
