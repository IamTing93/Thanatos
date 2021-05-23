package com.thanatos.oauth2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

/**
 * @author boting.guo
 * @date 2021/5/11 13:43
 */

@Configuration
public class JwtTokenConfig {

	@Bean
	public TokenStore jwtTokenStore() {
		return new JwtTokenStore(jwtAccessTokenCOnverter());
	}

	@Bean
	public JwtAccessTokenConverter jwtAccessTokenCOnverter() {
		JwtAccessTokenConverter accessTokenConverter = new JwtAccessTokenConverter();
		accessTokenConverter.setSigningKey("sign-8888");
		return accessTokenConverter;
	}
}
