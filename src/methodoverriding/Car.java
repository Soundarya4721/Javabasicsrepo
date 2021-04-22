package methodoverriding;

public class Car {
	
	
	public static void speed(int milage,String Company) {
		System.out.println(milage);
		System.out.println(Company);
	}
	
	public void model(String carversion) {
		System.out.println(carversion);
	}

}
