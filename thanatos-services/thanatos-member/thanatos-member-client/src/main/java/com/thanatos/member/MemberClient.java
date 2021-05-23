package com.thanatos.member;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author boting.guo
 * @date 2021/5/11 16:51
 */

@FeignClient(name = "member-service", path = ContextPath.context_path)
public interface MemberClient {

	@RequestMapping("/service")
	String service();

}
