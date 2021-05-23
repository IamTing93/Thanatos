package com.thanatos.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author boting.guo
 * @date 2021/5/10 14:48
 */

@RestController
@RequestMapping
public class HelloController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/service")
	public String service() {
		return productService.sayHello();
	}
}
