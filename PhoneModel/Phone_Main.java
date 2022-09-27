package Assignment_practice.inital;

public class Phone_Main {

	public static void main(String[] args) 
	{
		Phone p1 = new Realme();

		p1.model();
		p1.camera();
		p1.storage();
		
		p1 = new IPhone();
		
		p1.model();
		p1.camera();
		p1.storage();
	
    }
}

