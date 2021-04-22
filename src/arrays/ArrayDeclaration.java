package arrays;


public class ArrayDeclaration {
	
	
	int a=1;
	int b=8;
	
	int c=a+b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];//declaration
		a[0]=1; //initialisation
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		//traverse
		System.out.println(a.length);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

		ArrayDeclaration cee =new ArrayDeclaration();
		System.out.println(cee.c);
		
		
	}

}
