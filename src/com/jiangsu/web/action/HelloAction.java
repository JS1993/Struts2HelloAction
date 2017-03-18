package com.jiangsu.web.action;

/**
 * 入门案例
 * @author jiangsu
 * 动作类
 */
public class HelloAction {  
	
	/**
	 * 在动作类中，执行的动作方法
	 * @return
	 */
	public String sayHello() {
		System.out.println("hello方法执行了");
		return "success";
	}
	
	
}
