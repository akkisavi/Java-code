import java.util.Scanner;
class MethodOverloading
{
	void getPinPsCity(int n)
	{
	System.out.println("Your Pincode is: 421301");
	}
	
	void getPinPsCity(int n, int m)
	{
	System.out.println("Your Pincode is: 421301");
	System.out.println("Your Ps is: Kalyan Post Office");
	}
	
	void getPinPsCity(int n, int m, int o)
	{
	System.out.println("Your Pincode is: 421301");
	System.out.println("Your Ps is: Kalyan Post Office");
	System.out.println("Your City is: Kalyan Post");
	}
	
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	
		      //Taking user input

	System.out.println("Enter the number of data you want to print");
	System.out.println("1.Pincode");
	System.out.println("2.Pincode and Ps");
	System.out.println("3.Pincode, Ps and City");
	int c = sc.nextInt();


			//Creating Object

	MethodOverloading d1 = new MethodOverloading();

	switch(c)
	{
		case 1:
		d1.getPinPsCity(1);
		break;
		
		case 2:
		d1.getPinPsCity(1,2);
		break;
		
		case 3:
		d1.getPinPsCity(1,2,3);
		break;
		
	        default:
                System.out.println("Invalid option");
	}
   }
}