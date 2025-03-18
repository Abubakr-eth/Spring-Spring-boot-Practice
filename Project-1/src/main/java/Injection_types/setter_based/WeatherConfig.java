package Injection_types.setter_based;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("Injection_types.setter_based")
public class WeatherConfig {
    // no need of bean definition as already using component with java classes
    // need to remember in setter based injection , we need to write autowired above the method to let spring know this function is perfoming the injection

}
