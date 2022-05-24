package com.masai;


public class Students {
	private int roll;
	private String name;
	private int age;
	private int marks;
	Students() {

	}

	Students(String name, int roll, int marks, int age) {
		if (age > 18 && age < 60 && marks < 500 && marks > 0) {
			this.roll = roll;
			this.name = name;
			this.marks = marks;
			this.age = age;
		}
	}
  public void setName(String name) {
	  this.name=name;
  }
  public void setRoll(int roll) {
	  this.roll=roll;
  }
  public void setAge(int age) {
	  this.age=age;
  }
  public void setMarks(int marks) {
	  this.marks=marks;
  }
  public String getName() {
	  return this.name;
  }
  public int getRoll() {
	  return this.roll;
  }
  public int getAge() {
	  return this.age;
  }
  public int getMarks() {
	  return this.marks;
  }
	

}
