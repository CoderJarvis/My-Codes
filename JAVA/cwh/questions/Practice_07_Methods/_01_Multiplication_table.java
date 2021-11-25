package com.Practice_07_Methods;

public class _01_Multiplication_table {
	
	public static void mulTable(int x)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.printf("%d X %d = %d\n",x,i,x*i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mulTable(7);

	}

}
