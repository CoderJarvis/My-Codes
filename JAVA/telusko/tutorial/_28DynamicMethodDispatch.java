package JavaTelusko;

class A28
{
	public void show()
	{
	System.out.println("in class a");
	}
}

class B28 extends A28
{
	public void show()
	{
		System.out.println("in class B");
	}
}
public class _28DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A28 ob=new B28(); //reference of class A and object of class B an be possible
		ob.show();
	}

}
