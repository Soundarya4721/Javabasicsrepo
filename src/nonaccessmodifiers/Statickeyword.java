package nonaccessmodifiers;

public class Statickeyword {

static int square(int i) {
	return i*i;
	
}

static {
	System.out.println("static block");
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating multiple objects
		
		int result=Statickeyword.square(5);
		System.out.println(result);

	}

}
