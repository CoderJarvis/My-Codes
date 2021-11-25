package JavaTelusko;

interface a35
{
	public void show();  //in interface method can only be declaired
}						//object cant be created in interface

class b35 implements a35
{
	public void show()
	{
		System.out.println("show in class b");
	}
	
	public void display()
	{
		System.out.println("dislay in class b");
	}
}
public class _35Inteface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b35 ob=new b35();
		ob.display();
		ob.show();
		
		a35 ob1=new b35();
		ob1.show();
	//	ob1.display(); //restricted display() by creating reference of a class and object of b class
	}

}
