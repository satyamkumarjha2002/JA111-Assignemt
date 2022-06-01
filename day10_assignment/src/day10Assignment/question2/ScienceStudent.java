package day10Assignment.question2;

public class ScienceStudent extends Student {
     @Override
      public int getPercentage() {
    	return (physicsMarks+chemistryMarks+mathsMarks)/3;
     }
     ScienceStudent(String nameString,String addString){
    	 super(nameString, addString);
     }
    int physicsMarks;
    int chemistryMarks;
    public int getPhysicsMarks() {
		return physicsMarks;
	}
	public void setPhysicsMarks(int physicsMarks) {
		this.physicsMarks = physicsMarks;
	}
	public int getChemistryMarks() {
		return chemistryMarks;
	}
	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}
	public int getMathsMarks() {
		return mathsMarks;
	}
	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
	int mathsMarks;
}
