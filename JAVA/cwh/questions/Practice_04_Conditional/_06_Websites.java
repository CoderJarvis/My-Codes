package com.Practice_04_Conditional;

import java.util.Scanner;

public class _06_Websites {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the website");
		String s=sc.nextLine();
		if(s.endsWith(".com"))
			System.out.println("commercial website");
		else if(s.endsWith(".org"))
			System.out.println("organisation website");
		else if(s.endsWith(".in"))
			System.out.println("indian website");
	}

}
