package lab_13_10_2022;

public class NestedTry
{
	
	public static void main(String[] args) 
	{
	
		try
		{
			try
			{
				int[] arr= {1,2,3,4,5};
				System.out.println(arr[8]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			String s1 = null;
			System.out.println(s1.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		System.out.println("Nested try completed above successfully");
	}

}
