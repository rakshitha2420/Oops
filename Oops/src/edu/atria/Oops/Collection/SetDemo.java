package edu.atria.Oops.Collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Set  set = new HashSet();
		//Hashset which gives the output is non order
		
	//if we use Linked HAshset it give ordered output
		set.add(5);
		set.add("atria");
		set.add(true);
		set.add(56.7);
		set.add(5);
		System.out.println("The elements in the set are"+set);
	}

}
