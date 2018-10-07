package com.aravindan.didemo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.aravindan.didemo.controllers.ConstructorInjectedController;
import com.aravindan.didemo.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {

	private ConstructorInjectedController constructorInjectedController;

	@Before
	public void setUp() throws Exception {
		this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
		
	}

	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO_WORLD, constructorInjectedController.sayHello());
	}

}
