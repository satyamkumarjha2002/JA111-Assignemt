package java111Evaluation2.question4;

public class Instructor extends Person {
    int instructorId;
    int instructorSalary;
    @Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", instructorSalary=" + instructorSalary + ", address="
				+ address + "]";
	}
    Address address =new Address("TN","4342334","chenni");//setting instructor addresss by address class constructor;
	
}
