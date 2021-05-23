package com.thanatos.product;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author boting.guo
 * @date 2021/5/11 16:51
 */

@FeignClient(name = "product-service", path = ContextPath.context_path)
public interface ProductClient {

	@RequestMapping("/service")
	String service();

}
