package com.Practice_06_Array;

public class _01_SumOfElemts_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float arr[]= {1.0f,9.8f,6.5f,9.8f,5.4f};
		float sum=0.0f;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);

	}

}
