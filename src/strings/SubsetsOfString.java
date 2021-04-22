package strings;

public class SubsetsOfString {

	public static void main(String[] args) {

		String s="Fun";
		int len=s.length();
		int temp=0;
		
		String arr[]=new String[len*(len+1)/2];
		
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				
				arr[temp]=s.substring(i,j+1);
				temp++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
	}

}
