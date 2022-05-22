package com.masai;

public class Student {
	int roll;
	String name;
	String college;
	String address;
	public static Student getStudent(boolean isFromNIT) {
		if (isFromNIT == true) {
			
			return new Student(100,"Shivam","India");
		} else {
			return new Student(1,"Satyam","H.P.S","India");
		}
		
	}
	Student(int roll,String name,String college,String address){
		this.name=name;
		this.roll=roll;
		this.college=college;
		this.address=address;
	}
	Student(int roll,String name,String address){
		this.name=name;
		this.roll=roll;
		this.college="NIT";
		this.address=address;
	}

	static public void main(String[] args) {
	  Student stu1=Student.getStudent(false);
	  Student stu2=Student.getStudent(true);
	  //using four parameterized constructor
	  System.out.println(stu1.name);
	  System.out.println(stu1.roll);
	  System.out.println(stu1.college);
	  System.out.println(stu1.address);
	  //using three parameterized constructor
	  System.out.println(stu2.name);
	  System.out.println(stu2.roll);
	  System.out.println(stu2.college);
	  System.out.println(stu2.address);
	}
}
