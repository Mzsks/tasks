package sk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sk.actions.loginaction;


public class app {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		loginaction log=(loginaction)ctx.getBean("loginaction");
		log.userdelect();
		//loginaction la=new loginaction();
		//la.userdelect();

	}

}
