package day11Assignment.question1;

public class Zimpl implements Z {

	@Override
	public void absMethodOfX() {
		// TODO Auto-generated method stub

	}

	@Override
	public void absMethodOfY() {
		// TODO Auto-generated method stub

	}

	@Override
	public void absMethodOfZ() {
		// TODO Auto-generated method stub

	}

	@Override
	public void defMethodOfX() {
		System.out.println("overriden method of X ");
	}

	public static void main(String[] args) {

		Zimpl zimpl = new Zimpl();
		// method of x;
		zimpl.absMethodOfX();
		X.statMethodOfX();
		zimpl.defMethodOfX();
		System.err.println("****************");
		// method of y;
		zimpl.absMethodOfY();
		zimpl.defMethodOfY();
		Y.statMethodOfY();
		System.err.println("****************");
		// method of z;
		zimpl.absMethodOfZ();
		zimpl.absMethodOfX();
		zimpl.absMethodOfY();// these are also the method of y becuse z extends to x and y
		System.err.println("****************");
	}

}
