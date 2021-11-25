package teluskoCrash;

class A14
{
	public void show()
	{
		System.out.println("in A");
	}
}

class A14_2 extends A14
{	@Override
	public void show()
	{	// super.show(); //by this u can access super class methods 
		System.out.println("in B");
	}
	
}
public class _14superkeywrd {
public static void main(String[] args) {
	
	A14_2 ob1=new A14_2();
	ob1.show();
}
}
