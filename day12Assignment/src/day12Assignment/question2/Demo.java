package day12Assignment.question2;

import java.util.regex.Pattern;

import javax.naming.spi.DirStateFactory.Result;
import javax.xml.validation.Validator;

import java.util.Scanner;
import java.util.regex.Matcher;

public class Demo {
	public boolean validate(String name, String mobileNum, String aadharCard) {
		//**********name vaidation*************
		Pattern nam=Pattern.compile("[^a-zA-Z]");
		Matcher mNameMatcher=nam.matcher(name);
		while(mNameMatcher.find()) {
			return false;
		}
		if(name.length()<3||name.length()>8) {
			return false;
		}
		//************Mobile number validation***********
		Pattern mobilePattern=Pattern.compile("[^0-9]");
		Matcher mobileMatcher=mobilePattern.matcher(mobileNum);
		while(mobileMatcher.find()) {
			return false;
		}
		if(mobileNum.length()!=10) {
			return false;
		}
		//*****AAdhar card validation****************
		Pattern aadharPattern=Pattern.compile("[^0-9]");
		Matcher aadharMatcher=aadharPattern.matcher(mobileNum);
		while(aadharMatcher.find()) {
			return false;
		}
		if(aadharCard.length()!=11) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Name");
		String nameString=scanner.nextLine();
		System.out.println("Enter Phone Number");
		String mobilenumberString =scanner.next();
		System.out.println("Enter Aadhar Number");
		String aadharString=scanner.next();
		Demo demo=new Demo();
		if(demo.validate(nameString, mobilenumberString, aadharString)) {
			Citizen citizen=new Citizen();
			//setting values in citizen class by setter method;
			citizen.setNameString(nameString);
			citizen.setAadharNumberString(aadharString);
			citizen.setMobileNumberString(mobilenumberString);
			//gettting value form citizen calss by getter method;
			System.out.println(citizen.getNameString());
			System.out.println(citizen.getMobileNumberString());
			System.out.println(citizen.getAadharNumberString());
			
		}else {
			System.out.println("Enter vailed Details");
		}
		
	}
}
