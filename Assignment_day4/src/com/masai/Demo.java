package com.masai;

public class Demo {
	Demo() {
		System.out.println("Inside Demo()");
	}

	Demo(int i) {
		System.out.println("Inside Demo(int i)");
	}

	Demo(String s) {
		System.out.println("Inside Demo(String s)");
	}

	Demo(float f) {
		System.out.println("Inside Demo(float f)");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo test=new Demo();
        test=new Demo(1);	
        test=new Demo("satyam");	
        test=new Demo(10.5f);		
	}

}
