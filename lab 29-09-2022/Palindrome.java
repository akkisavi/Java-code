package lab_29_09_2022.initial;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String you want to check: ");
		String s = sc.nextLine();
		
		if(checkPalindrome(s))
		{
			System.out.println("Given string is palindrome");
		}
		
		else
		{
			System.out.println("Given string is not palindrome");
		}
		sc.close();
	}
		
		public static Boolean checkPalindrome(String s1)
		{
			int first = 0;
			int last = s1.length() - 1 ;
			
			while(first<last)
			{
				if(s1.charAt(first) != s1.charAt(last))
				{
					return false;
				}
				first++;
				last--;
			}
			return true;
	}

}
