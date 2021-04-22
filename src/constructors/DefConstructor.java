package constructors;

public class DefConstructor {
	
	//Default constructor
	//invokes by default
	//a constructor cannot be static,final,abstract
	//A default constructor is used to provide default values of the constructor such as 0,null
	
	
	String name;
	int id;
	public DefConstructor() {
		
		System.out.println("its a default constructor");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Special type of method to initiailize object
		
		
		DefConstructor defu=new DefConstructor();
	
		System.out.println(defu.name);
		System.out.println(defu.id);
		
	}

}
