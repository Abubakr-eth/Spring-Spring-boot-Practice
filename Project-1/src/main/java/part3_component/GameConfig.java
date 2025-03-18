package part3_component;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("part3_component")
public class GameConfig {
    // what it does is wherever we mention that this java class as component , it understands that this needs to treated as bean and handled by spring context
    //so that's why we don't need to define it here , automatically understands

}