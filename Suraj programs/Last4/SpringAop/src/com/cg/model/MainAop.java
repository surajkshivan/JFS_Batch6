package com.cg.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.model.services.ShapeService;

public class MainAop {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");
		ShapeService shapeservice = ctx.getBean("ShapeService",ShapeService.class);
		System.out.println(shapeservice.getCircle().getName());
		System.out.println(shapeservice.getTriangle().getName());
		
	}

}
