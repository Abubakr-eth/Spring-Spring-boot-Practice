package Injection_types.field_based;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("Injection_types.field_based")
public class WeatherConfig {
    // no need of bean definition as already using component with java classes
    // need to remember in field based injection , we need to write autowired above the reference variable to let spring know this variable is perfoming the injection

}
