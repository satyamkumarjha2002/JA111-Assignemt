package com.masai;

import java.util.Scanner;

public class NetSalaryCalculation{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Employee emp1 = new Employee();
		System.out.println("Enter Your Id");
		emp1.SetId(input.nextInt());
		System.out.println("Enter Your Name");
		emp1.SetName(input.next());
		System.out.println("Enter Your Salary");
		emp1.Setsalary(input.nextDouble());
		System.out.println("Enter Your P.F Percentage");
		emp1.calculateNetSalary(input.nextDouble());
		emp1.getEmployeeDetails();
		input.close();
	}
}