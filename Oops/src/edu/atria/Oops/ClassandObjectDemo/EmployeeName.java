package edu.atria.Oops.ClassandObjectDemo;

import java.util.Scanner;

public class EmployeeName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee details..");
         int id = sc.nextInt();
         String name = sc.next();
        
         String department = sc.next();
         Float salary = sc.nextFloat();
         
         Employee eOne = new Employee();
         eOne.setId(id);
         eOne.setName(name);
         eOne.setDepartment(department);
         eOne.setSalary(salary);
         System.out.println(eOne);
         
         Employee eTwo = new Employee(id,name,department,salary);
         System.out.println(eTwo);
	}

}
