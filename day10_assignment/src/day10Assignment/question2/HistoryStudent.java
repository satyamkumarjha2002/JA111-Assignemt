package day10Assignment.question2;

public class HistoryStudent extends Student {
	@Override
	public int getPercentage() {
		return (historyMarks+civicsMarks) / 2;
	}
	
   HistoryStudent(String nameString,String addString){
	   super(nameString, nameString);
   }

	int historyMarks;
	public int getHistoryMarks() {
		return historyMarks;
	}

	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}

	public int getCivicsMarks() {
		return civicsMarks;
	}

	public void setCivicsMarks(int civicsMarks) {
		this.civicsMarks = civicsMarks;
	}

	int civicsMarks;
}
