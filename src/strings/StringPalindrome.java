package strings;

public class StringPalindrome {

	public static void main(String[] args) {

		String s="Kanak";
		s=s.toLowerCase();
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		
		if(s.equals(rev)) {
			System.out.println("the string is a palindrone");
		}
		
		else {
			System.out.println("not palidnrome");
		}
	}

}
