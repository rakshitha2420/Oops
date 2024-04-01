package Polymorphism;

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		System.out.println("............Method Overloading..........");
		System.out.println("Addition of two integers:"+MethodOverloding.add(20,40));
		System.out.println("Addition of two floats:" +MethodOverloding.add(3.5f, 4.7f));
		System.out.println("Addition of numbers:"+MethodOverloding.add(8,9.7f));
		System.out.println("Addition of numbers:"+MethodOverloding.add(9.9f,8));
		System.out.println("Addition of two strings:"+MethodOverloding.add("Method","Overloading"));
	}

}
