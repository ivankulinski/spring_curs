package com.endava.springcursuniv.main;

import com.endava.springcursuniv.configuration.Config;
import com.endava.springcursuniv.models.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        
        //Now we get the bean from the Spring Context / Container
        Car car = context.getBean(Car.class);
        
        car.start();
        
    }
    
}
