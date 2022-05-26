package com.masai;

public class VowelorConso {
     void check_char(char charecter) {
    	 if(charecter=='a'||charecter=='b'||charecter=='c'||charecter=='d'||charecter=='e'||charecter=='f'||charecter=='g'||charecter=='h'||charecter=='i'||charecter=='j'||
    	    charecter=='k'||charecter=='l'||charecter=='m'||charecter=='n'||charecter=='o'||charecter=='p'||charecter=='q'||charecter=='r'||charecter=='s'||charecter=='t'||charecter=='u'||
    	    charecter=='v'||charecter=='w'||charecter=='x'||charecter=='y'||charecter=='z'||
    	    charecter=='A'||charecter=='B'||charecter=='C'||charecter=='D'||charecter=='E'||charecter=='F'||charecter=='G'||charecter=='H'||charecter=='I'||charecter=='J'||
    	    charecter=='K'||charecter=='L'||charecter=='M'||charecter=='N'||charecter=='O'||charecter=='P'||charecter=='Q'||charecter=='R'||charecter=='S'||charecter=='T'||charecter=='U'||
    	    charecter=='V'||charecter=='W'||charecter=='X'||charecter=='Y'||charecter=='Z') {
    		 if(charecter=='a'||charecter=='e'||charecter=='i'||charecter=='o'||charecter=='u'
    		    	 ||charecter=='A'||charecter=='E'||charecter=='I'||charecter=='O'||charecter=='U') {
    		    		 System.out.println("Vowel");
    		    	 }else {
    					System.out.println("Consonant");
    				}
    	 }else {
			System.out.println("error");
		}
     }
	public static void main(String[] args) {
		VowelorConso fst_char=new VowelorConso();
		fst_char.check_char('a');
		fst_char.check_char('B');
		fst_char.check_char('2');
		
	}

}
