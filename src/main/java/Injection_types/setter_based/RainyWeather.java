package Injection_types.setter_based;

import org.springframework.stereotype.Component;

@Component
public class RainyWeather implements WeatherService{
    @Override
    public void getWeather() {
        System.out.println("Today is rainy");
    }
}
