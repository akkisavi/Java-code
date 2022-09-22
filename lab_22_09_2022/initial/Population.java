package lab_22_09_2022.initial;

public class Population 
{
	

	static void displayData(int y1, int y10)
	{
		System.out.println("Inital population on 1st year was: "+y1);
		
		System.out.println("Population after a decade is :"+262500);
		
		int d=y10-y1;
		
	    System.out.println("Popluation increased in this decade is:"+d);
	    
	}
	
	static void calculatePop(int i, int l, int d)    //i is 1st year pop, l is pop after decade, d  i the difference in a decade
	{
		int x = d*100;           					// multiplying the differnence into 100
		
		int c = x/175000;							// Percent of decade i.e 50%
		
		int py = c/10;                              // Average increase of pop per year
		
		System.out.println("Average percent of increase in population  per year is: "+py+"%");
	}
	
	public static void main(String[] args)
	{
		
		displayData(175000, 262500);
		
		calculatePop(175000, 262500, 87500);
		
		
	}
}
