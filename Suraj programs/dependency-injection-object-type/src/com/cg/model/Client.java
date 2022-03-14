package com.cg.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println("beans.xml is loaded");
		
		Student student = context.getBean("stu",Student.class);
		student.cheating();
	}

}
