package controlstatements;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//leap year should be divisible by 4,400 but not by 100
		int a=2021;
	
		if(a%4==0||a%400==0&&a%100!=0) {
			System.out.println("leap year");
		}
		else {
			System.out.println("non leap year");
		}
	}
		

}
