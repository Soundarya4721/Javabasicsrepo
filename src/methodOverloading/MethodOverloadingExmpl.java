package methodOverloading;

public class MethodOverloadingExmpl {
	
	
	//1) Method Overloading: changing no. of arguments

	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	//we can over load static method
	
	public static void add(double a,double c) {
		System.out.println(a+c);
	}
	
	public static void add(int a,int b,int c,int d) {
		System.out.println(a+b+c+d);
	}
	
	
	//Can we overload a main method---yes
	//but jvm pickup only the main method with string arguments
	
	public static void main() {
		System.out.println("ye.....");
	}
	
	public static void main(String ar) {
		System.out.println(ar);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test Method overload
		MethodOverloadingExmpl me=new MethodOverloadingExmpl();
		
		me.add(12, 13, 14);
		


	}

}
