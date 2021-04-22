package arrays;

public class CopyArray {

	public static void main(String[] args) {

		int a[]= {1,12,13,78,78,34};
		int b[]=new int[a.length];
		
//System.arraycopy(a, 0, b, 0,a.length);//Even this function works 
		
		for(int i=0;i<a.length;i++) {
			
			b[i]=a[i];//simply assign the value to copy the array or we cn use a clone method
			System.out.println(b[i]);
		}
		
		System.out.println();
		
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
