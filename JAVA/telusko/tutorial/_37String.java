package JavaTelusko;

import java.util.Scanner;

public class _37String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the two strings");
		
		String s1,s2;
		
		Scanner sc=new Scanner(System.in);
		
		s1=sc.nextLine();
		s2=sc.nextLine();
		
		System.out.println("the length of the first string  : "+s1.length());
		System.out.println("the length of the second string : "+s2.length());
		
		s1=s1.concat(s2);
		
		System.out.println("the concardunation of two strings = "+s1);
		
		System.out.println("concartination of string in upper case = "+s1.toUpperCase());
	}

}
