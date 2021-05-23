package com.thanatos.orders;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author boting.guo
 * @date 2021/5/11 16:51
 */

@FeignClient(name = "orders-service", path = ContextPath.context_path)
public interface OrdersClient {

	@RequestMapping("/service")
	String service();

}
