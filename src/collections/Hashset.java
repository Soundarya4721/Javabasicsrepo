package collections;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set=new HashSet<String>();
		set.add("sasi");
		set.add("soumi");
		set.add("sasi");
		set.add("soumi");
		System.out.println(set);
		for(String s : set) {
			System.out.println(s);
		}
	}

}
