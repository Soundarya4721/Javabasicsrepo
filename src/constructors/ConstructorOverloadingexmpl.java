package constructors;

public class ConstructorOverloadingexmpl {
	
	String name;
	int id;
	char grade;
	
	public ConstructorOverloadingexmpl(int id,String name) {
		
		this.id=id;
		this.name=name;
		
		System.out.println(id);
		System.out.println(name);
		System.out.println("=======");

		
	}
	
	public ConstructorOverloadingexmpl(char grade,String name) {
		this.grade=grade;
		this.name=name;
		
		System.out.println(grade);
		System.out.println(name);
		System.out.println("========");
	}
	
	public ConstructorOverloadingexmpl(int id,char grade,String name) {
		
		this.id=id;
		this.grade=grade;
		this.name=name;
		
		System.out.println(id);
		System.out.println(grade);
		System.out.println(name);
		System.out.println("=========");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
ConstructorOverloadingexmpl con=new ConstructorOverloadingexmpl('c', "sasi");
ConstructorOverloadingexmpl con1=new ConstructorOverloadingexmpl(123, "Soumi");
ConstructorOverloadingexmpl con2=new ConstructorOverloadingexmpl(435, 'a', "Tej");

	}

}
