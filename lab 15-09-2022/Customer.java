class Customer
{

	String name;
	String city;
	int id;
	
	static String role="Buyer";

//-------------Parameterized Consturctor------------

	Customer(String n, String c, int i)
	{
	name = n;
	city = c;
	id = i;
	}

//---------------Printing data-----------------

	void printData()
	{
	System.out.println("Name: " +name);
	System.out.println("City: " +city);
	System.out.println("Id: " +id);
	}
	
	void buyingStuff(String s)
	{
	System.out.println(name + " has bought " +s);
	}

//----------------Main Method-----------------

	public static void main(String[] args)
	{
	Customer c1 = new Customer("Raj","Kalyan",123);       //    Object creation no.1
	Customer c2 = new Customer("Manish","Mumbai",232);    //    Object creation no.2

	c1.printData();
	c1.buyingStuff("Chocalate");
	c2.printData();
	c2.buyingStuff("Books");
	
	
	}

}