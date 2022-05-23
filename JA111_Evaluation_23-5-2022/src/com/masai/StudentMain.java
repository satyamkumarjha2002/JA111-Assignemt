package com.masai;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		Student studetns = new Student();
		System.out.println("Enter Number of Students you want to enter");
		int numberOfStudet = inputScanner.nextInt();
		System.out.println("=====================================================");
		//Value assign using setter Method
		for(int i=0;i<numberOfStudet;++i) {
			//input of student details by user;
			System.out.println("Enter the Roll Number :");
			studetns.setRollNumber(inputScanner.nextInt());
			System.out.println("Enter the Name :");
			studetns.setName(inputScanner.next());
			System.out.println("Enter the marks :");
			studetns.setMarks(inputScanner.nextInt());
			//display students details
			System.out.println("Student Detail "+i+"1");
			System.out.println("SStudent roll Number : "+studetns.getRollNumber());
			System.out.println("Student Names : "+studetns.getName());
			System.out.println("Student Marks : "+studetns.getMarks());
		}
//Value assign using parameterized constructor;
		for (int i = 0; i < numberOfStudet; ++i) {
			// input of student details by user;
			System.out.println("Enter the Roll Number :");
			int roll = inputScanner.nextInt();
			System.out.println("Enter the Name :");
			String name = inputScanner.next();
			System.out.println("Enter the marks :");
			int marks = inputScanner.nextInt();
			//passing details in constructor function;
			 studetns=new Student(name,roll,marks);
			// display students details
			System.out.println("Student Detail " + i + "1");
			System.out.println("Student roll Number : " + studetns.getRollNumber());
			System.out.println("Student Names : " + studetns.getName());
			System.out.println("Student Marks : " + studetns.getMarks());
		}
	}

}
