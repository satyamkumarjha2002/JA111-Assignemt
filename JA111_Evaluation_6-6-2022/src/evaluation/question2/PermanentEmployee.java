package evaluation.question2;

public class PermanentEmployee extends Employee {

	@Override
	void calculateSalary() {
		double salary=0;
		salary =this.basicPay-(this.basicPay*0.12);
	    super.salary=salary;
	}
	private double basicPay;
	public PermanentEmployee(int employeeID,String employeeName,double basicPay) {
		super(employeeID, employeeName);
		this.basicPay=basicPay;
		calculateSalary();
	}

}
