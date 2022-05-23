package com.masai;

public class Car {
	String color;
	String model;
	String companyName;
	Engine engine=new Engine();
	Car(String model, String comoanyName,String color, int rpm, int power, String manufature) {
		this.model = model;
		this.companyName = comoanyName;
		this.color = color;
		engine.manufacturer = manufature;
		engine.power = power;
		engine.rmp = rpm;
	}

	Car() {

	}
}
