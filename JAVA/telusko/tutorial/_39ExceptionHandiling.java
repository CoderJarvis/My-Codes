package JavaTelusko;

public class _39ExceptionHandiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,k=0;
		j=0;
		i=8;
	
		
		try
		{
			k=i/j;
			
		
		}
		
		catch(Exception g)
		{
			System.out.println("cant devide by zero");
		}
		
		System.out.println(k);
		
	
		int arr[]=new int[4];
		
		try 
		{
			
			for(int m=0;m<6;m++)
			{
				arr[m]=m+1;
			}
			
			for(int p : arr)
			{
				System.out.println(p);
			}
			
		}
		
		catch (Exception e)
		{
			System.out.println("max no of elements are 4");
		}
		
		
		
		
	
	}

}
