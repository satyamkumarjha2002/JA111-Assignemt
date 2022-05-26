package question4;

public class Demo {
	public static Bank getBank(String bank) {
		if(bank=="ICICI") {
			return new ICICIBank();
		}else if(bank=="Axis") {
			return new AxisBank();
		}
		return null;
	}
}
