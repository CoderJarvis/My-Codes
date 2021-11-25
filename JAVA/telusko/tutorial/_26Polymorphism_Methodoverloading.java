package JavaTelusko;

class A26
{
	public void show()
	{
		System.out.println("only show");
	}
	
	public void show(int a)
	
	{
		System.out.println("show with int");
	}
	
	public void show(int a,String s)
	{
		System.out.println("show with int and string");
	}
}

public class _26Polymorphism_Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A26 ob=new A26();
		ob.show(4,"sawat");
	}

}
