package com.example.msaapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsaApiGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(MsaApiGatewayApplication.class, args);
    }

}
