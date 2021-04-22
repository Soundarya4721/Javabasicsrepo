package inheritance;

public class Employee {
	int Salary;
	String name;
	String empid;
	String Dept;
	
	public Employee(int Salary,String name,String empid) {
		this.Salary=Salary;
		this.name=name;
		this.empid=empid;
	}
	
	public  void printdetails() {
		System.out.println(Salary);
		System.out.println(name);
		System.out.println(empid);
	}

}
