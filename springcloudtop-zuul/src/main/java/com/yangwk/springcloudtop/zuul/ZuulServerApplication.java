package com.yangwk.springcloudtop.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringCloudApplication
@EnableZuulProxy
public class ZuulServerApplication {

	public static void main(String[] args) {
		new SpringApplication(ZuulServerApplication.class).run(args);
	}

}