package com.thanatos.member;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @author boting.guo
 * @date 2021/5/10 13:53
 */

@Service
public class MemberService {

	@SentinelResource(value = "sayHello", fallback = "sayHelloFail")
	public String sayHello() {
		return "Hello, Member! ";
	}

	public String sayHelloFail() {
		return "I am sorry, Member! ";
	}


}
