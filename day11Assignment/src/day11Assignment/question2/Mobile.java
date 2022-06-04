package day11Assignment.question2;

public class Mobile {
	public void searchOutdatedModel(String...companyNames ) {
           for(int i=0;i<outdatedModels.length;++i) {
        	   if(companyNames[0]==outdatedModels[i]) {
        		   System.out.println(outdatedModels[i]+"_OUTDATED");
        		   return;
        	   }
           }
	}

	String[] outdatedModels = { "note4", "note5", "note6", "note7" };
	
	public static void main(String[] args) {
		
		Mobile mobile=new Mobile();
		mobile.searchOutdatedModel("note6");
		mobile.searchOutdatedModel("note10","fadsf");
	}
}
