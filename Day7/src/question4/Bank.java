package question4;

public class Bank {
	String branchNameString;
	String ifscCodeString;

	void displayDetails() {
		System.out.println("Branch Name : " + this.branchNameString);
		System.out.println("IFSC Code : " + this.ifscCodeString);
	}
}

class AxisBank extends Bank{
	double rateOfInterest=10.00;
	@Override
	void displayDetails() {
		System.out.println("Branch Name : " + this.branchNameString);
		System.out.println("IFSC Code : " + this.ifscCodeString);
		System.out.println("Intrest Ratt : "+this.rateOfInterest);
	}
	void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
}

class ICICIBank extends Bank{
	double rateOfInterest=8.00;
	@Override
	void displayDetails() {
		System.out.println("Branch Name : " + this.branchNameString);
		System.out.println("IFSC Code : " + this.ifscCodeString);
		System.out.println("Intrest Ratt : "+this.rateOfInterest);
	}
}
