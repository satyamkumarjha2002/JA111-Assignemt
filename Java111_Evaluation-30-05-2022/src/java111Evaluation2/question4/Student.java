package java111Evaluation2.question4;

import java111Evaluation2.question4.Person.Address;

public class Student extends Person {
	 Address address =new Address("Bihar","847408","Madhubani");//setting students details by address class constructor
	@Override
	public String toString() {
		return "Student [address=" + address + ", studentId=" + studentId + ", courseEnrolled=" + courseEnrolled
				+ ", courseFee=" + courseFee + "]";
	}
	int studentId;
	String courseEnrolled;
	int courseFee;
}
