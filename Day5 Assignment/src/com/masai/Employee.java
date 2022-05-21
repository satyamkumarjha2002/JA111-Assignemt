package com.masai;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;

	public void calculateNetSalary(Double pfpercentage) {
		this.netSalary = this.salary - (this.salary * (pfpercentage / 100));
	}

	public void SetId(int id) {
		this.employeeId = id;
	}

	public void SetName(String name) {
		this.employeeName = name;
	}

	public void Setsalary(double salar) {
		this.salary = salar;
	}

	public void getEmployeeDetails() {
		System.out.println("id : " + this.employeeId);
		System.out.println("Name : " + this.employeeName);
		System.out.println("Salary : " + this.salary);
		System.out.println("Net Salary : " + this.netSalary);
	}
}
