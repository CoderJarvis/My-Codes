package _01_PracticeConcept;
class MyThread12 extends Thread
{
	public MyThread12(String s)
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

public class _12_Thread_Priorities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread12 t1=new MyThread12("111111111111");
		MyThread12 t2=new MyThread12("222222222222");
		MyThread12 t3=new MyThread12("444444444444");
		MyThread12 t4=new MyThread12("555555555555");
		MyThread12 t5=new MyThread12("777777777777");
		
		t1.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t4.setPriority(Thread.MIN_PRIORITY);
		t5.setPriority(Thread.MAX_PRIORITY);
		
	//	System.out.println(t5.getPriority());
	//	System.out.println(t1.getPriority());
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		

	}

}
