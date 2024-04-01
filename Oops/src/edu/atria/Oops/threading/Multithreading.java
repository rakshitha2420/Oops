package edu.atria.Oops.threading;

class hii extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			
			System.out.println("Hiiii");
			try {
				
				Thread.sleep(200);
			}catch(Exception e) {}
		}
		
	}
}

class hello extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			
			System.out.println("Hellooo");
			
			try {
				
				Thread.sleep(400);
			}catch(Exception e) {}
		}
		
	}




}




public class Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		hii obj =new hii();
		hello objl =new hello();
		obj.start();
		try {
			
			Thread.sleep(200);
		}catch(Exception e) {}
		objl.start();
	}

}
