package practiceenum2;

import java.util.Scanner;

public class Demo {
	public void printInfo(Enum enu) {
		if(enu!=null) {
			enu.printInfo();
			System.out.println(enu.numberOftower);
		}else {
			System.out.println("City is invailed");
		}
	}
 public static void main(String[] args) {
	 Demo demo=new Demo();
	 Scanner inputScanner=new Scanner(System.in);
	 String citynameString=inputScanner.next();
	 
	 demo.printInfo(Enum.valueOf(citynameString.toUpperCase()));
 }
}
