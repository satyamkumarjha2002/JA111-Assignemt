package practiceenum2;

public enum Enum {
	DELHI {
		@Override
		public void printInfo() {
			System.out.println("Welocme user you are in Capital");
		}
	},
	MUMBAI {
		@Override
		public void printInfo() {
			System.out.println("Welocme user you are in Mumbai");
		}
	},
	KOLKATA {
		@Override
		public void printInfo() {
			System.out.println("Welocme user you are in Kolkata");
		}
	},
	BANGLORE(100) {
		@Override
		public void printInfo() {
			System.out.println("Welocme user you are in Banglore");
			System.out.println("Number of tower is " );
		}
	},
	CHENNAI {
		@Override
		public void printInfo() {
			System.out.println("Welocme user you are in Chennai");
		}
	};

	public void printInfo() {
		System.out.println("Welocme user you are in city");
	}
	public int numberOftower;
	Enum(int numberOfTower){
		this.numberOftower=100;
	}
   Enum(){
	   this.numberOftower=50;
   }
}
