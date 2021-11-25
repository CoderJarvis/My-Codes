package _01_PracticeConcept;

import java.util.Scanner;

public class _18_Nested_try_catch {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30};
		System.out.println("enter the index to know the value present at this index");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		
		try
		{
			try {
				System.out.println("the value at the index is "+arr[i]);
			}
			
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("the index u entered is out of range");
				System.out.println("the exception is ->"+e);
			}
			catch(Exception e)
			{
				System.out.println("some error occured");
				System.out.println(e);
			}
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
