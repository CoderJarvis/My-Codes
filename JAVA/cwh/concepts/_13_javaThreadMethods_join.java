package _01_PracticeConcept;
class MyThread13 extends Thread
{
	public void run()
	{
		for(int i=0;i<4000;i++)
		{
			System.out.println(i);
		}
	}
}
class MyThread13_2 extends Thread
{
	public void run()
	{
		for(int i=6000;i<9999;i++)
		{
			System.out.println(i);
		}
	}
}
public class _13_javaThreadMethods_join {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		MyThread13 t1=new MyThread13();
		MyThread13_2 t2= new MyThread13_2();
		t1.start();
		try
		{
			t1.join(); //here t1.start() completes then t2.start() will execute
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	
		
		
		
		
		
		
		t2.start();

	}

}
