package arrays;

public class FrequencyOfElementInanArray {

	public static void main(String[] args) {

		int[]a= {1,2,2,3,3,4,4,4,4,6,3,8};
		
		int visited=-1;
		
		int [] freq=new int[a.length]; //To store element frequencies
		
		for(int i=0;i<a.length;i++) {
			
			int count=1;


			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					count++;	
					freq[j]=visited;
				}
			}
			
				
				 if(freq[i]!=visited) {
					freq[i]=count;
				}
			
		}
		
		
		System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < freq.length; i++){  
        	 if(freq[i] != visited)  
                 System.out.println("    " + a[i] + "    |    " + freq[i]);  
        }
	}
}