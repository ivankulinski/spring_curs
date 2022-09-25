package com.endava.springcursuniv.main;

import com.endava.springcursuniv.models.AutomaticTransmission;
import com.endava.springcursuniv.models.Car;
import com.endava.springcursuniv.models.ManualTransmission;

public class Main {
    
    public static void main(String[] args) {
        
        //Objects are manually instantiated
        Car car  = new Car();
        AutomaticTransmission automaticTransmission = new AutomaticTransmission();
        ManualTransmission manualTransmission = new ManualTransmission();
        
        //Manual injection
        car.setTransmission(automaticTransmission);
        
        car.start();
    }
    
}
