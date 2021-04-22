package arrays;

public class PrintDuplicateElements {

	public static void main(String[] args) {
		
		int[]a= {1,2,2,3,3,4,4,7,0,8,4,2,1};
		
		int visited=-1;
		
		 System.out.println("Duplicate elements in given array: ");  
	        //Searches for duplicate element  
	        for(int i = 0; i < a.length; i++) { 
	    		int count=1;

	            for(int j = i + 1; j < a.length;j++) {  
	                if(a[i] == a[j]) 
	                	count++;
	                	break;
	            }  
	            
	            if(count>1) {
	            	System.out.println(a[i+1]);
	            }
	        }  
	    }  

}
