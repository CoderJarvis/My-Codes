package com.Practice_05_loop;

public class _07_FactorialWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int mul=1;
		int i=n;
		while( i>=1)
		{	
			mul=mul*i;
			i--;
		}
		System.out.println(mul);

	}

}
