package com.learning.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCApp1 {
	public static void main(String[] args) {
		// create the application context (container)
		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		// create the bean
		Organization org = (Organization) ctx.getBean("myorg");
		
		// invoke the company slogan via the bean 
		org.corporateSlogan();

		// close the application context (container)
		((FileSystemXmlApplicationContext) ctx).close();
		
		/*
		 * Notes: 
		 * A spring IoC container is a component of the spring framework that contains the 
		 * beans and manages their complete life-cycle. 
		 * 
		 * ApplicationContext interface represents the Spring IoC container and is responsible for
		 * instantiating, configuring and assembling the beans. The container gets its instructions 
		 * on what objects to instantiate, configure and assemble by reading configuration metadata
		 * 
		 * The configuration metadata can be represented in XML or Annotations 
		 * 
		 * Several implementations of the ApplicationContext interface are supplied out-of-the-box 
		 * with Spring. In stand alone application it is common to create and instance of either:
		 * 	- ClassPathXmlApplicationContext or
		 * 	- FileSystemXmlApplicationContext
		 * 
		 * Another implementation of the IoC container is web related
		 */

	}
}
