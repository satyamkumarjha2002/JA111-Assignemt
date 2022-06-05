package pattern;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patt {
public static void main(String[] args) {
	Scanner inputScanner=new Scanner(System.in);
	inputScanner.nextLine();
	Pattern pattern=Pattern.compile("Java");
    System.out.println("Enter paragraph to find keyword");
	//Scanner inputScanner=new Scanner(System.in);
	String userInput=inputScanner.nextLine();
	Matcher m=pattern.matcher(userInput);
	while(m.find()) {
		System.out.println(m.start()+"***********"+m.end()+"**********"+m.group());
	}
	//System.out.println(m);
	}
}
