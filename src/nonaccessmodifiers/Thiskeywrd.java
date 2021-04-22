package nonaccessmodifiers;

public class Thiskeywrd {
	
	int name;
	int num;
	public Thiskeywrd(int name,int num) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.num=num;
		System.out.println(name);
		System.out.println(num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thiskeywrd ths=new Thiskeywrd(6788, 3456);
		

	}

}
