package com.abubalr.learn_spring_framework.app02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//this class contains the beans that needs to managed by spring
record Person(String name, int age){

}
@Configuration
public class HelloWorldConfig {
    @Bean
    public String name(){
        return "Abubakr";
    }
    @Bean
    public int age(){
        return 22;
    }
    @Bean(name="personhello")
    public Person person(){
        var p=new Person("Abu",22);
        return p;
    }

}
