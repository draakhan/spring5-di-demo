package guru.springframework.controllers;

import static org.junit.Assert.assertEquals;

import guru.springframework.services.GreetingServiceImpl;

import org.junit.Before;
import org.junit.Test;

public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController propertyInjectedController;

    @Before
    public void setUp() {
        this.propertyInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController.sayHello());
    }
}
