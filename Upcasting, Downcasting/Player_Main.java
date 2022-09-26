package Assignment_practice.inital;

public class Player_Main {

	public static void main(String[] args) 
	{

		Player p1 = new Player();
		
		p1.name("M.S.Dhoni");
		p1.stadium("Wankhede Stadium");
		p1.fees(1000000);
		p1.role("Wicket Keeper");
		
		p1 = new Cricketer();            //Upcasting
	    p1.name("Sachin Tendulkar");
	    
	    if(p1 instanceof Cricketer)                //DownCasting
	    {
	    	((Cricketer) p1).bat(34);
	    }
	}

}
