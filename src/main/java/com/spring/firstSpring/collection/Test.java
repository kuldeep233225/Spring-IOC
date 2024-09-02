package com.spring.firstSpring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/firstSpring/collection/cofigration.xml");
	Employ emp1=(Employ) context.getBean("emp1");
	System.out.println(emp1.getName());
	System.out.println(emp1.getPhone());
	System.out.println(emp1.getAddress());
	System.out.println(emp1.getCourse());
	
}
}
