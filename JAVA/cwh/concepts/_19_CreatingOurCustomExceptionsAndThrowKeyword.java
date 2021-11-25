package _01_PracticeConcept;

import java.util.Scanner;

class MaxAgeException extends Exception
{	
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "please enter the valid age";
}

@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "U have enetered the invalid age";
	}
}



public class _19_CreatingOurCustomExceptionsAndThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your age");
		Scanner sc =new Scanner(System.in);
		int age =sc.nextInt();
	if(age>100)
	{
		try
		{
			throw new MaxAgeException();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage()); //message shown to user
			System.out.println(e); //bydefault-e.toString()
		//	System.out.println(e.getStackTrace());
			
			
		}
	}
	
	else
	{
		if(age<18)
			System.out.println("u r a teenager");
		else if(age>=18 && age<60)
			System.out.println("u r adult");
		else if(age>60)
			System.out.println("u r old");
	}
	
	
	

	}

}
