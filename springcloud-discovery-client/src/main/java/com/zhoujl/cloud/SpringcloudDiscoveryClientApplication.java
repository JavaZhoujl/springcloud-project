package com.zhoujl.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudDiscoveryClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudDiscoveryClientApplication.class, args);
	}

}
