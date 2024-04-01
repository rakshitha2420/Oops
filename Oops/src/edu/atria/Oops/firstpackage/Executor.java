package edu.atria.Oops.firstpackage;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creting a object for base class
		Base bOne =new Base();
		System.out.println(bOne.varDefault);
		System.out.println(bOne.varPublic);
		//System.out.println(bOne.varPrivate); private members r not visible outside the class
		System.out.println(bOne.varProtected);
	}

}
