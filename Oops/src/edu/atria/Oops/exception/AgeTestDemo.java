package edu.atria.Oops.exception;

import java.util.Scanner;

public class AgeTestDemo {
//method Creation 
	//static  is used that e=we dont need to create object
	static void validate(int age) throws InvalidAgeException  {
		
		if(age<18) {
			
			throw new InvalidAgeException("Invalid Age ,your not eligible to vote");
		}else {
			
			System.out.println("Your eligible to vote");
		}
	}
	

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int age;
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter your age");
  age = sc.nextInt();
  try {
	  
	  validate(age);
	  
  }catch (InvalidAgeException i) {
	  //getMessage which is used get the constructor internally
	  System.out.println("exception caught.........."+i.getMessage());
	  
  }
  sc.close();
	}

}
