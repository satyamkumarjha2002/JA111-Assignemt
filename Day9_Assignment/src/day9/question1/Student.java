package day9.question1;

import java.util.Scanner;

public class Student {
	private int roll;
	private String name;
	private int marks;
	private char grade;
    Student(){
    	
    }
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}

	public void displayDetails() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Name ");
		this.name=input.next();
		System.out.println("Enter roll Number");
	    this.roll=input.nextInt();
	    System.out.println("Enter Marks");
	    this.marks=input.nextInt();
	    this.grade=calculateGrade(this.marks);
		Student students=new Student();
	}

	private char calculateGrade(int mrks) {
		if (marks >= 500)
			return 'A';
		if (marks <= 500&&marks>=400)
			return 'B';
		else
			return 'C';

	}
}
