package _01_PracticeConcept;

class Parent04
{
		public void display1()
	{
		System.out.println("display function with no agrument");
	}
		public void display1(int x,int y)
		{
			System.out.println("display function with values "+x+" "+y);
		}
}
class Child04 extends Parent04
{	
	public void display1()
	{
		System.out.println("display function overriden with no args");
	}
	
	public void display1(int x,int y)
	{
		System.out.println("display function overriden with values "+x+" "+y);
	}
	
	public void display2()
	{
		System.out.println("testing method");
	}
}

public class _04_MethodOverload_MethodOverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent04 ob1=new Parent04();
	//	ob.display1(); 
	//	ob.display1(11,22);	//display function overloaded
		
		Child04 ob= new Child04();
		ob.display1();
		ob1.display1(22,44);
	//	ob.display2();
	}

}
