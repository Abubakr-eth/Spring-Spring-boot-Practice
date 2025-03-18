package typesOfInitialization.EagerInitialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EagerInitializationDemo {
    public static void main(String[] args) {
        System.out.println("Before context initialization");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(EagerConfig.class);
        System.out.println("After context initialization");

        EagerService service = context.getBean(EagerService.class);
        service.doSomething();

        context.close();
    }
}