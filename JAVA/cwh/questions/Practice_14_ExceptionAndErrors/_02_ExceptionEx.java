package com.Practice_14_ExceptionAndErrors;

public class _02_ExceptionEx {
	
	public static void age(int age) throws IllegalArgumentException
	{
		{	
		if(age<0 || age>100)
		{
			throw new IllegalArgumentException();
		}
		else
			if(age<18)
				System.out.println("u r ateenager");
			else if(age>=18)
			{
				System.out.println("u r adult");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=8;
		int b=0;
		try
		{
			System.out.println("the result is "+a/b);
		}
		catch(Exception e)
		{
			System.out.println("HaHa....Exception is"+e);
		}
		System.out.println();
		
		
		
	//	System.out.println("enter ur age");
		try
		{
			age(-10);
		}
		
		catch(Exception e)
		{
			System.out.println("HiHi...Exception is"+e);
		}

	}

}
