package com.thanatos.gateway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

/**
 * @author boting.guo
 * @date 2021/5/12 23:05
 */

@Configuration
@EnableWebFluxSecurity
public class JwtResourceServerConfig {

	@Bean
	public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
		http.oauth2ResourceServer().jwt().jwtAuthenticationConverter()
	}

}
