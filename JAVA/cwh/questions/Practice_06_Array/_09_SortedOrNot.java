package com.Practice_06_Array;

public class _09_SortedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,56,93,85,4399};
		boolean b=true;
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{b=false;
			break;}
		}
		if(b==false)
		System.out.println("array is not sorted");
		else System.out.println("sorted");
		
		
		}
		

	}


