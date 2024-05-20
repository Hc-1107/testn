package com.huang.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Test {

    @Value("${rabbitmq.host}")
    private String host;

    public void setHost(String host) {
        this.host = host;
    }
}
