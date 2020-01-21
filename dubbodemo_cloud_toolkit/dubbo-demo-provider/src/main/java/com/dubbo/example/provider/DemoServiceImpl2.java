package com.dubbo.example.provider;

import com.dubbo.example.DemoService;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service(version = "1.0.1")
public class DemoServiceImpl2 implements DemoService {
    private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl2.class);

    @Override
    public String sayHello(String name) {
        logger.info("=======================DemoServiceImpl2=======================");
        logger.info("Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
    }

}
