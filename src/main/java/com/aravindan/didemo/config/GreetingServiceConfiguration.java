package com.aravindan.didemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import com.aravindan.services.GreetingRepository;
import com.aravindan.services.GreetingService;
import com.aravindan.services.GreetingServiceFactory;

@Configuration
public class GreetingServiceConfiguration {
	
	@Bean
	GreetingServiceFactory greetingServiceFactory(GreetingRepository repository) {
		return new GreetingServiceFactory(repository);
	}
	
	@Bean
	@Profile("de")
	@Primary
	GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("de");
	}
	
	@Bean
	@Profile("es")
	@Primary
	GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("es");
	}
	
	@Bean
	@Profile({"en", "default"})
	@Primary
	GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("en");
	}
}
