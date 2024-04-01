package edu.atria.Oops.Collection;

public class LambdaWithoutParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Statement s = ()-> { return "Helloo";};
		System.out.println(s.greet());
	isOdd odd = (a) ->   a%2 == 0?true:false;
	System.out.println(odd.checkOdd(5));
	}

}
