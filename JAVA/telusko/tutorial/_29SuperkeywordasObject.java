package JavaTelusko;

class A29
{
	int i=100;
	
	public void Display()
	{
		System.out.println("super class A output");
	}
}

class B29 extends A29
{
	int i=10;
	
	public void show()
	{
		System.out.println("super class i value : "+super.i);
		System.out.println("sub class i value : "+i);
		
	}
	
	public void Display()
	{
		super.Display();
		System.out.println("subclass B output");
	}
	
	
}


public class _29SuperkeywordasObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B29 ob=new B29();
		ob.show();
		
		ob.Display();
		 
		
	}

}
