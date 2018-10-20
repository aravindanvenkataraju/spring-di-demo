package com.aravindan.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
	public static final String HELLO_WORLD = "Hello World! - From property injection"; 
	@Override
	public String sayGreeting() {
		return HELLO_WORLD;
	}

}
