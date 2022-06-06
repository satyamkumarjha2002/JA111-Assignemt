package evaluation.question2;

public class TemporaryEmployee extends Employee {
    private int hoursWorked;
    private int hourlyWages;
	public TemporaryEmployee(int employeeId, String employeeName,int hoursWorked,int hourlyWages) {
		super(employeeId, employeeName);
		this.hoursWorked=hoursWorked;
		this.hourlyWages=hourlyWages;
		this.calculateSalary();
	}

	@Override
	void calculateSalary() {
		double salary=0;
		salary=this.hourlyWages*this.hoursWorked;
		//this method caluculte daily salary i am not multiplie here by 30 
		//because this is not mentioned in the question
		super.salary=salary;
	}

}
