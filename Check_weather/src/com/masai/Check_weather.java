package com.masai;

public class Check_weather {

	public static void main(String[] args) {
		boolean isSnowing = false;
		boolean isRaining = true;
		double temperature = 60.0;
		if(isSnowing==true||isRaining==true||temperature<50) {
			System.out.println("Let�s stay home.");
			
		}else {
			System.out.println("Let�s go out!");
		}

	}

}
