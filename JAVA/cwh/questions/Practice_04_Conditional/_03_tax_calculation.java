package com.Practice_04_Conditional;

import java.util.Scanner;

public class _03_tax_calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float income; //in lakhs
		float tax=0;
		
		System.out.println("enter yur income");
		Scanner sc=new Scanner (System.in);
		income=sc.nextFloat();
		if(income < 2.5f)
		tax=0;
		else if( income >= 2.5f && income <5f)
			tax=0.05f*(income-2.5f);
		else if(income >=5.1f && income <=10f)
		{
			tax=0.5f*(5f-2.5f);
			tax=tax+ 0.2f*(income-5f);
		}
		else if(income>=10.1)
		{
			tax=0.5f*(5f-2.5f);
			tax=tax+0.2f*(10f-5f);
			tax=tax+0.3f*(income -10f);
		}
		
		System.out.println("tax given by the person is "+tax+"lakhs");
			
				
				
		
	}

}
