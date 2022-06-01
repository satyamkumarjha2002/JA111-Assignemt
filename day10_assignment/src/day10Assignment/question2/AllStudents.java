package day10Assignment.question2;

import java.util.Scanner;

public class AllStudents {
	public void setMarksOfScienceStudents(ScienceStudent scienceStudent) {
		int marks = -1;
		System.out.println("Enter Physics Marks ");
		marks = takeinput();
		if (marks > 0) {
			scienceStudent.setPhysicsMarks(marks);
		} else {
			while (marks <= 0) {
				System.out.println("Enter Vailed Marks should be 0<marks=100");
				marks = takeinput();
				scienceStudent.setPhysicsMarks(marks);
			}
		}
		System.out.println("Enter Chemistry Marks");
		marks = takeinput();
		if (marks > 0) {
			scienceStudent.setChemistryMarks(marks);
		} else {
			while (marks <= 0) {
				System.out.println("Enter Vailed Marks should be 0<marks=100");
				marks = takeinput();
				scienceStudent.setChemistryMarks(marks);
			}
		}
		System.out.println("Enter Math Marks");
		marks = takeinput();
		if (marks > 0) {
			scienceStudent.setMathsMarks(marks);
		} else {
			while (marks <= 0) {
				System.out.println("Enter Vailed Marks should be 0<marks=100");
				marks = takeinput();
				scienceStudent.setMathsMarks(marks);
			}
		}

		// percentege of total marks
		System.out.println("Toatal Percentage is ->" + scienceStudent.getPercentage());

		// ******************************
	}

	public void setMarksOfHistoryStudents(HistoryStudent historyStudent) {
		int marks = -1;
		System.out.println("Enter History Marks");
		marks = takeinput();
		if (marks > 0) {
			historyStudent.setHistoryMarks(marks);
		} else {
			while (marks <= 0) {
				System.out.println("Enter Vailed Marks should be 0<marks=100");
				marks = takeinput();
				historyStudent.setHistoryMarks(marks);
			}
		}

		System.out.println("Enter Civics Marks");
		marks = takeinput();
		if (marks > 0) {
			historyStudent.setCivicsMarks(marks);
		} else {
			while (marks <= 0) {
				System.out.println("Enter Vailed Marks should be 0<marks=100");
				marks = takeinput();
				historyStudent.setCivicsMarks(marks);
			}
		}
		// *****************************************
		System.out.println("Total percentage is ->" + historyStudent.getPercentage());

		//

	}

	public void setDetails(Student student) {
		if (student == null)
			return;
		Scanner inputScanner = new Scanner(System.in);
		if (student instanceof ScienceStudent) {
			ScienceStudent student2 = (ScienceStudent) student;
			System.out.println("Enter Science Student Details ");
			System.out.println("Enter Student Address");
			String addressString = inputScanner.next();
			System.out.println("Enter Student Name ");
			String nameString = inputScanner.next();
			ScienceStudent scienceStudent = new ScienceStudent(addressString, nameString);// setting name and address
																							// of-
		} else {
			HistoryStudent student3 = (HistoryStudent) student;
			System.out.println("Enter History Student Details ");
			System.out.println("Enter Student Address");
			String addressString = inputScanner.next();
			System.out.println("Enter Student Name ");
			String nameString = inputScanner.next();
			HistoryStudent historyStudent = new HistoryStudent(addressString, nameString);// setting history student
																							// name
																							// and address
		}
	}

	public static int takeinput() {
		Scanner inputScanner = new Scanner(System.in);
		int input = inputScanner.nextInt();
		if (input > 0 && input <= 100) {
			return input;
		}
		return -1;
	}

	public static void main(String[] args) {
		AllStudents allStudents = new AllStudents();
		ScienceStudent scienceStudent = new ScienceStudent(null, null);
		// setting details of the studets;
		allStudents.setDetails(scienceStudent);// setting address of science students;
		allStudents.setMarksOfScienceStudents(scienceStudent);// setting Marks Of science Students;

		HistoryStudent historyStudent = new HistoryStudent(null, null);
		allStudents.setDetails(historyStudent);// setting details of history students;
		allStudents.setMarksOfHistoryStudents(historyStudent);// settings marks of hisory students;

	}

}
