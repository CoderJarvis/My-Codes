package com.Practice_07_Methods;

public class _05_FibonacciRecursion {
	public static int fibonacci(int n)
	{
		if(n==1)
			return 0;
		else if (n==2)
			return 1;
		else
			return fibonacci(n-1)+fibonacci(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fibonacci(10));
		//0 1 1 2 3 5 8 13 21 34
	}

}
