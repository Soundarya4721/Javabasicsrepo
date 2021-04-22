package arrays;

public class RotateRight {

	public static void main(String[] args) {

		int [] a=new int []{1,8,9,0,12,3};
		
		/**
		 * Print original array
		 */
		int n=3;
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
		
		
		for(int i=0;i<n;i++) {
			
			int j,last;
			
			last=a[a.length-1];
			
			for(j=a.length-1;j>0;j--) {
				
				a[j]=a[j-1];
			}
			
            a[0] = last;    

		}
		
		 System.out.println();    
         
	        //Displays resulting array after rotation    
	        System.out.println("Array after right rotation: ");    
	        for(int i = 0; i< a.length; i++){    
	            System.out.print(a[i] + " ");    
	        }    
		
	}

}
