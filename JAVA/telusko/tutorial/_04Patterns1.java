package JavaTelusko;

public class _04Patterns1 {
public static void main(String[] args) {
	
//	* * * *
//	* * * *
//	* * * *
//	* * * *
	
	
//	for(int i=0;i<4;i++)
//	{
//		for(int j=0;j<4;j++)
//			
//		{
//			System.out.print("* ");
//		}
//		System.out.println();
//	}
//	
	

//	* 
//	* *
//	* * * 
//	* * * *
	
//	for(int i=0;i<4;i++)
//	{
//		for(int j=0;j<=i;j++)
//		{
//			System.out.print("* ");
//		}
//		
//		System.out.println();
//	}
//	
	
//	* * * *
//	*     *
//	*     *
//	* * * *
	
	
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			if(i==0 || i==3 || j==0 || j==3)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
