package com.Practice_01_Variables_and_Datatypes.copy;

import java.util.Scanner;

public class _02CGPACalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the 5 subject marks");
		Scanner sc=new Scanner(System.in);
		int sum=sc.nextInt()+sc.nextInt()+sc.nextInt()+sc.nextInt()+sc.nextInt();
		System.out.println(sum);
		System.out.println("CGPA of the student= "+sum/50.0f);
		
	}

}
