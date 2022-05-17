//package com.masai;

public class CityName {
    static void mymethod(String city_name){
		switch(city_name){
			case "Mumbai":
			System.out.println("Financial city");
			break;
			case "Kolkata":
			System.out.println("Financial city");
			break;
			case "Delhi":
			System.out.println("Financial city");
			break;
			case "Banglore":
			System.out.println("Financial city");
			break;
			default:
			System.out.println("May be Other Indian City");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        mymethod("Mumbai");
	}

}
