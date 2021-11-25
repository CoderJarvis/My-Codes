package _01_PracticeConcept;

import java.util.Scanner;

class NegativeDimensionException extends Exception
{
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "u entered the invalid dimension";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The side of a square should be positive";
	}
	
	public void tryAgain()
	{
		System.out.println("please try agin");
	}//this is not overloaded
}



public class _20_CreatingOurCustomExceptions2AndThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the side of the square");
		Scanner sc=new Scanner(System.in);
		int side=sc.nextInt();
		
		if(side<=0)
		{
			try {
				throw new NegativeDimensionException();
			}
			catch(NegativeDimensionException e)
			{
				System.out.println(e.getMessage());
				System.out.println(e);
				e.tryAgain();//it's not the thing that only the 
			}//overloaded function u can call
		}
		else
		{
			System.out.println("Area of the square ="+side*side);
		}

	}

}
