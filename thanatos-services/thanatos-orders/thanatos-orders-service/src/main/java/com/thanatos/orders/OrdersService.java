package com.thanatos.orders;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @author boting.guo
 * @date 2021/5/10 14:33
 */

@Service
public class OrdersService {

	@SentinelResource(value = "sayHello", fallback = "sayHelloFail")
	public String sayHello() {
		return "Hello, Orders! ";
	}

	public String sayHelloFail() {
		return "I am sorry, Orders! ";
	}
}
