package evaluation.question4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.border.MatteBorder;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Customer customer=new Customer();
		String userName="";
		String password="";
		String email="";
		String mobileNumber="";
		try {
			System.out.println("Enter user Name");
			 userName=scanner.next();
			 System.out.println("Enter user Password");
			 password=scanner.next();
			 System.out.println("Enter user email");
			 email=scanner.next();
			 System.out.println("Enter user Mobile Number");
			 mobileNumber=scanner.next();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		boolean result=true;
		Pattern patternName=Pattern.compile("[^a-zA-Z]");
		Matcher matcherName=patternName.matcher(userName);
		while(matcherName.find()) {
			result=false;
			break;
		}
		Pattern patternMobile=Pattern.compile("[0-9]");
		Matcher matcherMobile=patternMobile.matcher(userName);
		while(matcherMobile.find()) {
			result=false;
			break;
		}
		Pattern patternpass=Pattern.compile("[^a-zA-Z0-9]");
		Matcher matcherpass=patternpass.matcher(userName);
		while(matcherpass.find()) {
			result=false;
			break;
		}
		result=userName.length()>=3&&userName.length()<=8;
		result=mobileNumber.length()==10;
		result=password.length()>=3&&password.length()<=8;
		if(result) {
			//setting user input to the custpmer object;
			customer.setEmail(email);
			customer.setMobileNumber(mobileNumber);
			customer.setUserNameString(userName);
			customer.setPassword(password);
			
			//getting customer object details;
			
			System.out.println("Customer Name"+ customer.getUserNameString());
			System.out.println("Customer Email"+customer.getEmail());
			System.out.println("Customer password"+customer.getPassword());
			System.out.println("Customer Mobile Number"+customer.getMobileNumber());
		}else {
			System.out.println("Enter vailed Details");
		}
		
	}

}
