package com.aravindan.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingRepositoryImpl implements GreetingRepository {

	@Override
	public String getEnglishGreeting() {
		return "Hello from primary Greeting Service!";
	}

	@Override
	public String getSpanishGreeting() {
		return "Hola del servicio de saludo primario!";
	}

	@Override
	public String getGermanGreeting() {
		return "Hallo vom primären Begrüßungsdienst";
	}

}
