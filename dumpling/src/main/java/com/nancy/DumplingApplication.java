package com.nancy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DumplingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DumplingApplication.class, args);
	}
}
