package arrays;

public class FrequencyOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Welcome to home";
		int count=0;
		
		
	
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='e') {
				count++;
			}
			
		}
		
		System.out.println("frequency " + count);

	}

}
