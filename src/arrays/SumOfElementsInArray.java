package arrays;

public class SumOfElementsInArray {

	public static void main(String[] args) {

		int a[]=new int [] {1,6,7,4,9};
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
				
				sum=sum+a[i];
		
		}
		System.out.println(sum);
	}

}
