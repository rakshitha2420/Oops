package edu.atria.Oops.inheritancedemo;

public class Student extends Citizen {
	

		// TODO Auto-generated constructor stub
	
	private int id;
	private String name;
	private String department;
	
	 public Student(long aadharNo, String nationality, String address, String dob, char gender,int id,String name,String department) {
			super(aadharNo, nationality, address, dob, gender);
			
			this.id =id;
			this.name =name;
			this.department=department;
			
			
			
		
	 }

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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department=" + department + ", getAadharNo()="
				+ getAadharNo() + ", getNationality()=" + getNationality() + ", getAddress()=" + getAddress()
				+ ", getDob()=" + getDob() + ", getGender()=" + getGender() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	}
	
	

