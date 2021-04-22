package objectsamples;

class Another{
	String name;
	int rollnum;
}



//storing object data through reference variable
public class Object_Reference_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Another an=new Another();//creating object for another class
		an.name="soundarya";
		an.rollnum=123466;
		
		
		Another an2=new Another();//can initialise multiple objects for the class 
		an2.name="sasi";
		an2.rollnum=36778;
		
		
		System.out.println(an.name);
		System.out.println(an.rollnum);
		
		System.out.println(an2.name);
		System.out.println(an2.rollnum);
		

	}

}
