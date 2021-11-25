package JavaTelusko;

interface A36
{
	public void show();
	
	default void display()
	{
		System.out.println("in display");
	}
	
	static void print()
	{
		System.out.println("in print");
	}
}

public class _36Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A36 ob=new A36()
				{
			public void show()
			{
				System.out.println("in show");
			}
				};
	ob.show(); //to execute a undefined metethod of interface near object creation
	ob.display(); //to execute a normal method using default in interface
	A36.print(); //to execute a static method in interface
	}

}
