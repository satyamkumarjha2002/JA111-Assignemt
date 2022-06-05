package practicceEnum;

public enum Day {
	SUN {
		@Override
		public void info() {
			System.out.println("This is Sunday");
		}
	},
	MON {
		@Override
		public void info() {
			System.out.println("This is Monday");
		}
	},
	TUE {
		@Override
		public void info() {
			System.out.println("This is Tuesday");
		}
	},
	WED {
		@Override
		public void info() {
			System.out.println("This is Wednesday");
		}
	},
	THUR {
		@Override
		public void info() {
			System.out.println("This is Thrusday");
		}
	},
	FRID {
		@Override
		public void info() {
			System.out.println("This is Friday");
		}
	},
	SATUR {
		@Override
		public void info() {
			System.out.println("This is Saturday");
		}
	};

	public void info() {
		System.out.println("Days Name");
	}

	public static void main(String[] args) {
		Day day1=Day.FRID;
		day1.info();
		Day[] day = Day.values();
		for (Day d : day) {
			d.info();
		}
	}
}
