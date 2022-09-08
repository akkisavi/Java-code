// Program to check Prime number //

import java.util.Scanner;
class CheckPrimeNumberUsingMethod
{
	static void checkNum(int n)
	{
	int temp=0;
        {
	for(int i=2; i<=n-1; i++)
	{ 
	if(n%i==0)
		{
		temp=temp+1;
		}
	}
	}
	if(temp>0)
	{
	System.out.println("Given Number is not prime");
	}
	else
	{
	System.out.println("Given Number is prime");
	}
	}
   public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter any Number");
	int n = sc.nextInt();
   CheckPrimeNumberUsingMethod.checkNum(n);
    }
}