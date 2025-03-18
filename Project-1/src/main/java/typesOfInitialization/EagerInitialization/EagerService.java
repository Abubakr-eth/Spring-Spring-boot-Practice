package typesOfInitialization.EagerInitialization;

import org.springframework.stereotype.Component;

@Component
public class EagerService {
    public EagerService() {
        System.out.println("EagerService is initialized");
    }

    public void doSomething() {
        System.out.println("EagerService is doing something");
    }
}