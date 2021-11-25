package _01_PracticeConcept;
class MyThread14 extends Thread
{
	public void run()
	{
		for(int i=0;i<4000;i++)
		{	
			try
			{
				Thread.sleep(5);
			}
			
			catch(Exception e) //here t1 therad sleeps for 500miilisecond
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
}
class MyThread14_2 extends Thread
{
	public void run()
	{
		for(int i=6000;i<9999;i++)
		{
			System.out.println(i);
		}
	}
}

public class _14_javaThreadMethods2_sleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread14 t1=new MyThread14();
		MyThread14_2 t2= new MyThread14_2();
		
		t1.start();
		t2.start();
	}

}
