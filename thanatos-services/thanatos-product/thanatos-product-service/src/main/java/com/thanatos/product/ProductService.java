package com.thanatos.product;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @author boting.guo
 * @date 2021/5/10 14:52
 */

@Service
public class ProductService {

	@SentinelResource(value = "sayHello", fallback = "sayHelloFail")
	public String sayHello() {
		return "Hello, Product! ";
	}

	public String sayHelloFail() {
		return "I am sorry, Product! ";
	}
}
