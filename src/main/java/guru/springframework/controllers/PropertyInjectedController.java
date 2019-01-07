package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;

// Definitely wrong way of injecting.
public class PropertyInjectedController {
    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }
}
