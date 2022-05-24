package com.masai;

public class Another {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students std1 = new Students();
		std1.setName("shivam Kumar Jha");
		std1.setAge(18);
		std1.setRoll(12);
		std1.setMarks(500);
		
		Students std2 = new Students("Satyam", 95, 450, 21);
		System.out.println("std1 name-" + std1.getName());
		System.out.println("std1 roll-" + std1.getRoll());
		System.out.println("std1 marks-" + std1.getMarks());
		System.out.println("std1- age-" + std1.getAge());
		System.out.println("Using pramitrized constructure");
		System.out.println("std2 name-" + std2.getName());
		System.out.println("std2 roll-" + std2.getRoll());
		System.out.println("std2 age-" + std2.getAge());
		System.out.println("std2 marks-" + std2.getMarks());
	}

}
