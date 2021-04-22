package collections;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> tree=new TreeSet<Integer>();
		tree.add(23);
		tree.add(143);
		tree.add(345);
		tree.add(2);
		System.out.println(tree);
		for(int t : tree) {
			
			System.out.println(t);
		}

	}

}
