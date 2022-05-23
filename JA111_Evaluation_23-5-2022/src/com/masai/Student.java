package com.masai;

public class Student {
private int rollNumber;
private String studentName;
private int marks;
Student(){
	
}
Student(String name,int roll,int marks){
	this.studentName=name;
	this.rollNumber=roll;
	this.marks=marks;
	
}
public void setName(String name) {
	this.studentName=name;
	
}
public void setRollNumber(int roll) {
	this.rollNumber=roll;
}
public void setMarks(int marks) {
	this.marks=marks;
}
public String getName() {
	return this.studentName;
}
public int getRollNumber() {
	return this.rollNumber;
}
public int getMarks() {
	return this.marks;
}
}
