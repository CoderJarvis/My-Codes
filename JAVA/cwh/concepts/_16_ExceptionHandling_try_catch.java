package _01_PracticeConcept;

import java.util.Scanner;

public class _16_ExceptionHandling_try_catch {

	public static void main(String[] args) {
		
		//we have to divide two numbers entered by the user
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two numbers");
		int a,b;
		
		
		
			a=sc.nextInt();
			b=sc.nextInt();
		
		
		//nut user can input anything
		//we have to handle user's unexpected errors
		
		try
		{
			
			int c=a/b;
			System.out.println("the result of a/b= "+a/b);
		}
		
		catch(Exception e)
		{
			System.out.println("i failed to devide  because->");
			System.out.println(e); //handled if b=0
		}

	}

}
