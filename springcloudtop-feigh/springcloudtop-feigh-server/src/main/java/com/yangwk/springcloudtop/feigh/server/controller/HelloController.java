package com.yangwk.springcloudtop.feigh.server.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String hello(@RequestParam("name") String name) {
		return "springcloudtop-feigh-server response : hello " + UUID.randomUUID().toString();
	}
}
