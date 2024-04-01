package edu.atria.Oops.abstraction;

public class Rectangle extends Shape {
  float length,breadth;
  
  

public Rectangle(float length, float breadth) {
	super();
	this.length = length;
	this.breadth = breadth;
}



@Override
public float calculateArea() {
	// TODO Auto-generated method stub
	return area = length*breadth;
}
  
	
}
