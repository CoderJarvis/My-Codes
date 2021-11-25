package com.Practice_04_Conditional;

import java.util.Scanner;

public class _04_DayWithSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("enter thr number");
		Scanner sc=new Scanner(System.in);
		switch(sc.nextInt())
		{
		case 1 -> System.out.println("monday");
		case 2 -> System.out.println("Tuesday");
		case 3 -> System.out.println("Wednessday");
		case 4 -> System.out.println("thrusdaty");
		case 5 -> System.out.println("friday");
		case 6 -> System.out.println("saturdaty");
		case 7 -> System.out.println("sunday");
		}

	}

}
