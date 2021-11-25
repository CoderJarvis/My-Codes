package com.Practice_04_Conditional;

import java.util.Scanner;

public class _02_pass_fail {
	public static void main(String[] args) {
		System.out.println("enter marks of three subjects");
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a+b+c/3>=40 && a>=33 && b>=33 && c>=33)
			System.out.println("student is passed");
		else
			System.out.println("student is failed");
		
		
	}

}
