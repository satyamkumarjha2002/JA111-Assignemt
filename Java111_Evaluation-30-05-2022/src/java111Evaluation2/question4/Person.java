package java111Evaluation2.question4;

public class Person {

	@Override
	public String toString() {
		return "Person [address=" + address + "]";
	}

	class Address {
		
		@Override
		public String toString() {
			return "Address [cityString=" + cityString + ", pincodeString=" + pincodeString + ", stateString="
					+ stateString + "]";
		}

		String cityString;
		String pincodeString;
		String stateString;
        //constuctor of address class;
		Address(String cityString,String picString,String stateString) {
              this.cityString=cityString;
              this.pincodeString=picString;
              this.stateString=stateString;
		}
	}

	String name;
	String gender;
	Address address;
}
