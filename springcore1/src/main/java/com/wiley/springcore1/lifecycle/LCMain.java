package com.wiley.springcore1.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LCMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/springcore1/lifecycle/configlifecycle.xml");
		Pizza pz1 =  (Pizza) context.getBean("pizza1");
		System.out.println(pz1);
		context.registerShutdownHook();
	}
}