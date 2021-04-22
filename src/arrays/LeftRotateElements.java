package arrays;

public class LeftRotateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,3,5,7,11};
		
		//no of times of rotation
		int n=1;
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
		
		System.out.println("=========Printing the rotated array===============");
		
		
		for(int i=0;i<n;i++) {
			int j,first;
			
			first=a[0]; //storing first element 
			for(j=0;j<a.length-1;j++) {
				
				a[j]=a[j+1];
				
			}
			a[j]=first;
		}
		
		System.out.println();  
        //Displays resulting array after rotation  
        System.out.println("Array after left rotation: ");  
        for(int i = 0; i< a.length; i++){  
            System.out.print(a[i] + " ");  
        }  
	}
	
}
