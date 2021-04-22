package arrays;

public class PrintElementsOfAnArrayInEvenPosition {

	public static void main(String[] args) {

		int a[]= {2,4,6,8,10,12};
		
		int i=0;
		for(i=0;i<a.length;i=i+2) {
			
			System.out.println(a[i]);
			
		}
	}

}
