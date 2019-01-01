package com.dayi.baseclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BaseclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseclientApplication.class, args);
    }

}