package com.in.akshay;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
//@Configuration
public class Car {
	Car car;
//	@Bean
	public Car setCar(Car car) {
		System.out.println("Car:: Setting Car");
		return this.car=car;
	}
	
	public Car() {
		System.out.println("Car:: Constructor");
	}

}
