package _01_PracticeConcept;

public class _22_Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100,b=8;
		
		while(true)
		{
			try
			{
				System.out.println("the value of a/b is "+a/b);
			}
			
			catch(Exception e)
			{
				System.out.println("some error occured");
				System.out.println("the Exception is \n"+e);
				break;
				
			}
			finally {
				System.out.println("i am finally for the b value "+b);
			}
		b--;
		}

	}

}
