package lab_20_10_2022.initial;

class Thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.print(i+" ");
		}
	}

}


public class ThreadSchedule {

	public static void main(String[] args) 
	{
		Thread1 t1 = new Thread1();
		Thread1 t2 = new Thread1();
		Thread1 t3 = new Thread1();
		
		
		t1.start();
		t2.start();
		try
		{
		t2.join();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		t3.start(); 

	}

}
