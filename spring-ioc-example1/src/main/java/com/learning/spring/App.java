package com.learning.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// create the application context (container)
		ApplicationContext ctx = new FileSystemXmlApplicationContext("bean-cp.xml");
		ApplicationContext ctx2 = new FileSystemXmlApplicationContext("beans-cp2.xml");

		
		// create the bean
		PermanentEmployee 	emp1 = (PermanentEmployee) 	ctx.getBean("permanent");
		ContractorEmployee 	emp2 = (ContractorEmployee) ctx2.getBean("contractor");

		// invoke the objects via the bean 
		emp1.permanentEmp();
		emp2.contractorEmp();

		// close the application context (container)
		((FileSystemXmlApplicationContext) ctx).close();
		((FileSystemXmlApplicationContext) ctx2).close();

	}
}
