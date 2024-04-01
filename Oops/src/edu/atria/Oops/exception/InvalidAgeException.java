package edu.atria.Oops.exception;

//To demonstrate custom Exception
//Exception is a parent class  
public class InvalidAgeException extends Exception{
//constructor
	public InvalidAgeException()
	{
		super("Invalid Age");
	}	
	
	// parametric constructor
	public InvalidAgeException(String message)
	{
		super(message);
	}
}
