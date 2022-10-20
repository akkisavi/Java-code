package lab_20_10_2022.initial;

public class ThreadBasic {

	
	public static void main(String[] args) 
	{
	
		Thread t1= new Thread();
		System.out.println("Name= "+t1.getName());
		t1.start();
		t1.setName("Akshay");
		System.out.println("Name= "+t1.getName());

	}

}
