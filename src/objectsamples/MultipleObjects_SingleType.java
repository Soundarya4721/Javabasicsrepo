package objectsamples;

public class MultipleObjects_SingleType {

	int l,b,h,perimeter;
	public void perimeter(int l,int b,int h) {
		this.l=l;
		this.b=b;
		this.h=h;
		perimeter=l*b*h;
		System.out.println("the perimeter is" +perimeter);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleObjects_SingleType ms=new MultipleObjects_SingleType(),ms2=new MultipleObjects_SingleType();
		ms.perimeter(10,12,3);
		ms2.perimeter(14, 13, 17);

	}

}
