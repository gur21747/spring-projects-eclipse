package com.learning.springdemo.serviceimpl;

import java.util.Random;

import com.learning.springdemo.service.BusinessService;

public class CloudServiceImpl implements BusinessService {

	@Override
	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\n Cloud Organization " + companyName + 
				" cloud income exceeds "   + random.nextInt(revenue);
		return service;
	}

}
