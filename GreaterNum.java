import java.util.Scanner;
class GreaterNum
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
// Taking 1st user input
System.out.println("Enter 1st number");
int num = sc.nextInt();

Scanner next = new Scanner(System.in);
//Taking 2nd user input

System.out.println("Enter 2nd number");

int num2 = next.nextInt();

if (num>num2)
{
System.out.println(" 1st Number is greater");
}
else if(num2>num)
{
System.out.println(" 2nd Number is greater");
}

else
{
System.out.println("equal");
}

}
}
