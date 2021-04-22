package arrays;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\\
		
		String S="soundaryaa";
		char [] chararr=S.toCharArray();
		
		for(int i=0;i<S.length();i++) {
			
			int count=1;
			for(int j=i+1;j<S.length();j++) {
				
				if(chararr[i]==chararr[j]) {
					
					count++;
					
					chararr[j]=0;
					
				}
				
				else {
					count=1;
				}
				
				
			}
			
			System.out.println(chararr[i] + " "+count);
			
		}

	}

}
