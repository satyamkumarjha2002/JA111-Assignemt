package question4;

public class Bank {
	Bank(String branchNameString,String ifscCodeString){
		this.branchNameString=branchNameString;
		this.ifscCodeString=ifscCodeString;
	}
	String branchNameString;
	String ifscCodeString;

	void displayDetails() {
		System.out.println("Branch Name : " + this.branchNameString);
		System.out.println("IFSC Code : " + this.ifscCodeString);
	}
}

class AxisBank extends Bank{
	double rateOfInterest;
	 AxisBank(String branchName,double intrestrate,String ifscCode) {
		     super(branchName,ifscCode);
			this.rateOfInterest=intrestrate;
		}
	@Override
	void displayDetails() {
		System.out.println("Bank Name : AXIS");
		System.out.println("Branch Name : " + this.branchNameString);
		System.out.println("IFSC Code : " + this.ifscCodeString);
		System.out.println("Intrest Rate : "+this.rateOfInterest);
	}
	void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
}

class ICICIBank extends Bank{
	double rateOfInterest;
	ICICIBank(String branchName,double intrestrate,String ifscCode) {
		super(branchName,ifscCode);
		this.rateOfInterest=intrestrate;
	}
	@Override
	void displayDetails() {
		System.out.println("Bank Name : ICICI");
		System.out.println("Branch Name : " + this.branchNameString);
		System.out.println("IFSC Code : " + this.ifscCodeString);
		System.out.println("Intrest Rate : "+this.rateOfInterest);
	}
}
