package controlstatements;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int speed=8;
		
		switch(speed) {
		case 1: 
		System.out.println("the speed is low");
		break;
		
		case 5:
	    System.out.println("the speed is normal");
	    break;
	    
		case 7:
		System.out.println("the speed is high");
		break;
		
		default:
			System.out.println("the speed should be in 5");
		}

	}

}
