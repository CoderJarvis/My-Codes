package com.Practice_06_Array;

public class _08_minimunValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,56,34,89,43};
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		System.out.println(min);

	}

}
