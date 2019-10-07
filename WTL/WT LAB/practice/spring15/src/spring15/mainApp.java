package spring15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach cricket = context.getBean("cricket",CricketCoach.class);
		BaseballCoach baseball = context.getBean("baseball",BaseballCoach.class);
		
		System.out.println(cricket.getDailyWorkout());
		System.out.println(baseball.getFortune());
		

	}

}
