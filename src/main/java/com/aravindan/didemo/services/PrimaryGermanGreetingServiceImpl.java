package com.aravindan.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("de")
@Primary
public class PrimaryGermanGreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hallo vom primären Begrüßungsdienst";
	}

}
