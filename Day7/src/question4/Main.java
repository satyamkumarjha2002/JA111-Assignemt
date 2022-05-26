package question4;

public class Main {

	public static void main(String[] args) {
		Demo bank = new Demo();
		Bank axisBank=bank.getBank("Axis");
		Bank iciciBank=bank.getBank("ICICI");
		Bank sbiBank=bank.getBank("SBI");
		//Axis Bank;
		axisBank.displayDetails();
		System.out.println("==========================");
		//Icici Bank;
		iciciBank.displayDetails();
		System.out.println("==========================");
		//SBI Bank;
	}

}
