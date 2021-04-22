package constructors;

public class ConstructorDefault {
	//constructor should have same name as class.it is similar to method
	//constructor cannot have a return type
	
	int i;
	String j;
	
	
	public ConstructorDefault() { //no-arg constructor
		// TODO Auto-generated constructor stub
		System.out.println("default constructor");
	}
	
	void print() {
		System.out.println(i);
		System.out.println(j);
	}
	
	
	public ConstructorDefault(int id,String password) {
		i=id;
		j=password;
		System.out.println(i);
		System.out.println(j);
	}    //constructor overloading
	
	public ConstructorDefault(String ja,int ce) {
		i=ce;
		j=ja;
		System.out.println(i);
		System.out.println(j);
	}
	
	public void display() {
		System.out.println(i);
		System.out.println(j);
	}
	
	
	public void print2() {
		System.out.println(i);
		System.out.println(j);	
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConstructorDefault con=new ConstructorDefault();//object
ConstructorDefault con2=new ConstructorDefault(1, "password");
con.print();
	con2.display();
	ConstructorDefault con3=new ConstructorDefault("divya", 123);
	con3.print2();
	}

}
