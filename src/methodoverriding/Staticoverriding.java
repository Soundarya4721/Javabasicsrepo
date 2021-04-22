package methodoverriding;


class Bike{
	  public void run() {
		System.out.println("static run method");
	}
}

public class Staticoverriding extends Bike {
	
//super()---to invoke the parent class constructor
	
	
	public void run(){
		System.out.println("normal method overloading");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//This covers run time polymorphism as well
	Bike b=new Staticoverriding();//upcasting
	b.run();
		
	}

}
