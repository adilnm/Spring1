package com.service;

public class Car {
	private String make;
	private String model;
	private int price;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void run() {
		System.out.println("Hey I can run very fast");
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", price=" + price + "]";
	}

}
