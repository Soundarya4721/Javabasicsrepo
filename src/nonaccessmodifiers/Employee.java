package nonaccessmodifiers;

public class Employee {

 static int  empid;
	 static String empname;
	static String cmpny="5s";
	//constructor
	public Employee(int e,String r) {
		// TODO Auto-generated constructor stub
		
		empid=e;
		empname=r;
	}
	  static void printidcrd() {
		
		 cmpny="freee";
		 
		 
	 }
	static void display() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(cmpny);
	}
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee(123, "divya");
		Employee emp2=new Employee(134,"sree");
		emp1.printidcrd();
		
	emp1.display();
	
		

	}

}
