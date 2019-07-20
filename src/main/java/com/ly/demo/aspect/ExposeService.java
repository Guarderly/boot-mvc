package com.ly.demo.aspect;

import com.ly.demo.aspect.annotation.ICutClass;
import com.ly.demo.aspect.annotation.ICutInterface;

@ICutClass
public class ExposeService implements Exposable{

	@Override
	//@ICutInterface
	public String execute(String input) {
		return "executed"+testPrivate("")+testPublic("");
	}
	
	//private方法不会被切面
	private String testPrivate(String in) {
		return "test private";
	}
	
	//public方法不会被切面while调用的是子类的方法时
	public String testPublic(String in) {
		return "test public";
	}
}
