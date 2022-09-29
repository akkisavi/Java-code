package lab_29_09_2022.initial;
import java.util.Scanner;

public class CakeShopKitchen 
{

	Shop getType()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Which cake do you want:");
		System.out.println("Red Velvet");
		System.out.println("ChocoLava");
		System.out.println("BlackForest");
		String s1 = sc.nextLine();
		
		sc.close();
		
		if(s1.equalsIgnoreCase("Red Velvet"))
		{
			return new RedVelvet();
		}
		
		else if(s1.equalsIgnoreCase("ChocoLava"))
		{
			return new ChocoLava();
		}
		
		else if(s1.equalsIgnoreCase("BlackForest"))
		{
			return new BlackForest();
		}
		
		else
		{
			return null;
		}
	}
}
