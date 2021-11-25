package com.Practice_14_ExceptionAndErrors;

import java.util.Scanner;

class MaxRetryReachedException extends Exception
{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Sorry,your maximum retries exceeded";
	}
}

public class _04_MaxRetryReachedException {

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
		
		
		if(count>=5)	
			System.out.println("error u have crossed ur max retriiiiiiiies");//this is for maximum tries
			
		
		
		
	}

}
