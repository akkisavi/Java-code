package lab_06_10_2022;

public class Bank_Main {

	public static void main(String[] args) 
	{
		Bank b1 = new Bank();
		b1.interest();
		
		b1 = new Sbi();
		b1.interest();
		
		b1 = new Axis();
		b1.interest();
		
		b1 = new Icici();
		b1.interest();
	}

}
