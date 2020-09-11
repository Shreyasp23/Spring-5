package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = (Coach)context.getBean("myCoach");
		System.out.println(theCoach.getFortune());
		
		
		
		
		Coach secCoach = context.getBean("myTrackCoach",Coach.class);
		System.out.println(secCoach.getFortune());
		context.close();
	}

}
