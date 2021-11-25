package _01_PracticeConcept;

class MyThread11 extends Thread
{
	public MyThread11(String s)
	{
		super(s);
	}
	public void run()
	{
		while(true)
		{
			System.out.println(getName());
		}
	}
}

public class _11_ConstructorInTgread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread11 t1=new MyThread11("samay raina");
		MyThread11 t2=new MyThread11("tanmay bhat");
		
	//	t1.start();
	//	t2.start();
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		System.out.println(t1.getId());
		System.out.println(t2.getId());

	}

}
