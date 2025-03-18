package Injection_types.field_based;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WeatherApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(WeatherConfig.class);
        WeatherReporter reporter = context.getBean(WeatherReporter.class);
        reporter.reportWeather();
    }
}
