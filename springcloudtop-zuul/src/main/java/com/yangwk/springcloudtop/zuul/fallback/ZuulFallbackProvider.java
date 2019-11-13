package com.yangwk.springcloudtop.zuul.fallback;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

@Component
public class ZuulFallbackProvider implements FallbackProvider {

	@Override
	public String getRoute() {
		return "springcloudtop-zuul";
	}

	@Override
	public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
		return new SuccessClientHttpResponse("fallback");
	}

}
