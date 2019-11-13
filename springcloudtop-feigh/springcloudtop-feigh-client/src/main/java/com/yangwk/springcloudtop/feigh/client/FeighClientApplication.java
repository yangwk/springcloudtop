package com.yangwk.springcloudtop.feigh.client;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class FeighClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeighClientApplication.class, args);
	}

}
