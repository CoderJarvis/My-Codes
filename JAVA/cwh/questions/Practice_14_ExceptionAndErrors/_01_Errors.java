package com.Practice_14_ExceptionAndErrors;

import java.util.Scanner;

public class _01_Errors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		//Syntax Error
//		int a=b	//no semicolon
//		b=6;	//initialization without declaring
		
		//Logical Errors
		//print 1 t 10 prime numbers
		System.out.println(2);
		for(int i=1;i<5;i++)
		{
			System.out.println(i*2+1);
		}
		//it compiles and runs successfully
		//but wrong o/p //9 is not prime
		//wrong logic//this code is the logic of
		//printing odd numbers//logicalErrors difficult to find
		
		System.out.println("enter a integer");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt(); //input s//inpitMismatchException
		System.out.println("the number is "+a);
		System.out.println("enter ther value to be devided");
		int b=sc.nextInt();
		System.out.println("the number/b is "+a/b); //input 0//Arithmatic exception
	

	}

}
