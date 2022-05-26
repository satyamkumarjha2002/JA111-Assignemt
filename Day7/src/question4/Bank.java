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
	 AxisBank() {
			this.branchNameString="Axis Bank";
			this.ifscCodeString="AXIS0001";
			this.rateOfInterest=10.00;
		}
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
	double rateOfInterest;
	ICICIBank() {
		this.branchNameString="ICII Bank";
		this.ifscCodeString="ICICI000001";
		this.rateOfInterest=8.0;
	}
	@Override
	void displayDetails() {
		System.out.println("Branch Name : " + this.branchNameString);
		System.out.println("IFSC Code : " + this.ifscCodeString);
		System.out.println("Intrest Ratt : "+this.rateOfInterest);
	}
}
