package lab_22_09_2022.initial;

public class Child extends ParentBank 
{
	void withdrawMoney()
	{
		System.out.println("You have withdrawed Rs 100 from your part of parents account");
	}

	void checkbalance()
	{
		super.checkBalance();
		System.out.println("You have Rs 739 balance left from your part of parents account");
	}
}
