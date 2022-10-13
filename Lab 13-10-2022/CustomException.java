package lab_13_10_2022;

class UserDefinedException extends Exception
{

	public UserDefinedException(String s)	
	{
		super(s);
	}
}

	class CustomException
	{
		static void checkNum(int i) throws UserDefinedException
		{
			if(i>0)
			{
				throw new UserDefinedException("Not Correct Number");
			}
				
			else
			{
				System.out.println("Right Number");
			}
		}			
	
	
		public static void main(String[] args) throws UserDefinedException
		{
			try
			{
				checkNum(6);
			}
			catch(UserDefinedException e)
			{
				System.out.println(e.getMessage());
			}
		}
}