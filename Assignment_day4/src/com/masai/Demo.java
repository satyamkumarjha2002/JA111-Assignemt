package com.masai;

public class Demo {
	Demo() {
		this(1000);
		System.out.println("Inside Demo()");
	}

	Demo(int i) {
		this("Satym");
		System.out.println("Inside Demo(int i)");
	}

	Demo(String s) {
		this(10.5f);
		System.out.println("Inside Demo(String s)");
	}

	Demo(float f) {
		System.out.println("Inside Demo(float f)");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Demo test=new Demo();
//        test=new Demo(1);	
//        test=new Demo("satyam");	
//        test=new Demo(10.5f);		
	}

}
