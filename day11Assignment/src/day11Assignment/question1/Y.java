package day11Assignment.question1;

public interface Y {
	void absMethodOfY();
	default void defMethodOfY() {
		System.out.println("Default Method Of Y");
	}

	static public void statMethodOfY() {
		System.out.println("Static Method of Y");
	}
}
