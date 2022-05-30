package java111Evaluation2.question3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number of Passenger");
		int numberOfPassenger=input.nextInt();
		System.out.println("Enter Distance in K.M ");
		int numberOfKM=input.nextInt();
		OLA carOla=new OLA();
		Car typeOfCar= carOla.bookCar(numberOfPassenger, numberOfKM);
		int totalFare=carOla.calculateBill(typeOfCar);
		System.out.println("The total fare anount is "+totalFare);
	}

}
