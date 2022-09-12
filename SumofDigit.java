import java.util.Scanner;
class SumofDigit
{
 	static void addNum(int n)
	{
	int sum = 0;
        while(n>=1)   //Loop will run till it reaches 1
	{
	    sum=sum+n%10; 
	    n=n/10;
	}
	System.out.println("Sum of the digit is:" +sum);		
	}
 public static void main(String[] args)
	{
	 Scanner sc = new Scanner(System.in);   
	 System.out.println("Enter Any Number");    //Taking user input
	 int n = sc.nextInt();
	 SumofDigit.addNum(n);    //Calling method
     } 
}  
        