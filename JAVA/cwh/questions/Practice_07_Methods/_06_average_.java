package com.Practice_07_Methods;

public class _06_average_ {
public static float average(int ...arr)
{
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		sum=sum+arr[i];
	}
	return sum/(float)arr.length;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(average(3,5,6,8));

	}

}
