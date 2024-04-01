package edu.atria.Oops.threading;

class hii implements Runnable
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

class hello implements Runnable
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


public class RunnableInterface {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			
			hii obj =new hii();
			hello objl =new hello();
			
			Thread t1 = new Thread(obj);
			t1.start();
		
			try {
				
				Thread.sleep(200);
			}catch(Exception e) {}
			Thread t2 = new Thread(objl);
			t2.start();
			
			t1.setPriority(Thread.MAX_PRIORITY);
			System.out.println(t1.getPriority());
			
		}

	}


