package com.masai;

public class Employee {
private int employeeId;
private String employeeName;
private double salary;
private double netSalary;
public void setDetails(int id,String name,Double salary) {
	employeeId=id;
	employeeName=name;
	this.salary=salary;
}
public int getid() {
	return this.employeeId;
}
public String getName() {
	return this.employeeName;
}
public double getSalary() {
	return this.salary;
}
public double getNetSalary() {
	return this.netSalary;
}
public void calculateNetSalary(int pfpercentage) {
    netSalary=salary-(salary*(pfpercentage/100));
}
}
