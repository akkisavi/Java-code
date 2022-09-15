class AvgSalary
{

//------------Calculation method-----------------

	
	static void calAvg(int a, int b, int avg)
	{
	
//--------------Printing Details-----------------

	System.out.println("Salary of 1st employee is: "+a);
	System.out.println("Salary of 2nd employee is: "+b);
	System.out.println("Average Salary of all employee is: "+avg);

//-----------Calculation-----------------

	int c=(avg*3-(a+b)); //Calculating Salary of 3rd Employee	
	
	System.out.println("Salary of third Employee is: " +c);

	}
	
//---------------------Main Method----------------------	


	public static void main(String[] args)
	{
	int e1 = 11000;    // Salary of 1st employee
	int e2 = 5000;     // Salary of 2nd employee
	int e3;	   	   // Salary of 3rd employee
	int a= 10000;    // Average salary of three employee

	calAvg(e1,e2,a);
	
	}
}