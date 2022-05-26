package question1;

public class Main {

	public static void main(String[] args) {
		Member member = new Member();
		member.setAddreString("Bihar");
		member.setAge(21);
		member.setNameString("Satyam");
		member.setSalary(1000000);
		Employee employee = new Employee();
		employee.setAddreString("Patna");
		employee.setAge(21);
		employee.setNameString("shivam");
		employee.setSalary(500.98);
		
		member.printSalary();
		employee.printSalary();
	}

}
