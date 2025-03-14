package Injection_types.setter_based;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SunnyWeather implements WeatherService{
    @Override
    public void getWeather() {
        System.out.println("Today is sunny");
    }
}
