package _01_PracticeConcept;

class Parent03
{
	public Parent03()
	{
		System.out.println("I am Parent class default constructor");
	}
	
	public Parent03(int x)
	{
		System.out.println("I am Parent cls constructor with 1 agruments with value "+x);
	}
}

class Child03 extends Parent03
{
	public Child03()
	{
		System.out.println("I am child class default constructor");
	}
	
	public Child03(int x,int y)
	{	
		super(y);
		System.out.println("I am child clss constructor with 2 agruments and values "+x+" "+y);
	}
}

class GrandChild03 extends Child03
{
	public GrandChild03() 
	{
		System.out.println("I am grandchild class default construtor");	
	}
	public GrandChild03(int x,int y,int z)
	{	super(y,z);
		System.out.println("I am grandchild cls constructor with 3 agruments and values "+x+" "+y+" "+z);
	}
}

public class _03_ConstructorsInInheritanceWithSuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Parent03 ob= new Parent03();
	//	Child03 ob=new Child03(6,7);
	//	GrandChild03 ob=new GrandChild03(1,2,3);
		GrandChild03 ob=new GrandChild03(5,100,7000);
		

	}

}
