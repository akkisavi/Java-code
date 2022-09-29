package lab_29_09_2022.initial;

public class CakeShopMain
{
	public static void main(String[] args)
	{
		
	Shop s = new CakeShopKitchen().getType();
	
	Waiter w = new Waiter();
	
	if(s!=null)
	{
		w.order(s);
	}

	else
	{
		System.out.println("Sorry we don't have this flavour of cake");
	}
	
 }
}