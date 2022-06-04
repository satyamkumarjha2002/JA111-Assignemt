package practicceEnum;

public enum Day {
	SUN(7), MON(8), TUE(19), WED(82), THUR(98), FRID(90), SATUR(87);
	private int vale;
	private  Day(int vale) {
		this.vale=vale;
	}
	
	public static void main(String[] args) {
		Day[] day= Day.values();
		System.out.println(Day.FRID.vale);
		for(Day d: day) {
			System.out.println(d.vale);
		}
	}
}
