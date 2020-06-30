package com.learning.spring;

public class PermanentEmployee implements Employee{

	public void permanentEmp() {
		System.out.println("Permanent employee");
	}
	
	public void contractorEmp() {
		System.out.println("Not a permanent employee");
	}
}
