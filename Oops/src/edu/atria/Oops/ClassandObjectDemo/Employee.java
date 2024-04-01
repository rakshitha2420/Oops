package edu.atria.Oops.ClassandObjectDemo;

public class Employee {
 private int id;
 private  String name;
 private String department;
 private  float salary;
 
  public Employee() {
	 System.out.println("Default constructer is called...");
  }
  
  public Employee(int id,String name,String department,float salary ) {
	  System.out.println("parameterized constructer is called..");
	  this.id=id;
	  this.name=name;
	  this.department=department;
	  this.salary=salary;
  }
  //getter and setters

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public float getSalary() {
	return salary;
}

public void setSalary(float salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
}
  
 
 }
