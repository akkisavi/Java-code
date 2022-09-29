package lab_29_09_2022.initial;

public class AndroidPhonemain {

	public static void main(String[] args) 
	{
		AndroidPhone a1 = new AndroidPhone("Realme X Pro","16GB","Black");
		
		AndroidPhone a2 = new AndroidPhone("IPhone 13 Pro","8GB","White");
		
		AndroidPhone a3 = new AndroidPhone("Moto G3","4GB","Blue");
		
		AndroidPhone[] arr = new AndroidPhone[3];
				arr[0]=a1;
				arr[1]=a2;
				arr[2]=a3;
				
		for(AndroidPhone a : arr)	
		{
			System.out.println(a);
		}
	}

}
