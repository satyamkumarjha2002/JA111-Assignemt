package day9.question2;

abstract public class Parent {
	final int number;
   Parent(int num){
	   number=num;
   }
	abstract void method1();

	final void method2() {
		System.out.println("Inside Method 2 --------");
	}

	void method3() {
		System.out.println("Inside Method 3 --------");
	}

}
