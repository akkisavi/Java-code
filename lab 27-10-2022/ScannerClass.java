package lab_27_10_2022;
import java.util.Scanner;  

public class ScannerClass 
{    
    public static void main(String args[])
    {       
        Scanner sc = new Scanner (System.in);  
   
        System.out.print("Enter the integer value: ");
        int x = sc.nextInt();  
        System.out.print("The integer value is: "+x);  
        System.out.println();
  
        System.out.print("Enter the double value: ");
        double y = sc.nextDouble();  
        System.out.print("The double value is: "+y);
        System.out.println();

        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        System.out.println(s);
        sc.nextLine();
        System.out.println();
        
        System.out.print("Enter the boolean value: ");
        boolean b = sc.nextBoolean();
        System.out.println("The boolean value is: "+b);  
        sc.close();  
        }   
    }
