package day10Assignment.question1;

import java.util.Scanner;

public class Demo {
	public Hotel provideFood(int amount) {
		if (amount > 1000) {

			return new TajHotel();
			
		} else if(amount>=200){

			return new RoadSideHotel();
		}else {
			return null;
		}
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter Amount ");
		int amount = inputScanner.nextInt();
		Demo demo =new Demo();
		Hotel hotelObj=demo.provideFood(amount);
       if(hotelObj!=null) {
    	 if(hotelObj instanceof TajHotel) {
    		 TajHotel tajHotel = (TajHotel) hotelObj;
    		 tajHotel.welcomeDrink();
    		 tajHotel.chickenBiryani();
    		 tajHotel.masalaDosa();
    	 }else {
    		RoadSideHotel roadSideHotel=(RoadSideHotel) hotelObj;
    		roadSideHotel.chickenBiryani();
    		roadSideHotel.masalaDosa();
    		}
       }else {
    	   System.out.println("Plese Enter vailed amount");
       }
	}

}
