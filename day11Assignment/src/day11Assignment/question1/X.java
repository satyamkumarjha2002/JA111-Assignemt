package day11Assignment.question1;

public interface X {
  void absMethodOfX();
  default void defMethodOfX() {
	  System.out.println("Default Method Of X");
  }
  
  static public void  statMethodOfX() {
	  System.out.println("Static Method of X");
  }
  
}
