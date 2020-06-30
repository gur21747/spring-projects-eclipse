package com.learning.spring;

public class ContractorEmployee implements Employee{

	public void permanentEmp() {
		System.out.println("Not a permanent employee");
	}
	
	public void contractorEmp() {
		System.out.println("Contractor employee");
	}
}
