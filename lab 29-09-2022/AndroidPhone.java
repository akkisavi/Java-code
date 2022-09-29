package lab_29_09_2022.initial;

public class AndroidPhone 
{

	String Model;
	String Ram;
	String Color;


	public AndroidPhone(String model, String ram, String color) 
	{
		Model = model;
		Ram = ram;
		Color = color;
	}

	@Override
	public String toString() {
		return "AndroidPhone [Model=" + Model + ", Ram=" + Ram + ", Color=" + Color + "]";
	}
	
	
}
