package edu.atria.Oops.secondpackage;

import edu.atria.Oops.firstpackage.Base;

public class Executor extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base bOne = new Base();
       // System.out.println(bOne.varPrivate);
		//System.out.println(bOne.varDefault); default member is not visible outside the package
	//	System.out.println(bOne.varPublic);
		//protected also not visible otside the package 
		//System.out.println(bOne.getvarProtected());
		
		//Protected members r accessible otside the package by extending the base class
		
		Executor exe = new Executor();
		System.out.println(exe.varProtected);
		
		// public  is accessible everywhere
		System.out.println(exe.varPublic);
	}

}
