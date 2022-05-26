package question2;

public class Students {

	int salary;
	String stuNameString;
	double examFee = 1000;

	public void displayDetials() {
		System.out.println("Name : " + this.stuNameString);
	}

	public void payFee(double fee) {
		System.out.println("Pay Exam Fee : 1000");
		System.out.println("Remaing Amount : " + (this.examFee - fee));
	}

}

//Daily Scholler;
class DayScholar extends Students {
	double transportFee;

	DayScholar(int transportFee) {
		this.transportFee = this.transportFee;
	}

	@Override
	public void payFee(double fee) {
		System.out.println("Pay Fee Total : " + this.examFee + this.transportFee);
		System.out.println("Exam Fee : " + this.examFee);
		System.out.println("Hostel Fee : " + this.transportFee);
		System.out.println("Paid : " + fee);
		double remaining = this.examFee + this.transportFee - fee;
		if (remaining >= 0) {
			System.out.println("Remaing Amount : " + remaining);
		} else {
			System.out.println("Remaing Amount : 0.00");
			System.out.println("Extra Paid : " + -1 * remaining);
		}
	}
}

//Hostel boys;
class Hosteller extends Students {
	double hostelFee;

	Hosteller(int hostelFee) {
		this.hostelFee = hostelFee;

	}

	public void payFee(double fee) {
		System.out.println("Pay Fee TOtal : " + ((this.examFee + this.hostelFee)));
		System.out.println("Exam Fee : " + this.examFee);
		System.out.println("Hostel Fee : " + this.hostelFee);
		System.out.println("Paid : " + fee);
		double remaining = this.examFee + this.hostelFee - fee;
		if (remaining >= 0) {
			System.out.println("Remaing Amount : " + remaining);
		} else {
			System.out.println("Remaing Amount : 0.00");
			System.out.println("Extra Paid : " + -1 * remaining);
		}

	}

}