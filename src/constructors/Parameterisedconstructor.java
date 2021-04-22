package constructors;

public class Parameterisedconstructor {
	
	String name;
	int id;
	
	public Parameterisedconstructor(String name,int id) {
		
		this.name=name;
		this.id=id;
		
		System.out.println(name);
		System.out.println(id);
		System.out.println("=======");

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parameterisedconstructor pc=new Parameterisedconstructor("sasi", 123);
		Parameterisedconstructor pc1=new Parameterisedconstructor("soumi",145);
	}

}
