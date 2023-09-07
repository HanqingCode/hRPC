package com.phq;

import com.phq.proxy.ProxyFactory;

public class Consumer {

    public static void main(String[] args) {

        //消费者consumer 远程调用 供应者provider的接口helloService.sayHello()
        //The consumer remotely invokes the interface of the provider helloService.sayHello()
        HelloService helloService = ProxyFactory.getProxy(HelloService.class);

        //在这里写下你想传入的参数内容
        //Write down the parameters you want to pass in here
        String result = helloService.sayHello("Write down the parameters you want to pass in here");
        System.out.println("remotely invokes helloService.sayHello() : ");
        System.out.println(result);

    }
}
