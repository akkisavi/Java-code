package lab_13_10_2022;

public class BufferBuilder {

	public static void main(String[] args) 
	{

		StringBuffer s1 = new StringBuffer("Akshay");
		StringBuilder s2 = new StringBuilder("Akshay");
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.append(" Gosavi"));
		System.out.println(s1.insert(6," Gosavi"));
		System.out.println(s1.delete(2, 5));	
		System.out.println(s2.reverse());
	}

}
