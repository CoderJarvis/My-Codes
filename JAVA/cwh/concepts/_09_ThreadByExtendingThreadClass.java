package _01_PracticeConcept;

class MyThread9_1 extends Thread
{
	public void run()
	{
		while(true)
		{
			System.out.println("11111111111");
		}
	}
}

class MyThread9_2 extends Thread
{
	public void run()
	{
		while(true)
		{
			System.out.println("22222222222");
		}
	}
}

public class _09_ThreadByExtendingThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread9_1 ob=new MyThread9_1();
		MyThread9_2 ob1=new MyThread9_2();
		
		ob.start(); //both threads are calling each functions 
		ob1.start();//in round robin manner
		
	//	ob.run();//if both are normal classes only 11111111 will be printed infinitely
	//	ob1.run(); 

	}

}
