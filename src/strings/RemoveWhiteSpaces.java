package strings;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		String s="Remove the white spaces";
		
		s=s.replaceAll("\\s+", "");
		
		System.out.println(s);
	}

}
