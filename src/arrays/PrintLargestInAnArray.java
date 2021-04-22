package arrays;

public class PrintLargestInAnArray {

	public static void main(String[] args) {

		int[]a= {12,18,20,34,67};
		
		int largest=0;
		
		for(int i= 0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					largest=a[i];
					break; 
				}
				
				else {
					largest=a[j];
				}
			}
			
		}
		
		System.out.println(largest);

	}

}
