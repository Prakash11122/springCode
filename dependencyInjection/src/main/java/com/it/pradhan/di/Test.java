package com.it.pradhan.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext contect = new ClassPathXmlApplicationContext("beans.xml");
		Ceo bean = contect.getBean("ceo", Ceo.class);
		bean.getCeoInfo();
		
		Ceo bean2 = contect.getBean("manager",Ceo.class);
		bean2.getCeoInfo();
		
		
 


	}

}
