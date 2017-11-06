package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
//@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class Demo2ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo2ApiGatewayApplication.class, args);
	}
}
