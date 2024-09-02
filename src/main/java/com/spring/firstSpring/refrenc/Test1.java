package com.spring.firstSpring.refrenc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("helloooo");
	
	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/firstSpring/refrenc/refConfig.xml");
	A temp=(A) context.getBean("aref");
	
	System.out.println(temp.getX());
	System.out.println(temp.getObj().getY());
	
	System.out.println(temp);
	}		
}
