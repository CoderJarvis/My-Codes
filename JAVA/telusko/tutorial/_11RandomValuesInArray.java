package JavaTelusko;

import java.util.Random;

public class _11RandomValuesInArray {
	
	public static void main(String[] args) {
		Random r=new Random();
		
		int a[]=new int[50];
		
		for(int i=0;i<50;i++)
		{
			a[i]=r.nextInt(40);
		}
		
		for(int k: a)
		{
			System.out.println(k);
		}
		
		
	}

}
