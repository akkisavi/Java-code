import java.util.Scanner;
class MenuProgram
{
  static void add(int a,int b)
  {
  System.out.println(a+b);
  }
 
  static void multi(int a, int b, int c)
  {
  System.out.println(a*b*c);
  }
  
  static void sub(int a, int b)
  {
  System.out.println(a-b);
  }

public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 
  //Taking User Input
 
 System.out.println("Enter Your Choice 1.Addition 2.Multiplication 3.Subtraction");
 int n = sc.nextInt();
 System.out.println("Enter 1st Number");
 int a = sc.nextInt();
 System.out.println("Enter 2nd Number");
 int b = sc.nextInt();


switch(n)
         {
          case 1:
          MenuProgram.add(a,b);
          break;
           
          case 2:
          System.out.println("Enter 3rd Number just for multiplication");
          int c = sc.nextInt();
          MenuProgram.multi(a,b,c);
          break;
         
          case 3:
          MenuProgram.sub(a,b);
          break;
       
          default:
          System.out.println("Invalid option");
      }
   }
}     


          


   