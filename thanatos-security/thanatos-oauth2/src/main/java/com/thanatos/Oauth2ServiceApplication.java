package com.thanatos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author boting.guo
 * @date 2021/5/11 13:19
 */

@EnableDiscoveryClient
@SpringBootApplication
public class Oauth2ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2ServiceApplication.class, args);
	}
}
