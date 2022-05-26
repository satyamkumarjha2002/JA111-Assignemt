package question4;

public class Main {

	public static void main(String[] args) {
		Demo bank = new Demo();
		Bank axisBank=bank.getBank("Axis");
		axisBank.branchNameString="Axixs Bank";
		axisBank.ifscCodeString="AXIS00001";
		Bank iciciBank=bank.getBank("ICICI");
		iciciBank.branchNameString="ICICI Bank";
		iciciBank.ifscCodeString="ICICI00001";
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
