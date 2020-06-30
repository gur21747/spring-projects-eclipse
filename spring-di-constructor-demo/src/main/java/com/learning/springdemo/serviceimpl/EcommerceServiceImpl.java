package com.learning.springdemo.serviceimpl;

import java.util.Random;

import com.learning.springdemo.service.BusinessService;

public class EcommerceServiceImpl implements BusinessService {

	@Override
	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\n Ecomm Organization " + companyName + 
				" ecommerce revenue is "    + random.nextInt(revenue);
		return service;
	}

}
