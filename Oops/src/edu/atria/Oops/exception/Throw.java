package edu.atria.Oops.exception;

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
         try {
			
			int a = 5/0;
			System.out.println(a);
			
			throw new Exception();
			//throw is used to give the exception
		}
		catch(Exception e) 
		
		{
			
			System.out.println("ohh....."+e);
		}
	}

}
