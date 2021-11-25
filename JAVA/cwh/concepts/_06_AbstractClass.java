package _01_PracticeConcept;

abstract class PhoneGen1
{
	
	public void calling()
	{
		System.out.println("this phone has calling function");
	}
	
	abstract public void camera();
	abstract public void gaming();
	abstract public void calculator();
	abstract public void internet();
}

abstract class PhoneGen2 extends PhoneGen1
{
	public void camera()
	{
		System.out.println("this phone has camera");
	}
	
	public void gaming()
	{
		System.out.println("this phone has games");
	}
	
	public void videocall()
	{
		System.out.println("this phone has extra video call feature");
	}
}

class PhoneGen3 extends PhoneGen2
{
	public void calculator()
	{
		System.out.println("this computer has a calculator");
	}
	
	public void internet()
	{
		System.out.println("the phone has internet connection");
	}
	
	public void light()
	{
		System.out.println("this phone has flashLight");
	}
}
public class _06_AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PhoneGen3 ob=new PhoneGen3();
		ob.calling();
		ob.gaming();
		ob.videocall();
		ob.internet();
		ob.light();
		System.out.println();
		
		PhoneGen1 ob1=new PhoneGen3(); //NOTE
		ob1.internet();
		PhoneGen2 ob2=new PhoneGen3();
		ob2.calling();
		
		//cant instantiates abstract class objects
		//NOTE-here no dynamic method dispatch occures because it is abstract type classes
		//the grandchild class knows all the abstract methods of parent class which are
		//declared in parent class without definitions
		//here parent class & child class are the abstract class
		//and only the grandchild class is the concrete class
		//so whatever parent class's reference is there on the left side,
		//but in the right side only grandchild class's object can be creted
		//and he is the god,that object knows everything
									
		
	}

}
