package com.masai;

import java.util.Scanner;

public class MainClassOfEmployee {
	public static Employee getEmployeeDetails() {
		Employee employee = new Employee();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Id-");
		int id = input.nextInt();
		System.out.println("Enter Name");
		String name = input.next();
		System.out.println("Enter Salary");
		double salary = input.nextDouble();
		System.out.println("Enter Pf Percentage");
		int pfpercent = MainClassOfEmployee.getPFPercentage();
		employee.setDetails(id, name, salary);
		employee.calculateNetSalary(pfpercent);
		return employee;
	}

	public static int getPFPercentage() {
		Scanner input = new Scanner(System.in);
		int pfpercent = input.nextInt();
		return pfpercent;
	}

	public static void main(String[] args) {
		Employee emp1 = getEmployeeDetails();
		System.out.println("Id - "+emp1.getid());
		System.out.println("Name - "+emp1.getName());
		System.out.println("Salary - "+emp1.getSalary());
		System.out.println("Net Salary - "+emp1.getNetSalary());
	}

}
