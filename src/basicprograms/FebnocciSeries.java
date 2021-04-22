package basicprograms;

public class FebnocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//0 1 1 2 3 5 8 13
		
		int range=10,num1=0,num2=1;
		int sum;
    System.out.println(num1);
	for(int i=0;i<=range;i++) {
			sum=num1+num2;
			System.out.println(sum);
			num1=num2;
			num2=sum;
		}
	}

}
