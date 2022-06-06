package evaluation.question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length=0;
		try {
			 length=scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Please Enter Natural Number");
		}
		int[] arr=new int[length];
        System.out.println("Enter the element of the array");
        for(int i=0;i<length;++i) {
        	try {
        		arr[i]=scanner.nextInt();
        	}catch (Exception e) {
				System.out.println("Please enter Integer");
			}
        	
        }
        System.out.println("Enter the index which you want to print");
        try {
        	int index=arr[scanner.nextInt()];
        	System.out.println("The array element index at "+index+"is "+arr[index]);
        	System.out.println("The array element successfully accessed");
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
        
	}

}
