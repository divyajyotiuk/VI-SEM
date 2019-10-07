package spring1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//configure spring container
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Resource res = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(res);
        
        Student student1 = (Student)factory.getBean("student1",Student.class);
        Student student3 = (Student)factory.getBean("student1",Student.class);
        
		/*
		 * Student student2 = (Student)factory.getBean("student2",Student.class);
		 * Student student4 = (Student)factory.getBean("student2",Student.class);
		 */
		/*
		 * Student student1 = context.getBean("student1" , Student.class); 
		 * Student student3 = context.getBean("student1" , Student.class); 
		 * Student student2 = context.getBean("student2" , Student.class); 
		 * Student student4 = context.getBean("student2" , Student.class);
		 */
		if(student1==student3) {
			System.out.println(student1);
			System.out.println("Scope is singleton");
		}
		
		/*
		 * if(student2!=student4) { System.out.println(student2);
		 * System.out.println("Scope is prototype"); }
		 */
	}

}
