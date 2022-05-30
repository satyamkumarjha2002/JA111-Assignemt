package java111Evaluation2.question4;

import java111Evaluation2.question4.Person.Address;

public class Main {
	public static Person generatePerson(Person person) {
		return person;
	}
	public static void main(String[] args) {
		Person newSutdent= generatePerson(new Student());
		Person newTeacher= generatePerson(new Instructor());
		Student student1=(Student) newSutdent;
		student1.courseEnrolled="java111";//setting sutdudent details;
		student1.courseFee=300000;
		student1.studentId=1;
		Instructor instructor1= (Instructor) newTeacher;
		instructor1.instructorSalary=45612;//setting instructor details
		instructor1.instructorId=612;
		System.out.println(newSutdent);
		System.out.println(newTeacher);
	}
}
