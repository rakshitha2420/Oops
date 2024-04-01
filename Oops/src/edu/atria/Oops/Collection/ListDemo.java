package edu.atria.Oops.Collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // cant instantiate List  because it is a interface
	//	List l = new List();
		
		List l =new ArrayList();
		l.add(0,1);
		l.add(1,"Rahul");
		l.add(2,'M');
		l.add(3,98.9f);
		l.add(4,765434567);
		System.out.println(l);
		System.out.println("Element in the first index::\n"+l.get(2));
	//	System.out.println("Element in the 7 th index::\n"+l.get(7)); exception 
		
		System.out.println(l.contains("r"));
		System.out.println(l.size());
		l.add(5,"Rahul");
		System.out.println(l);
		l.add(6,null);
		System.out.println(l);
		l.clear();
		System.out.println(l);
	}

}
