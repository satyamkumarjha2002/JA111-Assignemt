package question1;

import java.util.Scanner;

public class reverseArray {
	public static String reversString(String input){
	    char[] array;
	    String reversedArray="";
	    array=input.toCharArray();
	    for(int i=array.length-1;i>=0;--i) {
	    	reversedArray=reversedArray+array[i];
	    }
		return reversedArray;
		}
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String to reverse");
			String orignalString = sc.next();
			String result = reversString(orignalString);
			System.out.println("Original String is :"+ orignalString);
			System.out.println("Reversed String is :"+ result);
			}
	}

