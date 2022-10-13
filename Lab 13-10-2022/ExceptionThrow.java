package lab_13_10_2022;

class Exception2 extends Exception
{

	public Exception2()	
	{
		
	}
}

class ExceptionThrow
{
	static void checkNumber(int n) throws Exception2
	{
		if(n/2!=0)
		{
			throw new Exception2();
		}
		else
		{
			System.out.println("Number Positive");
		}
	}
	
	public static void main(String[] args) throws Exception2
	{
		checkNumber(10);
	}

}
