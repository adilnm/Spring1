package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.Car;

public class CarMainSpring {
	public static void main(String[] args) {
		// creating container
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("car-factory-service.xml");
		// Ask spring container to give car bean

		Car car = (Car) applicationContext.getBean("carta");
		System.out.println(car);

		Car car2 = (Car) applicationContext.getBean("carta2");
		System.out.println(car2);
	}
}
