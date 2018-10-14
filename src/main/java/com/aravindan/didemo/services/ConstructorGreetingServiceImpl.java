package com.aravindan.didemo.services;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService, BeanNameAware{

	@Override
	public String sayGreeting() {
		return "Hello world! - I was Injected from Constructor";
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("Setting Bean Name for ConstructorGreetingServiceImpl, name : "+name);
		
	}
	
	

}
