package com.masai;

public class Question4 {
    public void printNext(int num) {
    	if(num<0) {
    		System.out.println("Error");
    	}else if(num%2==0){
    		while(num%10!=0) {
    			++num;
    		}
    		System.out.println(num);
    	}else {
    		System.out.println(num);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Question4 num = new Question4();
         num.printNext(-5);
         num.printNext(44);
         num.printNext(45);
         }

}
