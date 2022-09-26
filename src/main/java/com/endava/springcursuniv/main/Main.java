package com.endava.springcursuniv.main;

import com.endava.springcursuniv.configuration.Config;
import com.endava.springcursuniv.models.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        
        Car car = (Car) context.getBean("car");
        Car car2 = (Car) context.getBean("car");
        car.start();
        car2.start();
    
        System.out.println("Car 1: \n" + car + "\n Hashcode: " + car.hashCode());
        System.out.println("Car 2: \n" + car2 + "\n Hashcode: " + car2.hashCode());
        
    }
    
}
