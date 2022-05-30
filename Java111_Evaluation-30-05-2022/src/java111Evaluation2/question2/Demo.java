package java111Evaluation2.question2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number of the sudent ");
		int numberOfStrudent=input.nextInt();//taking number of student from the user;
		int averageMarks=0;//average marks of students;
		Student[] studentArray=new Student[numberOfStrudent];
        for(int i=0;i<numberOfStrudent;++i) {
        	Student student=new Student(); 
        	System.out.println("Fill the details of Student : "+i+1);
        	System.out.println("Enter Student Name :");
        	student.setName(input.next());
        	System.out.println("Enter Student ROll :");
        	student.setRoll(input.nextInt());
        	System.out.println("Enter Student Address :");
        	student.setAddress(input.next());
        	System.out.println("Enter Student Marks :");
        	student.setMarks(input.nextInt());
            studentArray[i]=student;
        }
        for(int i=0;i<studentArray.length;++i) {
        	averageMarks=averageMarks+ studentArray[i].getMarks();
        }
        averageMarks=averageMarks/studentArray.length;//total marks divided by total student;
        System.out.println("Average marks of student : "+averageMarks);
	}
}
