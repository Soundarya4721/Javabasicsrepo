package methodoverriding;

public class MethodOverridingexmpl extends Car {
	
	String carversion="innova123";
	
	public void Speed(int milage,String Company) {
		System.out.println("the car speed is "+milage);

		super.model(carversion);
	}



	
	//If subclass have same method declared in 
	//parent class is called method overriding
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverridingexmpl me=new MethodOverridingexmpl();
		me.Speed(123, "Company");

		me.speed(123, "he;;");//this is from the parent class
	}

}
