package lab_20_10_2022.initial;

class Table
{  
	  
	synchronized void printTable(int n)
	 {  
	     for(int i=1;i<=10;i++)
	     {  
	      System.out.print(n*i+" ");   
	      try
	      {  
	      Thread.sleep(300);  
	      }
	      catch(InterruptedException e)
	      	{
	         System.out.println(e);
	        }  
	     }  
	  }  
} 	  
	class ThreadEx1 extends Thread
	{  
	Table t;  
	ThreadEx1(Table t)
	{  
	this.t=t;  
	}  
	public void run()
	{  
	t.printTable(2);  
	}  
	}
	
	class ThreadEx2 extends Thread
	{  
	Table t;  
	ThreadEx2(Table t)
	{  
	this.t=t;  
	}  
	public void run()
	{  
	t.printTable(4);  
	}
	}
	  
public class SynchronizedMethod
{
		public static void main(String args[])
		{  
		Table e = new Table();
		ThreadEx1 t1=new ThreadEx1(e);  
		ThreadEx2 t2=new ThreadEx2(e);  
		t1.start();  
		t2.start();  
		}  
}



