package strings;

public class Reverseofwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="programming is fun fact";
		String [] rev=str.split(" ");
		for(int i=rev.length-1;i>=0;i--) {
			
			System.out.println(rev[i]);
			
			
		}

	}

}
