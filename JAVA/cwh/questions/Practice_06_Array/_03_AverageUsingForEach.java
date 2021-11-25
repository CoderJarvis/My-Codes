package com.Practice_06_Array;

public class _03_AverageUsingForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[]= {80,85,77,89,91};
		float sum=0;
		for(float a:marks)
		{
			sum=sum+a;
		}
		System.out.println(sum/marks.length);
		

	}

}
