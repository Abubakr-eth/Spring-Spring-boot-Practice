package Injection_types.setter_based;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WeatherReporter {
    WeatherService weatherService;
    @Autowired
    void setWeatherService(WeatherService weatherService){
        this.weatherService=weatherService;
    }
    void reportWeather(){
        weatherService.getWeather();
    }
}
