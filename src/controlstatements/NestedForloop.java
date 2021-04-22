package controlstatements;

public class NestedForloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//the nested for loop indicates loop inside the loop
		//the inner loop executes completely whenever the outer loop executes
		for(int i=1;i<=5;i++){
			for(int j=1;j<=3;j++) {
				System.out.println(i+" "+j);
			}
		}
	}

}
