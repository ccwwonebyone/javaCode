package com.dayi.basesrv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BasesrvApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasesrvApplication.class, args);
    }
}
