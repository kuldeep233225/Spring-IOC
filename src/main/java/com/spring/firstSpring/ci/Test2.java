package com.spring.firstSpring.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/firstSpring/ci/ciconfig.xml");
		Parson pom = (Parson) context.getBean("parsonDetail");
		System.out.println(pom);
				
	}

}
