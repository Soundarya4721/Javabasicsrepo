package abstraction;

public abstract class Vehicle {
	
	public Vehicle() {
		System.out.println("This is a vehicle class");
	}
	
	public abstract void type();
	
	public void features(String colour,String model) {
		System.out.println("The colour is " +colour);
		System.out.println("The model is "+model);
	}

}
