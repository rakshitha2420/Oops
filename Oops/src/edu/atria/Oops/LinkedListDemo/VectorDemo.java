package edu.atria.Oops.LinkedListDemo;

import java.util.Vector;
public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Vector<Integer> number = new Vector();
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		
		//Calculate the size
		System.out.println("The size of the vector :"+number.size());
		
		//print the values
		System.out.println("The numbers are"+number);
		
		//foreach loop
		
		for(Integer value:number)
		{
			 System.out.println(value);
			
		}
		number.add(2,80);
	}

}
