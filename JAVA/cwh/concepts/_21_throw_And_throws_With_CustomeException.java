package _01_PracticeConcept;



class NegativeRadiusException extends Exception
{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "you entered an invalid radius";
	}
}

class MaximumAgeException extends Exception
{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "You entered an invalid age";
	}
}

//as these 2 ERxceptions are Custom Exception i.e we made these
//so,computer dose not know the constraints i.e in what input
//it will throw this exception,so you have to define the condition
//in your function in if part and in else part u can give ur logic for
//correct input

public class _21_throw_And_throws_With_CustomeException {

	public static double circleArea(int r) throws NegativeRadiusException
	{
		if(r<=0)
		{
			throw new NegativeRadiusException();
		}
		else
		
		return Math.PI*r*r;
			
			
		
	}
	
	public static int divide(int x,int y) throws ArithmeticException
	{
		return x/y;
	}
	
	public static void getAge(int age) throws MaximumAgeException
	{
		if(age>100 || age<0)
		{
			throw new MaximumAgeException();
		}
		
		else
		{
			if(age<18)
				System.out.println("u r a teenager");
			else if(age>18 && age<60)
				System.out.println("u r an adult");
			else if(age>60)
				System.out.println("u r old");
		}
		
	}
	
	public static void main(String[] args)   {
		
	
		try {
			double d = circleArea(-2);
			System.out.println("area of the circle is "+d);
		} 
		catch (NegativeRadiusException e) {
			
			System.out.println(e);
		}
		
		
		
		
		
		try
		{
			int d1=divide(10,5);
			System.out.println("the result Is "+d1);
		}
		
		catch(Exception e) {
			System.out.println("some error occured ");
			
			
			
			
			
		}
		
		try {
			getAge(45);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
