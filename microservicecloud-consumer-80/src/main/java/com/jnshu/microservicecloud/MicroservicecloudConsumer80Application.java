package com.jnshu.microservicecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicecloudConsumer80Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudConsumer80Application.class, args);
	}

}
