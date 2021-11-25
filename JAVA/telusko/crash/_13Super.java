package teluskoCrash;


class A13
{
	A13()
	{
		System.out.println("super clas default constructor");
	}
	
	A13(int a)
	{
		System.out.println("super agrgumnt constructor");
	}
	
}

class A13_2 extends A13
{
	A13_2()
	{
		System.out.println("sub class default const");
	}
	A13_2(int a)
	{
		super(); //this super function is here explicitly with no aggmnt
		System.out.println();
		System.out.println("sub class argmnt constr ");
	}
}


public class _13Super {
	public static void main(String[] args) {
//		A13 ob1=new A13(5);
		A13_2 ob2=new A13_2(5);
	}
}
