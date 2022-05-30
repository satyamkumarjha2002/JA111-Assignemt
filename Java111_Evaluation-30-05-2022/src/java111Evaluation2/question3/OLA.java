package java111Evaluation2.question3;

public class OLA {
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfKMs<=3) {
			Car hatchBack=new HatchBack();
			hatchBack.setNumberOfKms(numberOfKMs);
			return hatchBack;
		}
		else {
			Car sedan=new Sedan();
			sedan.setNumberOfKms(numberOfKMs);
			return sedan;
		}
		
	}
	public int calculateBill(Car car) {
		if(car.getNumberOfKms()>3) {
			Sedan sedan = (Sedan) car;
			return sedan.getNumberOfKms()*sedan.farePerKm;
		}else {
			HatchBack hatckBack=(HatchBack) car;
			return hatckBack.getNumberOfKms()*hatckBack.farePerKm;
		}
	}
}
