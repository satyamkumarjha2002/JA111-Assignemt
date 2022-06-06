package evaluation.question3;

import java.util.Scanner;

public class Demo {
	public void showDetails(Month m) {
		switch (m) {
		case JAN:
			System.out.println("This is the 1ST Month of the Year JANUARY");
			break;
		case FEB:
			System.out.println("This is the 2nd Month of the Year FEBURARY”");
			break;
		case MAR:
			System.out.println("This is the 3 Month of the Year MARCH");
			break;
		case APR:
			System.out.println("This is the 4 Month of the Year APRIL");
			break;
		case MAY:
			System.out.println("This is the 5 Month of the Year MAY");
			break;
		case JUN:
			System.out.println("This is the 6 Month of the Year JUNE");
			break;
		case JUL:
			System.out.println("This is the 7 Month of the Year JULAY");
			break;
		case AUG:
			System.out.println("This is the 8 Month of the Year AUGUST");
			break;
		case SEP:
			System.out.println("This is the 9 Month of the Year SEPTEMBER");
			break;
		case OCT:
			System.out.println("This is the 10 Month of the Year OCTOBER");
			break;
		case NOV:
			System.out.println("This is the 11 Month of the Year NOVEMBER");
			break;
		case DEC:
			System.out.println("This is the 12 Month of the Year DECEMBER");
			break;

		default:
			break;
		}
	}

	public static void main(String[] args) {
     Demo demo=new Demo();
     System.out.println("Enter first 3 letter of Month");
     Scanner scanner=new Scanner(System.in);
     String userInput="";
     try {
    	 userInput=scanner.next();
    	 userInput=userInput.toUpperCase();
         Month value=Month.valueOf(userInput);
         demo.showDetails(value);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}

	}
	
}
