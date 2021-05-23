package com.thanatos.member;

import com.thanatos.orders.OrdersClient;
import com.thanatos.product.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author boting.guo
 * @date 2021/5/10 13:48
 */

@RestController
@RequestMapping
public class HelloController {

	@Autowired
	private MemberService memberService;

	@Autowired
	private ProductClient productClient;

	@Autowired
	private OrdersClient ordersClient;

	@RequestMapping("/hello")
	public String hello() {
		String product = productClient.service();
		String orders = ordersClient.service();
		return memberService.sayHello() + product + orders;
	}

	@RequestMapping("/service")
	public String service() {
		return memberService.sayHello();
	}

//	@GetMapping(value = "/info/jwt")
//	@PreAuthorize("hasAnyRole('ROLE_ADMIN')")
//	public Object jwtParser(Authentication authentication) {
//		authentication.getCredentials();
//		OAuth2AuthenticationDetails details = (OAuth2AuthenticationDetails) authentication.getDetails();
//		String jwtToken = details.getTokenValue();
//		Claims claims = Jwts.parser()
//				.setSigningKey("sign-8888".getBytes(StandardCharsets.UTF_8))
//				.parseClaimsJws(jwtToken)
//				.getBody();
//		return claims;
//	}

}
