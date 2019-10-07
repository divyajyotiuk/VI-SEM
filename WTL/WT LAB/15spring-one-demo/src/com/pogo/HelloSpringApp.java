package com.pogo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Coach theCoach = context.getBean("myCoachb", Coach.class);
//		Coach trackCoach = context.getBean("myCoach", Coach.class);
		CricketCoach cricketCoach = (CricketCoach) context.getBean("cricketCoach", Coach.class);
		
//		System.out.println(theCoach.getDailyWorkout());
//		
//		System.out.println(theCoach.getDailyFortune());
//	
//		System.out.println(trackCoach.getDailyWorkout());
//		
//		System.out.println(trackCoach.getDailyFortune());
//	
		System.out.println(cricketCoach.getDailyWorkout());
		
		System.out.println(cricketCoach.getDailyFortune());
		
		System.out.println(cricketCoach.getEmail());
		
		System.out.println(cricketCoach.getTeam());
		context.close();
	}

}
