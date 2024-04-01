package edu.atria.Oops.abstraction;

public class AbstractClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   /*we cannot instantiate abstract class shape
    *  Shape s = new Shape();
    */
		//Dynamic binding
		Shape sOne = new Square(2.3f);
		sOne.calculateArea();
		sOne.display();
		
		Shape sTwo = new Rectangle(2.5f,7.8f);
		sTwo.calculateArea();
		sTwo.display();
	}

}
