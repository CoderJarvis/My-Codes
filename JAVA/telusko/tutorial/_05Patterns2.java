package JavaTelusko;

public class _05Patterns2 {
	
	public static void main(String[] args) {
		
//		1  2  3  4
//		2  3  4  1
//		3  4  1  2
//		4  1  2  3
		
//		for(int i=1;i<5;i++)
//		{
//			for(int j=1;j<5;j++)
//			{
//				int k=i+j-1;
//				
//				if(k<=4)
//					System.out.print(k+" ");
//				else 
//					System.out.print(k-4+ " ");
//			}
//			
//			System.out.println();
//		}
		
		
//		1
//		0  1
//		1  0 1
//		0  1  0  1
//		1  0  1  0  1
		
		
//		for(int i=1;i<6;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				if((i+j)%2==0)
//				System.out.print("1 ");
//				
//				else 
//					System.out.print("0 ");
//			}
//			
//			System.out.println();
//		}
		
		
		
//		1
//		2  2
//		3  3  3
//		4  4  4  4
//		5  5  5  5  5 
		
		for(int i=1;i<6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
