package _01_PracticeConcept;

class Phone05
{
	public void call()
	{
		System.out.println("phone has calling function");
	}
	
	public void camera()
	{
		System.out.println("phone has 2MP camera");
	}
	public void snakeGame()
	{
		System.out.println("u can play snake game");
	}
}

class SmartPhone05 extends Phone05
{
	public void camera()
	{
		System.out.println("smart phone has 64MP camera");
	}
	
	public void internet()
	{
		System.out.println("smart phone has internet");
	}
}

public class _05_DynamicMethod_Dispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone05 ob= new SmartPhone05(); //it's actually a smartphomne
		ob.call();//but,u r given this smartphone by saying it's a phone
		ob.camera();//so why would u use internet() because
	//	ob.internet();//u will assume it's just a phone
		ob.snakeGame();//but when u ll click pictures in its camera
	}					//it will be clicled in 64MP camera
						//beacuse its camera has been overriden(updated)
}
