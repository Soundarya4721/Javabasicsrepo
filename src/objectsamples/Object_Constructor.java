package objectsamples;

class Byconstructor{
	int a,b;
	public Byconstructor(int num1,int num2) {
		// TODO Auto-generated constructor stub
		a=num1;
		b=num2;
		System.out.println(num1+num2);
	}
}

public class Object_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initialise through constructor
		Byconstructor con=new Byconstructor(23,45);
		con.a=23;
		con.b=23;
		System.out.println(con.a);
	}

}
