package kosta1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext factory = new GenericXmlApplicationContext("applicationContext2.xml");
	 Action action = (Action)factory.getBean("Action");
	 action.writeAction1();
	    

	}

}
