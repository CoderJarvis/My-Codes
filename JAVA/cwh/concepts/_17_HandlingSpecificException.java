package _01_PracticeConcept;

import java.util.Scanner;
//here we handle all exceptions specifically


public class _17_HandlingSpecificException {

	public static void main(String[] args) {
		int arr[]= {10,20,30};
		System.out.println("enter the index to know the value present at this index");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number you want to devide that number");
		int i=sc.nextInt();
		int b=sc.nextInt();
		try
		{
			System.out.println("the value at the index is "+arr[i]);
			System.out.println("the result "+arr[i]+" / "+b+" = "+arr[i]/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Java can't devide numbers with 0");
			System.out.println("Exception is "+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("the entered index is not in the specified range");
			System.out.println("Exceptione is "+e);
		}
		catch(Exception e)
		{
			System.out.println("Some other error occured");
			System.out.println("Exception is "+e);
		}
		finally
		{
			System.out.println("the session ended");
		}
//finally block executes always wheather the program has exceptions or not

	}

}
