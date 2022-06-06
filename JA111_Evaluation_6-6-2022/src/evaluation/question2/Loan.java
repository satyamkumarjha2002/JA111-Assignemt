package evaluation.question2;

public class Loan {
	double loanamount=0;
	public double calculateLoanAmount(Employee employeeObj) {
		try {
			if(employeeObj instanceof PermanentEmployee) {
			    return employeeObj.getSalary()*0.15;
			}else{
				return employeeObj.salary*0.1;
				
			}
		} catch (Exception e) {
			return 0;
		}
	}
	private Loan() {
		
	}
	public Loan(int num) {
		
	}
}

