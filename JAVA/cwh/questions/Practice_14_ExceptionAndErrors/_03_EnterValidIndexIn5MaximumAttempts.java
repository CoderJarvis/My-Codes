package com.Practice_14_ExceptionAndErrors;
//maximum tries is 5
//loop till got a valid index
//if didn't entered a valid index in 5 attempt print 'error.. u exceeded max tries'
import java.util.Scanner;

public class _03_EnterValidIndexIn5MaximumAttempts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
		int count=0;
		
		Scanner sc=new Scanner(System.in);
		while(true && count<5)
		{	
			System.out.println("enter index");
			int i=sc.nextInt();
			
			try
			{
				System.out.println("value present at the index "+i+" is "+arr[i]);
				break; //8(invalid) 10(invalid) 13(invalid) 30(invalid) 44(invalid) 2(value present 30)
			}
			
			catch(Exception e)
			{
				System.out.println("Invalid Index");
				count++;
			//	break; //1 2 3  55(invalid index)
			}
		}
		
		if(count>=5)			//this is for maximum tries
		{	System.out.println("error....u exceeded ur maximum tries"); }

	}

}
