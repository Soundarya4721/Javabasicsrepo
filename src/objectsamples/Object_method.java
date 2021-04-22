package objectsamples;

class Bymethod{
	
	int nums;
	String name;
	void method(String name,int num){
	this.name=name;
	this.nums=num;
}
	void displayinfo() {
		System.out.println(name+ " "+nums);
	}
}





public class Object_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize the object through method 
		Bymethod bm=new Bymethod();
		bm.method("soundarya", 456);
		bm.displayinfo();
		
		
		
	}

}
