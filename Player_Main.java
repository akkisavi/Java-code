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
	      

	    
	    Cricketer  c1 = new Cricketer();
	    c1.bat(56);
	    c1.ball(3);
	    
	    
	    p1.name("Messi");
	    p1.stadium("Wembley Stadium");
	    p1.fees(200000);
	    p1.role("Attacking Midfielder");
	    Footballer f1 = new Footballer();
	    f1.goal(3);
	    f1.saves(0);
	}

}
