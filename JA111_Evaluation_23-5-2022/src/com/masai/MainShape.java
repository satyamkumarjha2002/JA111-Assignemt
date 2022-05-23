package com.masai;

public class MainShape {

	public static void main(String[] args) {
       Shape shapes=new Shape();
       shapes.area(shapes.new Circle());
       shapes.area(shapes.new Rectangle());
       shapes.area(shapes.new Square());
	}

}
//Loading the recorcess in the ram at the time of excecution we called it static polymorphisim;
//Above you can see when we call overloaded method area with the arguments circle type obj this object 
//create only when then area function is called or program statrred to excution
//Same thing happen in both of the area overloaded function.