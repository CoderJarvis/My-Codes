package _01_PracticeConcept;

class MyThread10_1 implements Runnable
{

	public void run()
	{
		while(true)
		{
			System.out.println("111111111111");
		}
	}
	
}

class MyThread10_2 implements Runnable
{

	public void run()
	{
		while(true)
		{
			System.out.println("999999999999");
		}
	}
	
}

public class _10_ThreadByImplementingRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread10_1 ob=new MyThread10_1();
		MyThread10_2 ob1=new MyThread10_2();
		
		Thread t1=new Thread(ob);
		Thread t2=new Thread(ob1);
		
		t1.start();
		t2.start();
		
		
	

	}

}
