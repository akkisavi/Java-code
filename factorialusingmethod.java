import java.util.Scanner;
class factorial
{
	static void getFact(int n)
	{
	int i,fact=1;
	  for(i=1;i<=n;i++)
	{
	fact=fact*i;
	} 
	System.out.println("Factorial of "+ n +" is " + fact);
	}
	
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
	// Taking user input
 	
	System.out.println("Enter your number");
  	int n = sc.nextInt();

	//Calling method

	factorial.getFact(n);
	}
}																										
	
