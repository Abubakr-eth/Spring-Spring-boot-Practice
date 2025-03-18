package typesOfInitialization.LazyInitialization;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyService {
    LazyService(){
        System.out.println("lazy bean initialized");
    }
    void doSomething(){
        System.out.println("lazy doing something");
    }
}
