package com.ly.demo.aspect;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExposeAspectTest extends ExposeService implements IAspectTest{

	@Override
	@RequestMapping("/testAspect")
	public String testAspect(String input) {
		System.out.println("test");
		this.testPublic("");//
		return this.execute(input);
	}
	

	// 1.通过testAspect被调用时，不会触发切面
	// 2.直接被调用时会触发切面
	@RequestMapping("/testPublic")
	public String testPublic(String in) {
		return "test public";
	}

}
