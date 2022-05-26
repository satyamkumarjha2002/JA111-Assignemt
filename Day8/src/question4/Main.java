package question4;

public class Main {

	public static void main(String[] args) {
		Animal[] animals=new Animal[3];
		animals[0]=new Dog();
		animals[1]=new Cat();
		animals[2]=new Tiger();
		
		//for Dog;
		System.out.println("for Dog");
		animals[0].eat();
		animals[0].makeNoise();
		animals[0].walk();
		System.out.println("==============================");
		//for cat;
		System.out.println("for Cat");
		animals[1].eat();
		animals[1].makeNoise();
		animals[1].walk();
		System.out.println("==============================");
		//for Tiger
		System.out.println("for Tiger");
		animals[2].eat();
		animals[2].makeNoise();
		animals[2].walk();
	}

}
