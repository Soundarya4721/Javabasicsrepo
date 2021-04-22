package collections;

import java.util.ArrayList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(123);
		list.add(45);
		list.add(56);
		list.add(78);
		list.add(78);

		
		for(int num : list) {
			System.out.println(num);
		}
	}

}
