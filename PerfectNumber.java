import java.util.Scanner;
class PerfectNumber
{
	public static void main(String[] args)
	{
	int sum=0;  
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the range you want to check the perfect number");

	System.out.println("Enter the upper limit");
	int u= sc.nextInt();

	System.out.println("Enter the lower limit");
	int l =sc.nextInt();
	
	while(l<=u/2)
	{
	if(u%l==0)
	{
	sum=sum+l;
	}
	l++;
	}
        if(sum==l)
	{
	System.out.println();
	}
System.out.println(u);
}	
}

