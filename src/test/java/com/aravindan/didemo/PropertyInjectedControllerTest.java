package com.aravindan.didemo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.aravindan.didemo.controllers.PropertyInjectedController;
import com.aravindan.didemo.services.GreetingServiceImpl;

public class PropertyInjectedControllerTest {

	private PropertyInjectedController propertyInjectectedController;
	
	@Before
	public void setUp() throws Exception{
		this.propertyInjectectedController = new PropertyInjectedController();
		this.propertyInjectectedController.greetingService = new GreetingServiceImpl();
	}
	
	@Test
	public void testGreeting() throws Exception{
		assertEquals(GreetingServiceImpl.HELLO_WORLD, propertyInjectectedController.sayHello());
	}
}
