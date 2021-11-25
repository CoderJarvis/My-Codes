package JavaTelusko;

import java.util.Scanner;

public class _03Practice {
	public static void main(String[] args) {
		
		boolean a=true;
		boolean b=!false;		//boolean operator
		
		System.out.println(b);
		
		int e=10,d=340,c=1566;
		int j=(e>d && e>c)?e:d>c?d:c;	//ternary operator
		System.out.println(j);
		
		for(int i=1;i<=128;i++)
		{
			System.out.printf("%d : %c\n",i,i);	//print all ASCII values
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		System.out.println(sc.nextFloat());
		System.out.println(6.2/2);
	}

}
