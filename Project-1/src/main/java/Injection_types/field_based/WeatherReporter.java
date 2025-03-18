package Injection_types.field_based;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WeatherReporter {
    @Autowired
    WeatherService weatherService;


    void reportWeather(){
        weatherService.getWeather();
    }
}
