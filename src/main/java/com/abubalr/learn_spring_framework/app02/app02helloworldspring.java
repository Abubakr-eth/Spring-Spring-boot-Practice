package com.abubalr.learn_spring_framework.app02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//spring context
public class app02helloworldspring {

	public static void main(String[] args) {
		//launch a spring application
		//configure the things we want spring to manage- @config class
		var context= new AnnotationConfigApplicationContext(HelloWorldConfig.class);//this will create context
		//retrieving beans managed by spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("personhello"));

	}

}
