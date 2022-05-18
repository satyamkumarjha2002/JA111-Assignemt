package com.masai;

public class Students {
	int roll;
    String name;
    int marks;
    void displayStudentDetails() {
    	System.out.println("Roll is:"+roll);
    	System.out.println("Name is:"+name);
    	System.out.println("Marks is:"+marks);
    }
	public static void main(String[] args) {
		Students student1=new Students();
		student1.roll=1;
		student1.name="Satyam Kumar Jha";
		student1.marks=10;
		student1.displayStudentDetails();
		Students student2=student1;
		student1=null;
        student2.roll=2;
		student2.name="Shivam Kumar Jha";
		student2.marks=32;
		student2.displayStudentDetails();
		student2=null;
	}

}
