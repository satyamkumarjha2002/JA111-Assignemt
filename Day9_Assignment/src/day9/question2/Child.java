package day9.question2;

import java.util.Scanner;

public final class Child extends Parent {
	void method4() {
		System.out.println("Inside Method 3 --------");
	}
     Child(int number) {
	     super(number);
    }
	void method1() {
        System.out.println("Inside Method1");
        System.out.println(number);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number from 0-10");
		byte number = input.nextByte();
		if (number >= 0 && number <= 10) {
			Parent child =new Child(number);
			child.method1();
			child.method2();
			child.method3();
			Child child1=(Child) child;
			child1.method4();
		} else {
			System.out.println("Error");
		}
	}
}