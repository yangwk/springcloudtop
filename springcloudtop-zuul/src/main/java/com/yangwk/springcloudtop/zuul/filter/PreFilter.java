package com.yangwk.springcloudtop.zuul.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class PreFilter extends ZuulFilter {
	private static Logger LOG = LoggerFactory.getLogger(PreFilter.class);

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
		LOG.info("RequestURI {}", ctx.getRequest().getRequestURI() );
		return null;
	}
	
}
