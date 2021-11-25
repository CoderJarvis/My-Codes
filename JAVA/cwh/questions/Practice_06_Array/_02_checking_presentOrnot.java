package com.Practice_06_Array;

public class _02_checking_presentOrnot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {64,75,43,97,53};
		int n=97;
		boolean b=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{	b=true;
			break;
			
				
			}
			
		}
		
		if(b)
			System.out.println("present");
		else
			System.out.println("not present");
	}

}
