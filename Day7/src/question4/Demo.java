package question4;

import java.util.Scanner;

public class Demo {
	public static Bank getBank(String bank,String branchName,double intrestrate,String ifscCode) {
		if(bank.compareToIgnoreCase("ICICI")==0) {
			return new ICICIBank(branchName,intrestrate,ifscCode);
		}else if(bank.compareToIgnoreCase("Axis")==0) {
			return new AxisBank(branchName,intrestrate,ifscCode);
		}
		return null;
	}
	public static void main(String[] args) {
		Demo bank = new Demo();
		Scanner inputScanner=new Scanner(System.in);
		System.out.println("Enter Bank Name");
		String bankkName=inputScanner.next();
		System.out.println("Enter Branch Name");
		String branchNmae=inputScanner.next();
		System.out.println("Enter IFSC Code ");
		String ifsccodeString=inputScanner.next();
		System.out.println("Enter Intrest Rate");
	    double intrestrate=inputScanner.nextDouble();
		Bank bank1=bank.getBank(bankkName,branchNmae,intrestrate,ifsccodeString);
		if(bank1==null) {
			System.out.println("Error");
		}else {
			  bank1.displayDetails();
		}
	}
}
