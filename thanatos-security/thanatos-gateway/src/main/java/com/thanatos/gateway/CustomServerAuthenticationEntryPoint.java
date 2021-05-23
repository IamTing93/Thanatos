package com.thanatos.gateway;

import net.minidev.json.JSONUtil;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.server.ServerAuthenticationEntryPoint;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.nio.charset.Charset;

/**
 * @author boting.guo
 * @date 2021/5/23 1:20
 */

@Component
public class CustomServerAuthenticationEntryPoint implements ServerAuthenticationEntryPoint {

	@Override
	public Mono<Void> commence(ServerWebExchange exchange, AuthenticationException e) {
		ServerHttpResponse response = exchange.getResponse();
		response.setStatusCode(HttpStatus.OK);
		response.getHeaders().set(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
		response.getHeaders().set("Access-Control-Allow-Origin", "*");
		response.getHeaders().set("Cache-Control", "no-cache");
		String body = JSONUtil.toJsonStr(Result.custom(ResultCodeEnum.USER_ACCOUNT_UNAUTHENTICATED));
		DataBuffer buffer = response.bufferFactory().wrap(body.getBytes(Charset.forName("UTF-8")));
		return response.writeWith(Mono.just(buffer));
	}

}