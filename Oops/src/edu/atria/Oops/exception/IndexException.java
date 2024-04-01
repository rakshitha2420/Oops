package edu.atria.Oops.exception;

public class IndexException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try {
			
			int a = 5/1;
			System.out.println(a);
			
			int arr[]= {2};
			arr[10]=25;
			
		}
		catch(Exception e) 
		//e is used to store the object ,we can give any kind of alphabets
		{
			
			System.out.println("ohh....."+e);
		}
	}

}
//if once the error occur in the block it came out of it