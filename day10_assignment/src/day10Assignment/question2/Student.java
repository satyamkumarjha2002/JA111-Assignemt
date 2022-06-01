package day10Assignment.question2;

public abstract class Student {
	final String addressString;
	final String nameString;

	Student(String nameString, String addreString) {
		this.addressString = addreString;
		this.nameString = nameString;
	}
	abstract public int getPercentage();
}
