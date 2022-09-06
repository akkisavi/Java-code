import java.util.Scanner;
class CalculateBill
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);

	System.out.println("Choose from below option");

	System.out.println("1.Starter");
	int s = sc.nextInt();

	System.out.println("2.Main Course");
  	int m = sc.nextInt();

  	System.out.println("3.Desert");
  	int d = sc.nextInt();

   totalBill(s,m,d);
}
static void totalBill(int a, int b, int c)
{
int sum=a+b+c;
double x= 0.04*(sum);

System.out.println("Total Bill:"+sum);
System.out.println("Service Tax is:"+x);

	double netTotal=sum+x;

System.out.println("Net Total Bill:"+netTotal);
}
}
