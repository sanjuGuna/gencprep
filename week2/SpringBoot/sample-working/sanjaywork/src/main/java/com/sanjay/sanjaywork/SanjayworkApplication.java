package com.sanjay.sanjaywork;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SanjayworkApplication {
    @Autowired
    private Car car;

	public static void main(String[] args) {
		SpringApplication.run(SanjayworkApplication.class, args);
	}
    @PostConstruct
    public void run(){
        car.drive();
    }

}
