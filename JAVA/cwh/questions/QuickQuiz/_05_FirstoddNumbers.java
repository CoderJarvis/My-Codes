package _02_QuickQuiz;

import java.util.Scanner;

public class _05_FirstoddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the last natual number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
				System.out.println(i+" ");
		}
	}

}
