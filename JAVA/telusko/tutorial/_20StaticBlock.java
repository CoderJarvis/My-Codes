package JavaTelusko;

public class _20StaticBlock {
	static
	{
		System.out.println("this is the 1st static block");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("the value of i is : "+i);
	}
		static
		{
			System.out.println("this is the 2nd static block");
		}
		
	//static block executed before main function,in case of multiple blocks sequence come into picture	
	
static String i;
static	//thiss is the actual use of static block that is initialize a static variable
{
	i="iron man";
}
}
