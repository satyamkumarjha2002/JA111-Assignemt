package com.masai;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car firstCar =new Car();
        Car secondCar=new Car("Harrier","Tata","Black",320,750,"Tata");
        secondCar.engine.enableTurbo();
        // Display with parameterized Constructor;
        System.out.println("Display with parameterized Constructor");
        System.out.println("Car Model : "+secondCar.model);
        System.out.println("Car CompanyName : "+secondCar.companyName);
        System.out.println("Car Color : "+secondCar.color);
        System.out.println("Car RPM : "+secondCar.engine.rmp);
        System.out.println("Car Power : "+secondCar.engine.power);
        System.out.println("Car Engine Manufacturer : "+secondCar.engine.manufacturer);
        System.out.println("Car hasTurbo :"+secondCar.engine.hasTurbo);
        //Display with non-parameterized constructor;
        System.out.println("Display with non-parameterized constructor;");
        firstCar.model="Nano";
        firstCar.color="White";
        firstCar.companyName="Tata";
        firstCar.engine.rmp=3500;
        firstCar.engine.power=900;
        firstCar.engine.manufacturer="Tata";
        firstCar.engine.enableTurbo();
        System.out.println("Car Model : "+firstCar.model);
        System.out.println("Car CompanyName : "+firstCar.companyName);
        System.out.println("Car Color : "+firstCar.color);
        System.out.println("Car RPM : "+firstCar.engine.rmp);
        System.out.println("Car Power : "+firstCar.engine.power);
        System.out.println("Car Engine Manufacturer : "+firstCar.engine.manufacturer);
        System.out.println("Car hasTurbo :"+firstCar.engine.hasTurbo);
	}

}
