package com.sanjay.sanjaywork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    Engine engine;
    @Autowired
    public Car(Engine engine){
        this.engine=engine;
    }
    public void drive(){
        System.out.println(engine.start());
    }
}
