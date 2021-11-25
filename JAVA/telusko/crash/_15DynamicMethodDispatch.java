package teluskoCrash;
class A15
{
	public void show()
	{
		System.out.println("class a");
	}
}

class B15 extends A15
{
	public void show()
	{
		System.out.println("class b");
		
	}
	
}

class C15 extends A15
{
	public void show()
	{
		System.out.println("class c");
	}
}
public class _15DynamicMethodDispatch {
public static void main(String[] args) 
{//reference A class but object of C class
	A15 ob=new B15(); //runtime polymorphism
	//ob.show();
	
	ob=new C15();
		ob.show();	//dynamic method dispatch
	
	
	
}
}
