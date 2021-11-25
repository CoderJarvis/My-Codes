package com.Practice_06_Array;

public class _07_greaterValue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,56,34,89,43};
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println(max);

	}

}
