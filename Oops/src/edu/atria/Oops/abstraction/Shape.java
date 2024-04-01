package edu.atria.Oops.abstraction;

public abstract class Shape {

	 float area;
	//abstract method
	 public abstract float calculateArea();
	 
	 
	 //non abstract method
	/* public  static final void display() {
		 
		 System.out.println("Area of the shape:"+area);
	 }*/
	 
	 public void display() {
		 
		 System.out.println("Area of the shape:" +area);
	 }
}
