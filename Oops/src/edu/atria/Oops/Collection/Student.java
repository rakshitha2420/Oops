package edu.atria.Oops.Collection;

//compable important 
public class Student implements Comparable<Student> {

	private int rollNo;
	private String name;
	private float per;
	
	//Parametric constructor
	public Student(int rollNo, String name, float per) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.per = per;
	}

  //geters and setter
	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}


	  //to String method
		@Override
		public String toString() {
			return "Student [rollNo=" + rollNo + ", name=" + name + ", per=" + per + "]";
		}
  



	@Override
	public int compareTo(Student anotherStudent ) {
		// TODO Auto-generated method stub
		if(this.per==anotherStudent.per) 
		  return 0;
		else if(this.per>anotherStudent.per)
		  return 1;
		else 
		   return -1;
		
	}

  
   
	

}


// comparable interface concept important 