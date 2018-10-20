package com.aravindan.didemo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.aravindan.didemo.controllers.SetterInjectedController;
import com.aravindan.services.GreetingServiceImpl;

public class SetterInjectedControllerTest {
	
	private SetterInjectedController setterInjectedController;

	@Before
	public void setUp() throws Exception {
		this.setterInjectedController = new SetterInjectedController();
		this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
		
	}

	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO_WORLD, setterInjectedController.sayHello());
	}

}
