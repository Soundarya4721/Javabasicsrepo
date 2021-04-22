package strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str1="Brag";  
	     String str2="Gra7";  
	     
	     if(str1.length()!=str2.length()) {
	     
	    	 System.out.println("non anagram");
	     }
	     
	     char [] chararray1=str1.toCharArray();
	     char[] chararray2=str2.toCharArray();
	     
	     Arrays.sort(chararray1);
	     Arrays.sort(chararray2);
	     if(Arrays.equals(chararray1, chararray1)==true) {
	    	 System.out.println("Anagaram");
	     }

	}

}
