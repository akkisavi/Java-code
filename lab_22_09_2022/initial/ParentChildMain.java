package lab_22_09_2022.initial;

public class ParentChildMain {

	public static void main(String[] args) 
	{
		ParentBank p1 = new ParentBank();
		
		p1.withdrawMoney();
		p1.checkBalance();
		
		
		Child c1 = new Child();
		
		c1.withdrawMoney();
		c1.checkbalance();
	}

}
