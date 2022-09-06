import java.util.Scanner;
class PositiveNegativeWithMethod
{
      static void getNum(int n)
      {
         if(n>0)
        {
          System.out.println("Given number is positive");
        }
       else if(n<0)
       { 
        System.out.println("Given number is negative");
        }
       else
       {
        System.out.println("Given number is zero");
        }
      }
         
         public static void main(String[] args)
        {
        Scanner sc = new Scanner(System.in);
         
            //Taking user input

         System.out.println("Enter 1st number");
         int n1 = sc.nextInt();
         System.out.println("Enter 2nd number");
         int n2 = sc.nextInt();
         System.out.println("Enter 3rd number");
         int n3 = sc.nextInt();
         PositiveNegativeWithMethod.getNum(n1);
         PositiveNegativeWithMethod.getNum(n2);
         PositiveNegativeWithMethod.getNum(n3);
      }
     }
