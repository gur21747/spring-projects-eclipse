package com.learning.springdemo.serviceimpl;

import java.util.Random;

import com.learning.springdemo.service.RecruitmentService;

public class ReferralRecruitmentServiceImpl implements RecruitmentService {

	public String recruitEmployees(String companyName, String departmentName, int numberOfRecruitments) {
		Random random = new Random();
		String hiringFacts = "\n" + companyName + "'s " + departmentName + " hired  " +
						random.nextInt(numberOfRecruitments) + " employees " +
						" which were REFFERED to the company by employees.";
		return hiringFacts;
	}

}
