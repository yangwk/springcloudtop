package com.yangwk.springcloudtop.feigh.server;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class FeighServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeighServerApplication.class, args);
	}

}
