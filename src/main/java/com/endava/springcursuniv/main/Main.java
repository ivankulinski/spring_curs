package com.endava.springcursuniv.main;

import com.endava.springcursuniv.configuration.Config;
import com.endava.springcursuniv.models.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        
        Car car = (Car) context.getBean("car");
        car.start();
        System.out.println(car);
        System.out.println(car.getTransmission());
    }
    
}
