package com.yangwk.springcloudtop.feigh.client.microservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("springcloudtop-feigh-server")
public interface FeignServer {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	String hello(@RequestParam("name") String name);

}
