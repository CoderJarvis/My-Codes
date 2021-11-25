package JavaTelusko;

class A30
{
	public final void show()
	{
		System.out.println("in class A");
	}
}



//class B30 extends A30
//{
//	public void show() //final method can't be overriden
//	{
//		System.out.println("this method cant be executed as show() is a final method in super class A");
//	}
//}



public class _30FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int i=4;
	//	i++; //final variable once assigned cants be changed
		System.out.println(i);
	}

}
