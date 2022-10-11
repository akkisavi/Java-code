package Assignment_practice.inital;
import java.util.Scanner;

public class Employee 
{
	
	static void SetEmpID(int id)
	{
	Employee.GetEmpID(id);
	}
	
	static int GetEmpID(int id)
	{
		System.out.println("Employee ID is : "+id);
		return id;
	}
	
	static void SetEmpName(String n)
	{
		Employee.GetEmpName(n);
	}
	
	static String GetEmpName(String emp)
	{
	 System.out.println("Employee Name is "+emp);
	return emp;
	}
	
	static void SetNoOfHoursWorked(double hw)
	{
		
		Employee.GetNoOfHoursWorked(hw);
	}
	
	static double GetNoOfHoursWorked(double hw)
	{
		System.out.println("Employee has worked "+hw+" hours");
		return hw;
	}
	
	static void SetHourlyPrice(double hp,double hw)
	{
		Employee.GetHourlyPrice(hp,hw);
	}
	static double GetHourlyPrice(double hp,double hw)
	{
		double s2=0;
		double s1= hp*hw;
		if(s1>30000)
		{
			s2=((s1/100)*5);
			s1=s1-s2;
			System.out.println("Employee gets Paid Rs"+s1);
			System.out.println("Tax is 5% if the salary is more than 30000 so 5% of "+s1+" is "+s2);
		}
		else
		{
		System.out.println("Employee gets paid Rs"+s1);
		}
		return s1;
	}
	
	

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Id:");
		int empID=sc.nextInt();
		System.out.print("Enter Employee Name: ");
		String empName=sc.next();
		System.out.print("Enter number of hours employee has worked: ");
		double noOfHoursWorked=sc.nextInt();
		System.out.print("Enter Hourly price: ");
		double hourlyPrice=sc.nextInt();
		
		Employee.SetEmpID(empID);     
		Employee.SetEmpName(empName);
		Employee.SetNoOfHoursWorked(noOfHoursWorked);
		Employee.SetHourlyPrice(hourlyPrice, noOfHoursWorked);
		
		sc.close();
	}
	
}
