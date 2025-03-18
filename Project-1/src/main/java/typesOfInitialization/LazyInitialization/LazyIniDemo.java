package typesOfInitialization.LazyInitialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LazyIniDemo {
    public static void main(String[] args) {
        System.out.println("Before context initialization");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(LazyConfig.class);
        System.out.println("After context initialization");

        System.out.println("Before bean retrieval");
        LazyService service = context.getBean(LazyService.class);
        System.out.println("After bean retrieval");

        service.doSomething();

        context.close();

    }
}
