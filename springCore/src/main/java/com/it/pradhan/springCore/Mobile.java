package com.it.pradhan.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		  ApplicationContext context = new  ClassPathXmlApplicationContext("beans.xml");
		  System.out.println("it's working");
		  
		  
		  Sim bean = context.getBean("sim",Sim.class);
		   bean.calling();
		   bean.data();

	}

}
