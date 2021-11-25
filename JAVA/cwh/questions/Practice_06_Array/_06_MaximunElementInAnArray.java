package com.Practice_06_Array;

public class _06_MaximunElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {19,75,85,84,97,53,67};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>arr[0])
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	
	}
}
