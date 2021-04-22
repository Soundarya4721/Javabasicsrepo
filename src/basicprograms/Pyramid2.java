package basicprograms;

public class Pyramid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=6;
		for(int i=1;i<=num;i++) {
			for(int j=num;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
