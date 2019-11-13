package com.yangwk.springcloudtop.zuul.controller;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	private static Logger LOG = LoggerFactory.getLogger(TestController.class);

	/**
	 * Hystrix fallback Support, simulate the timeout
	 */
	@RequestMapping("/timeout")
	public String timeout() throws InterruptedException {
		LOG.info("start sleep");
		Thread.sleep(120000);
		LOG.info("stop sleep");
		return "timeout " + UUID.randomUUID().toString();
	}

	@RequestMapping("/query")
	public String query() {
		return "query " + UUID.randomUUID().toString();
	}
	
	
}
