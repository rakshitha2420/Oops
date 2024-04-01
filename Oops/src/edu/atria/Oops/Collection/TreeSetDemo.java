package edu.atria.Oops.Collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
				Set<Integer> treeset = new TreeSet<Integer>();
				treeset.add(5);
				treeset.add(6);
				treeset.add(7);
				treeset.add(8);
				treeset.add(9);
				System.out.println("The elements are"+treeset);
				//ClasscastException
				//it only accepts the homogeneous datas
				//It gives sotred elements and printed
	
	}

}
