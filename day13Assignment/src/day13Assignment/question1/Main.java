package day13Assignment.question1;

import java.util.Scanner;
class Main {
public static void main(String args[]) {
System.out.println("start of main..");
Scanner sc = new Scanner(System.in);
int num1=0;
int num2=0;
int num3=0;
try {
	System.out.println("Enter num1");
	num1 = sc.nextInt();
	System.out.println("Enter num2");
	num2 = sc.nextInt();
} catch (Exception e) {
	System.out.println("Enter a Vailed Number");
}
String message = null;
try {
	 num3 = num1 / num2;
} catch (Exception e) {
	System.out.println("Number two must not be zero");
}
if(num3 > 10){
message = "Welcome to Exception Handling ";
}else {
	message="String value is null";
}
System.out.println("Message is :"+message.toUpperCase());
System.out.println("end of main");
}
}
