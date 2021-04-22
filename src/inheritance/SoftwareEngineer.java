package inheritance;

public class SoftwareEngineer extends Employee {
	

	public SoftwareEngineer(int Salary, String name, String empid) {
		super(Salary, name, empid);
		System.out.println("this is the parent class constrctor");
	}

	public void printvalus() {
		//super to call the parent class method
		System.out.println(super.Dept);//this is parent class variable
		super.printdetails();
		//this is the parent class method
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	SoftwareEngineer se=new SoftwareEngineer(90000, "Soundarya", "535845");
	se.Dept="It";
	se.printvalus();
		
	}

}
