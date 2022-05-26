package question1;

public class Member {
	String nameString;
	int age;
	String addreString;
	double salary;
	String phoneString;
	
	

	public String getNameString() {
		return nameString;
	}



	public void setNameString(String nameString) {
		this.nameString = nameString;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getAddreString() {
		return addreString;
	}



	public void setAddreString(String addreString) {
		this.addreString = addreString;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public String getPhoneString() {
		return phoneString;
	}



	public void setPhoneString(String phoneString) {
		this.phoneString = phoneString;
	}



	void printSalary() {
		System.out.println("Salary : "+this.salary);
	}
	

}

class Manager extends Member {
	String specialisation;
	String depaString;
}

class Employee extends Member {
	String specialisation;
	String departmentString;
}