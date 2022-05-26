package question4;

public class Animal {
	public void makeNoise() {
		System.out.println("Animal making Noise");
	}

	public void eat() {
		System.out.println("Animal is eating");
	}

	public void walk() {
		System.out.println("Animal is walking");
	}
}

class Dog extends Animal{
	@Override
	public void makeNoise() {
		System.out.println("Barking...");
	}
}

class Tiger extends Animal{
	public void makeNoise() {
		System.out.println("Raoring...");
	}
}

class Cat extends Animal{
	public void makeNoise() {
		
		System.out.println("Meaw...");
	}
}
