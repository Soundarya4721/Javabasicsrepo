package abstraction;

public class Testabstractcls extends Vehicle {
	
	
	@Override
	public void type() {

		System.out.println("the type of the vehicle is twowheeler");
		
	}
	
	
	public void type(String value) {
		System.out.println(value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Testabstractcls test=new Testabstractcls();
		test.type();
		test.type("value");
		
	}

	

}
