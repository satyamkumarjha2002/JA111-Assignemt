package com.masai;

import java.util.Scanner;

public class Course {
	int courseId;
	int courseFee;
	String courseName;

	void displayCourseDetails() {
		System.out.println("Course Id : " + this.courseId);
		System.out.println("Course Name : " + this.courseName);
		System.out.println("Course Fee : " + this.courseFee);
	}

	static void authenticate(String userName, int password) {
		if (userName == "Admin" && password == 1234) {
			Scanner input = new Scanner(System.in);
			Course setDetails = new Course();
			System.out.println("Enter Course Id");
			setDetails.courseId = input.nextInt();
			System.out.println("Enter Course Name");
			setDetails.courseName = input.next();
			System.out.println("Enter Course Fee");
			setDetails.courseId = input.nextInt();
			setDetails.displayCourseDetails();
		}else {
			System.out.println("Invalid Username or password");
		}
	}
	static public void main(String[] args) {
		Course user1= new Course();
		user1.authenticate("Admin", 1234);
		user1.authenticate("Admi", 123);
	}
}
