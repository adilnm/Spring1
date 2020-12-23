package com.main;

import com.service.Car;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car();
		car.setMake("BMW");
		car.setModel("m123");
		car.setPrice(100);

		car.run();

	}

}
