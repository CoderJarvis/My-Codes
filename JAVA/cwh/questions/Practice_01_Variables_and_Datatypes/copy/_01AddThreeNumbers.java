package com.Practice_01_Variables_and_Datatypes.copy;

import java.util.Scanner;

public class _01AddThreeNumbers {
	public static void main(String[] args) {
		System.out.println("enter three numbers");
		Scanner sc=new Scanner(System.in);
		
		int sum=sc.nextInt()+sc.nextInt()+sc.nextInt();
		
	//	System.out.println("the summetion of the three number is "+sc.nextInt()+sc.nextInt()+sc.nextInt());
		System.out.println("the summetion of the three number is "+sum);
}
}
