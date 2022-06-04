package day11Assignment.question1;

public interface Z extends X, Y {
  void absMethodOfZ();
  @Override
  default void defMethodOfX() {
	  System.out.println("override by Z default of X");
  }
  @Override
  default void defMethodOfY() {
		System.out.println("override by Z default of x");
	}
}
