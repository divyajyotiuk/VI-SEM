package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			
		Student student = context.getBean(Student.class);
		
		student.setName("Divya");
		System.out.println(student.getName());
		System.out.println(student.getCityName());
	}

}
