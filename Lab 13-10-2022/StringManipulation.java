package lab_13_10_2022;

public class StringManipulation {

	public static void main(String[] args) 
	{
		String s1 = "Akshay";
		String s2 = "Akshay";
		String s3 = new String ("Akki");
		String s4 = new String ("Akki");
		
		System.out.println(s1==s2);
		System.out.println(s3.equals(s4));
		System.out.println(s1.concat(s2));
		System.out.println(s1.replace("shay", "ki"));
		String s5 = "Hi i am intelligent";
		String[] s6 = s5.split("i");
		for(String s:s6)
		{
		System.out.print(s);
		}
		System.out.println();
		System.out.println(s1.charAt(4));
		System.out.println(s1.compareTo(s4));
		System.out.println(s3.substring(1,3));	
	
	}

}
