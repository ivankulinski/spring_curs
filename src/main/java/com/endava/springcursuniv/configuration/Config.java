package com.endava.springcursuniv.configuration;

import com.endava.springcursuniv.models.AutomaticTransmission;
import com.endava.springcursuniv.models.Car;
import com.endava.springcursuniv.models.ManualTransmission;
import com.endava.springcursuniv.models.Transmission;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    
    @Bean
    Car getCar() {
        Car car = new Car();
        car.setTransmission(getAutomaticTransmission());
        return car;
    }
    
    @Bean
    Transmission getManualTransmission() {
        return new ManualTransmission();
    }
    
    @Bean
    Transmission getAutomaticTransmission() {
        return new AutomaticTransmission();
    }
    
}
