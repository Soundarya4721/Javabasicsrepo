package strings;

public class StringReverse {

	public static void main(String[] args) {

		String s="Hello Everyone !! how are you?";
		 
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println(
				);
		//Reverse words
		String [] s1=s.split(" ");
		String spac=" ";
		for(int i=s1.length-1;i>=0;i--) {
			System.out.print(s1[i]+spac);
		}
	}

}
