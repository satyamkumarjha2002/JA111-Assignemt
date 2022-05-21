package com.masai;

public class Students {
	Students(){
		
	}
    Students(String name,int roll,int marks,int age){
    	if(age>18&&age<60&&marks<500&&marks>0) {
    		this.roll=roll;
    		this.name=name;
    		this.marks=marks;
    		this.age=age;
    	}
    }
int roll=5;
String name="Shivam";
int age=18;
int marks=400;

}
