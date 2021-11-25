package JavaTelusko;

class A27
{
	public void show()
	{
		System.out.println("im original show of A");
	}
	
	public void show(int a)
	{
		System.out.println("im original show with int of A");
	}
}

class B27 extends A27
{
	public void show(int x)
	{
		
		System.out.println("show of B with int "); //this method is overriden with
													//of A 's show method
	}
	
}

public class _27PolymorphMethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		B27 ob =new B27();
		ob.show(3);
		
		
	}

}
