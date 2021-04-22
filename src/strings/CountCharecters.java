package strings;

public class CountCharecters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="programming is fun";
		
       String fi=s.replaceAll(" ", "");	
		//String fi=s.split(" ")
		char [] ch=fi.toCharArray();

		
		for(int i=0 ; i<fi.length();i++) {
			
			int count=1;
			for(int j=i+1;j<fi.length();j++)
			{
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='0';
				}
				
				
				
			}
			
 			if(ch[i]!='0') {
			System.out.println(ch[i]+" "+count);
		}
		}
		
		
	}

}
