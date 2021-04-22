package strings;

public class CountVowelsConsonents {

	public static void main(String[] args) {

		String str = "This is a really simple sentence"; 
		str.toLowerCase();
		
		int vcount=0,ccount=0;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)!=' ') {
				
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o'||str.charAt(i)=='u') {
					vcount++;
				}
				
				else {
					ccount++;
				}
			}
			else {
			}
			
		}
		System.out.println("The vowel count is "+ vcount);
		System.out.println("The vowel count is "+ ccount);

	}

}
