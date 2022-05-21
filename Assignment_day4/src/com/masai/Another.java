package com.masai;

public class Another {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students std1 = new Students();
		Students std2 = new Students("Satyam", 95, 450, 21);
		System.out.println("std1 name-" + std1.name);
		System.out.println("std1 roll-" + std1.roll);
		System.out.println("std1 marks-" + std1.marks);
		System.out.println("std1- age" + std1.age);
		System.out.println("Using pramitrized constructure");
		System.out.println("std2 name-" + std1.name);
		System.out.println("std2 roll-" + std1.roll);
		System.out.println("std2 age-" + std1.marks);
		System.out.println("std2 marks-" + std1.age);
	}

}
