package com.practice_02_Operators_and_Expressions;

import java.util.Scanner;

public class _03_GreaterOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter a number you want to check");
		Scanner sc=new Scanner(System.in);
		if(10>sc.nextInt())
			System.out.println("greater");
		else 
			System.out.println("smaller");
	}

}
