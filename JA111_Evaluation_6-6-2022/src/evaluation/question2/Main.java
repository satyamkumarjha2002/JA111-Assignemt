package evaluation.question2;

public class Main {

	public static void main(String[] args) {
		Loan loan=new Loan(0);
		PermanentEmployee permanentEmployee=new PermanentEmployee(123, "Satyam", 20000.0);
		TemporaryEmployee temporaryEmployee=new TemporaryEmployee(321, "Mohan", 8, 100);
		double loanAmount=0;
		loanAmount=loan.calculateLoanAmount(permanentEmployee);
		System.out.println("Loan Amount of Permananet Employee "+loanAmount);
		loanAmount=loan.calculateLoanAmount(temporaryEmployee);
		System.out.println("Loan Amount of temprorary Employee "+loanAmount);
		loanAmount=loan.calculateLoanAmount(null);
		if(loanAmount==0) {
			System.out.println("Please enter vailed Value");
		}
	}

}
