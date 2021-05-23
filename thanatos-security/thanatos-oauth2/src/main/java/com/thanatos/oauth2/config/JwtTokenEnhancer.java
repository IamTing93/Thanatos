package com.thanatos.oauth2.config;

import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author boting.guo
 * @date 2021/5/11 13:47
 */

@Component
public class JwtTokenEnhancer implements TokenEnhancer {

	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken oAuth2AccessToken, OAuth2Authentication oAuth2Authentication) {
		Map<String, Object> info = new HashMap<>();
		info.put("jwt-ext", "JWT 扩展信息");
		((DefaultOAuth2AccessToken) oAuth2AccessToken).setAdditionalInformation(info);
		return oAuth2AccessToken;
	}
}
