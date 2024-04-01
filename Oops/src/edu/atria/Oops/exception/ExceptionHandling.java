package edu.atria.Oops.exception;
//try catch exception

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			int a = 5/0;
			System.out.println(a);
			
			
		}
		catch(Exception e) 
		//e is used to store the object ,we can give any kind of alphabets
		{
			
			System.out.println("ohh....."+e);
		}
	}

}
