package question2;

public class Main {

	public static void main(String[] args) {
		DayScholar dayScholar = new DayScholar(500);
		dayScholar.stuNameString="Satyam";
		dayScholar.displayDetials();
		dayScholar.payFee(500);
		System.out.println("========================================");
		Hosteller hosteller = new Hosteller(1000);
		hosteller.stuNameString="Shivam";
		hosteller.displayDetials();
		hosteller.payFee(2500);
	}

}
