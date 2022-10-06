package lab_06_10_2022;

public class PersonMain {

	public static void main(String[] args) 
	{
	
		Person p1 = new Person();
		p1.personID();
		p1.pName();
		
		Student s1 = new Student();
		s1.personID();
		s1.pName();
		s1.marks();
		
		Emp e1 = new Emp();
		e1.personID();
		e1.pName();
		e1.salary();
	}

}
