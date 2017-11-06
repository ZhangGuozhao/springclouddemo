package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Demo2CommonService1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2CommonService1Application.class, args);
	}
}
