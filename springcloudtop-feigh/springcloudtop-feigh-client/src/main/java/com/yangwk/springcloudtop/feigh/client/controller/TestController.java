package com.yangwk.springcloudtop.feigh.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yangwk.springcloudtop.feigh.client.microservice.FeignServer;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private FeignServer feignServer;

	@GetMapping("/hello")
	public String hello(@RequestParam("name") String name) {
		return feignServer.hello(name);
	}
}
