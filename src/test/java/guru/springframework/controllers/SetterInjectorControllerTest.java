package guru.springframework.controllers;

import static org.junit.Assert.assertEquals;

import guru.springframework.services.GreetingServiceImpl;

import org.junit.Before;
import org.junit.Test;

public class SetterInjectorControllerTest {
    private SetterInjectedController propertyInjectedController;

    @Before
    public void setUp() {
        this.propertyInjectedController = new SetterInjectedController();
        this.propertyInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController.sayHello());
    }
}
