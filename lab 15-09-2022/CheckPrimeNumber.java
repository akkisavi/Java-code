import java.util.Scanner;
class CheckPrimeNumber
{


  //-----------COUNTING TOTOAL NUMBER OF PRIME NUMBER--------------

	
	static void countPrime(int x, int y)
	{
	  int count=0;

         for(int i=x; i<=y;i++)
          {
		if (checkPrimeNumber(i) == true)
		{
		count=count+1;
		}
	}
	System.out.println("Total Number of Prime number between "+x+" and "+y+" is: "+count);
        }

//-------------Checking if the number is prime-----------------

	static boolean checkPrimeNumber(int n)
	{
           int temp=0;
      	   for(int i=2; i<=n-1;i++)
      	    {
      	      if(n%i == 0)
                	{
			temp=temp+1;
			}
	    }
			if(temp==0)
			return true;
			return false;
	}

//-------------Calculating lowest number--------------	
 
 	static int lowest(int x, int y)
	{
		if(x==y)
		{
		return x;
		}
	
		else if(x>y)
		{
		return y;
		}
	
		else
		{
		return x;
		}
	}

//-----------Calculating greatest number--------------
	
	static int greatest(int x, int y)
	{
		if(x==y)
		{
		return x;
		}
	
		else if(x>y)
		{
		return x;
		}
	
		else
		{
		return y;
		}
	}

//---------Main method-------------

	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);            //TAKING USER INPUT
        System.out.print( " Enter two number :" + " ");

	int a = sc.nextInt();
	int b = sc.nextInt();

	int ll = lowest(a,b);
	int ul = greatest(a,b);
	
	countPrime(ll, ul);
	}


}