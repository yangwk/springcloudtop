package com.yangwk.springcloudtop.zuul.fallback;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;

public final class  SuccessClientHttpResponse implements ClientHttpResponse {
	private String body;
	
	public SuccessClientHttpResponse(String body) {
		this.body = body;
	}
	
    @Override
    public HttpStatus getStatusCode() throws IOException {
    	return HttpStatus.valueOf(getRawStatusCode());
    }

    @Override
    public int getRawStatusCode() throws IOException {
        return 200;
    }

    @Override
    public String getStatusText() throws IOException {
        return getStatusCode().getReasonPhrase();
    }

    @Override
    public void close() {
    	
    }

    @Override
    public InputStream getBody() throws IOException {
        return new ByteArrayInputStream(body.getBytes());
    }

    @Override
    public HttpHeaders getHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }
}