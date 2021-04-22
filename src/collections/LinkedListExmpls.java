package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExmpls {

	public static void main(String[] args) {
		
		LinkedList<String> lli=new LinkedList<String>();
		lli.add("Bat");
		lli.add("Cat");
		lli.add("rat");
		lli.add("sweet");
		
		System.out.println(lli);
		
		for(String str:lli) {
			System.out.println(str);
		}

		
		LinkedList<Integer> inttt=new LinkedList<Integer>();
		inttt.add(123);
		inttt.add(675);
		inttt.add(907);
		System.out.println(inttt);
		
		for(int drf:inttt) {
			System.out.println(drf);
		}
		
		Iterator<Integer> i= inttt.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
